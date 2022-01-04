package org.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class SampleProject {
   public static void main(String[] args) {
	
	  java.util.List<Integer> l=new ArrayList<>();
	  
	  l.add(100);
	  l.add(200);
	  l.add(300);
	  l.add(400);
	  l.add(500);
	  l.add(600);
	   
	   ListIterator<Integer> listIterator = l.listIterator();
	   
	   System.out.println("has next");
	   while (listIterator.hasNext()) {
		Integer integer = (Integer) listIterator.next();
		System.out.println(integer);
		
	}
	   System.out.println("has previous");
	   while (listIterator.hasPrevious()) {
		Integer integer = (Integer) listIterator.previous();
		System.out.println(integer);
		
		if (integer==200) {
			listIterator.remove();
		}
	}
	   System.out.println(l);
}
	}
	
	
	
	
	
	

