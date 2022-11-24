package com.spring.beans.ci.third;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExample {
	List<String> myList;
	Set<String> mySet;
	Map<String, String> myMap;
	
	public CollectionExample(List<String> myList) {
		super();
		this.myList = myList;
	}

	public CollectionExample(Set<String> mySet) {
		super();
		this.mySet = mySet;
	}

	public CollectionExample(Map<String, String> myMap) {
		super();
		this.myMap = myMap;
	}
	
	public void printList() {
		System.out.println("List items");
		myList.forEach(item -> {System.out.println(item + " ");});
	}
	
	public void printSet() {
		System.out.println("Set items");
		mySet.forEach(item -> {System.out.println(item + " ");});
	}
	
	public void printMap() {
		System.out.println("Map items");
		myMap.forEach((k, v) -> {System.out.println("Key : " + k + " Value : " + v);});
	}
	
}
