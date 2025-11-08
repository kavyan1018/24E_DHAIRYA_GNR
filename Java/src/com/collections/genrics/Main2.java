package com.collections.genrics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
	
	public void add() {
		System.out.println("veh add");
	}
}

class Audi extends Vehicle{
	
	public void add() {
		System.out.println("veh add");
	}
}

class Merc extends Vehicle{
	
	public void add() {
		System.out.println("merc add");
	}
}
public class Main2 {

	
	public static void main(String[] args) {
		
		
		
		List<? super Vehicle> basket = new ArrayList<>();
		
		basket.add(new Merc());
		basket.add(new Audi());
		
		for(Object veh:basket) {
			
//            ((Fruit) fruit).eat();
            ((Vehicle) veh).add();
            //((Vehicle)veh.add();
		}
		
		
		
	}
}
