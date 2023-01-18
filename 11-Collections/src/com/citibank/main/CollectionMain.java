package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main start ");
		System.out.println("1. ArrayList ");
		List<String> namelist = new ArrayList<String> ();
		System.out.println("Name List Size - " + namelist.size());
		System.out.println("Name List  - " + namelist);
		
		
		namelist.add("Rahul");
		namelist.add("Prashant");
		namelist.add("Anuj");
		
		System.out.println("Name List Size - " + namelist.size());
		System.out.println("Name List  - " + namelist);
		System.out.println("Name at index 2  - " + namelist.get(2));
		namelist.remove(2);
		System.out.println("Name List Size After Remove - " + namelist.size());
		System.out.println("Name List After Remove - " + namelist);
		namelist.add("Rahul");
		System.out.println("Name List Size After Add - " + namelist.size());
		System.out.println("Name List After Add - " + namelist);
		
		System.out.println("----------Array List End----------");
		
		System.out.println("2. HashSet");
		Set<Integer> numberset = new HashSet<Integer> ();
		
		System.out.println("Set Size - " + numberset.size());
		System.out.println("Number Set - " + numberset);
		numberset.add(102);
		numberset.add(101);
		numberset.add(103);
		numberset.add(101);
		numberset.add(105);
		numberset.add(101);
		numberset.add(106);
		numberset.add(107);
		
		System.out.println("After Adding");
		System.out.println("Set Size - " + numberset.size());
		System.out.println("Number Set - " + numberset);
		
		numberset.remove(101);
		
		System.out.println("After Removing");
		System.out.println("Set Size - " + numberset.size());
		System.out.println("Number Set - " + numberset);
		
		System.out.println("----------Hash  Set End----------");
		
		System.out.println("3. TreeSet");
		Set<String>  nameTreeset = new TreeSet<String>() ;
		System.out.println("Tree Set Size - " + nameTreeset.size());
		System.out.println("Name Tree Set - " + nameTreeset);
		
		nameTreeset.add("AC");
		nameTreeset.add("AA");
		nameTreeset.add("CD");
		nameTreeset.add("EC");
		nameTreeset.add("CA");
		nameTreeset.add("AC");
		
		
		System.out.println("After Adding");
		System.out.println("Tree Set Size - " + nameTreeset.size());
		System.out.println("Name Tree Set - " + nameTreeset);
		
		nameTreeset.remove("AC");
		
		System.out.println("After Removing");
		System.out.println("Tree Set Size - " + nameTreeset.size());
		System.out.println("Name Tree Set - " + nameTreeset);
		
		System.out.println("Main End ");

	}

}
