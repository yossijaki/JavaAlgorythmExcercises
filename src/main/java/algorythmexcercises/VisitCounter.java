package main.java.algorythmexcercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
The system you work with on a daily basis runs multiple microservices.
You have been asked to prepare an aggregation that represents the number of user visits to all microservices, for use by data analysts.
The architect you're working with has already designed the API, which consists of a single class: 
VisitCounter. VisitCounter has a single method, count.
It returns Map<Long, Long>  - this map should contain the number of visits by the user with a given ID.
This method accepts an array of Map<String, UserStats>. Every map represents the total number of visits per user to a given microservice.
There are some problems, however:
    • The map key, which is a String, should be parseable to Long – but it not be. You must skip any such faulty entries.
    • For some keys, UserStats may be null. You must skip any such faulty entries.
    • UserStats has a single field, visitCount, of type Optional<Long>. A getter for this field is also implemented. This field will never be null; however, it might be empty. You must skip any such faulty entries.

Remember that you may receive some invalid input:  null, empty maps, and so on. Handle it all appropriately and return an empty map.
Assumptions
    • The UserStats class is already implemented. You do not have to write the implementation of this class as a part of your solution.
Available packages and libraries
    • You may use Java 8 Streams API to implement your solution.
*/

class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        // Early exit if all input maps are empty or null
        if (Arrays.stream(visits).allMatch(map -> map == null || map.isEmpty())) {
            return Collections.emptyMap();
        }

        // Create a stream of all valid entries
        Stream<Map.Entry<Long, UserStats>> entryStream = Arrays.stream(visits)
                .filter(Objects::nonNull)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> isValidKey(entry.getKey()))
                .filter(entry -> entry.getValue() != null && entry.getValue().getVisitCount().isPresent())
                .map(entry -> new AbstractMap.SimpleEntry<>(Long.parseLong(entry.getKey()), entry.getValue()));

        // Collect valid entries into a map
        Map<Long, Long> result = entryStream
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.summingLong(entry -> entry.getValue().getVisitCount().orElse(0L))
                ));

        return result;
    }

    private boolean isValidKey(String key) {
        try {
            Long.parseLong(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}