package main.java.algorythmexcercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

/* The first version
class VisitCounter1 {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        // Create a stream of all maps
        Stream<Map<String, UserStats>> mapStream = Arrays.stream(visits);

        // Filter out faulty entries (null maps, non-parseable keys, and empty UserStats)
        Map<Long, Long> result = mapStream
                .filter(Objects::nonNull) // Skip null maps
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> isValidKey(entry.getKey()))
                .filter(entry -> entry.getValue() != null && entry.getValue().getVisitCount().isPresent())
                .collect(Collectors.groupingBy(
                        entry -> Long.parseLong(entry.getKey()),
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
}*/