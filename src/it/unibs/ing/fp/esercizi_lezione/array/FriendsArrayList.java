package it.unibs.ing.fp.esercizi_lezione.array;

import java.util.*;

public class FriendsArrayList {

	public static void main(String[] args) {
		
		List<String> friends=new ArrayList<String>();

		friends.add("Rachel");
		friends.add("Monica");
		friends.add("Joey");

		System.out.println(friends);
		friends.add(0,"Ross");
		System.out.println("Add: " +friends.get(1));
		
		friends.remove(1);
		System.out.println("Remove 1: " + friends.get(1));

		friends.remove("Ross");
		System.out.println("Remove Ross: "+ friends.get(1));

		
		System.out.println("Size: "+friends.size());
		System.out.println(friends.get(friends.size()-1));

		friends.set(1,"Chandler");
		System.out.println("Set: "+ friends.get(1));
		
		System.out.println("Friends:");
		for(String e: friends)
			System.out.print(e+" ");
		
	}

}
