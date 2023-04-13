package com.arraylist.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NewArrayList {

	public static void main(String[] args) {
	//###  declare arraylist
		//List arr=new ArrayList();
		//ArrayList arr=new ArrayList();
		ArrayList<String> arr=new ArrayList<String>();
		//adding elements
		  arr.add("C");
		  arr.add("C++");
		  arr.add("Java");
		  arr.add("Python");
		  arr.add("Mysql");
		  arr.add(5, "Ruby");
	
	//### print arraylist
	System.out.println(arr);
	
	
	//removing elemets
	arr.remove(0);
	System.out.println(arr);
	
	
	System.out.println(arr.isEmpty());
	
	System.out.println(arr.contains("Ruby"));
	
	//using iterator
	Iterator itr=arr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	//for each loop
	for(String st:arr) {
		System.out.println(st);
	}
	
	//using for loop
	for(int i=0;i<arr.size();i++) {
		System.out.println(arr.get(i));
	}
	
	//Sorting
	Collections.sort(arr,Collections.reverseOrder());
	System.out.println(arr);
	
	//shuffling
	Collections.shuffle(arr);
	System.out.println(arr);
	}
	
}
