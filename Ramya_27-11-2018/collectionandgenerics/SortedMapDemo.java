package com.tharanga.collectionandgenerics;

import java.time.LocalDate;
import java.util.SortedMap;
import java.util.TreeMap;

class PersonalDetails {
	String occupation;
	LocalDate dataOfBirth;
	String city;

	public PersonalDetails(String occupation, LocalDate dataOfBirth, String city) {
		this.occupation = occupation;
		this.dataOfBirth = dataOfBirth;
		this.city = city;
	}

	@Override
	public String toString() {
		return this.occupation + ", from " + this.city;
	}
}
public class SortedMapDemo {
public static void main(String args[])
{
	SortedMap<String, PersonalDetails> personMap = new TreeMap<>();
	personMap.put("Ravi", new PersonalDetails("Developer", LocalDate.of(1964, 6, 22), "Mysore"));
	personMap.put("Prasanna", new PersonalDetails("Testing", LocalDate.of(1905, 2, 2), "Karnataka"));
	personMap.put("Divya", new PersonalDetails("Trainee", LocalDate.of(1970, 12, 11), "Mumbai"));

	personMap.keySet().forEach(key -> {
		System.out.println(key + " -> " + personMap.get(key));
	});
}
}
