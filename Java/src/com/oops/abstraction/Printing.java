package com.oops.abstraction;

import java.io.Serializable;

//functional interface
//interface which has only 1 method called functionl interface....

@FunctionalInterface
interface Prints {

	void print();
//	void print1();
}

//MARKER INTERFACE ://interfae which has no method or any of impl....
//serilizible, clonable
interface Addon{
	
	
}

public class Printing implements Serializable{

}
