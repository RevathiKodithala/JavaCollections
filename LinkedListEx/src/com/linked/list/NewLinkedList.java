package com.linked.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class NewLinkedList {

	public static void main(String[] args) {
			
				//Declare ArrayList
				//LinkedList <Integer> l=new LinkedList<Integer>();
				//LinkedList <String> l=new LinkedList<String>();
				//List l=new LinkedList();
				
				LinkedList l=new LinkedList();
						
				//Add new elements to the Linkedlist
				l.add(100);
				l.add("welcome");
				l.add(15.5);
				l.add('A');
				l.add(true);
				
				System.out.println(l); //[100, welcome, 15.5, A, true]
				
				//size()
				System.out.println("Number of elements in Linked list:"+l.size()); //5
				
				//remove
				l.remove(1); // here 1 is index
				//al.remove("welcome");  // here welcome is element
				System.out.println("After removing element from Linked list:"+l); //[100, 15.5, A, true]
				
				//insert a new element
				//add(index, object)
				l.add(2,"Python");
				System.out.println("After insertion:"+l); //[100, 15.5, Python, A, true]
				
				//retreive specific element
				System.out.println(l.get(2)); // Python, here 2 is index of element/object
				
				//change element/replace 
				l.set(2, "C#");
				System.out.println("After replacing element:"+ l); //[100, 15.5, C#, A, true]
				
				//search - contains() - Returns true/ false
				System.out.println(l.contains("C#")); //true
				System.out.println(l.contains("C++")); // false
				
				//isEmpty()
				System.out.println(l.isEmpty());//false
				
				
				// 1) for loop
				System.out.println("Reading elements using for loop.......");
				
				for(int i=0;i<l.size();i++)
				{
					System.out.println(l.get(i));
				}
				
					
				// 2) for..each loop
				System.out.println("Reading elements using for..each loop");
				for(Object e:l)
				{
					System.out.println(e);
				}
						
				//3) iterator()
				System.out.println("Reading elements using iterator method");
				
				Iterator it=l.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next()); //printing the element and move to next 
				}
				
				System.out.println("Elements in the linked list:"+l); //[X, Y, Z, A, B, C]
				
				
				Collections.sort(l);
				System.out.println("Elements in the linked list after sorting:"+l); //[A, B, C, X, Y, Z]

				Collections.sort(l,Collections.reverseOrder());
				System.out.println("Elements in the linked list after sorting in reverse order:"+l); //[Z, Y, X, C, B, A]
				
				//Shuffling - Collections. shuffle()
				
				Collections.shuffle(l);
				System.out.println("Elements in the linked list after Shuffling:"+l); //[A, C, X, B, Y, Z]
				
				
				l.addFirst("a");
				l.addLast("Hello");
				
				System.out.println("After adding First & Last Elements:"+l);

				System.out.println(l.getFirst());  // Get first element
				System.out.println(l.getLast());  // get last element
				
				l.removeFirst();
				l.removeLast();
				
				System.out.println("After removing First & Last Elements:"+l);
			}


	}
