package main.java.algorythmexcercises;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

class StreamFilteringListOfStrings {
    public static void main(String[] args) {
        List<String> countries = List.of("Morocco", "Italy", "Brazil","Mexico", "Australia", "Germany", "South Africa", "Madagascar");
        List<String> filteredCountries = countries.stream().filter(f -> f.startsWith("M")).collect(Collectors.toList());
    System.out.println(filteredCountries);
    }
    
    @Test
    public void testFilteredCountriesStartingWithM() {
        // Creating the mock of original collection of countries
        List<String> countries = List.of("Morocco", "Italy", "Brazil","Mexico", "Australia", "Germany", "South Africa", "Madagascar");
        //When
        List<String> filteredCountries = countries.stream().filter(f -> f.startsWith("M")).collect(Collectors.toList());
        //Then
        List<String> expectedCountries = List.of("Morocco", "Mexico", "Madagascar");
        assertEquals(expectedCountries, filteredCountries, "The filtered countries starting with 'M' are: ");
        
    }

	private void assertEquals(List<String> expectedCountries, List<String> filteredCountries, String string) {
		// TODO Auto-generated method stub
		
	}
}
/*
public class FilteringCountriesTest {
    @Test
    public void testFilteredCountriesStartingWithM() {
        // Creating the mock of original collection of countries
        List<String> countries = List.of("Morocco", "Italy", "Brazil","Mexico", "Australia", "Germany", "South Africa", "Madagascar");
        //When
        List<String> filteredCountries = countries.stream().filter(f -> f.startsWith("M")).collect(Collectors.toList());
        //Then
        List<String> expectedCountries = List.of("Morocco", "Mexico", "Madagascar");
        assertEquals(expectedCountries, filteredCountries, "The filtered countries starting with 'M' are: ");
        
    }

	private void assertEquals(List<String> expectedCountries, List<String> filteredCountries, String string) {
		// TODO Auto-generated method stub
		
	}
}*/