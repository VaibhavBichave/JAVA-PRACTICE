
//Assignment 10
//Author  : Vaibhav Sanjay Bichave
//Roll No.:23209
//Batch   : E10
//PROBLEM STATEMENT :
/* Implement a factory design pattern for the given context . Consider Car building process ,
*  which requires many steps from allocating accessories to final makeup. These steps should 
*  be written as methods and should be called while creating an instance of specific  car type. 
*  Hatchback, Sedan, SUV , could be the subclasses Car class. Car class and Car class its subclasses
*   , CarFactory and Test Factory Pattern should be implemented */

package assignment;
enum CarType {
	SEDAN,HATCHBACK,SUV;
}

abstract class Car1 {
	
	CarType model=null;
	 Car1(CarType model){
		this.model=model;
	}
	
	void SetCartype(CarType model){
		this.model=model;
	}
	
	CarType getCartype(){
		return model;
	}
	
	
	protected abstract void construct();

}

class suv extends Car1
{
	suv(){
		super(CarType.SUV);
		construct();
		accessories();
	}
	
	protected void construct(){
		System.out.println("\n\n--------------------------------------");
		System.out.println(" Constructing SUV Car ");
	}
	
	void accessories() {
		System.out.println("--------------------------------------");
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- YES");
		System.out.println("Back Wiper- YES");
		System.out.println("Side Mirror- Two");
		System.out.println("Touch Screen Music Player- YES");
		System.out.println("Roof Window- YES");
		System.out.println("Automotive Garbage Cans- NO");
		System.out.println("Automotice Air Freshner- YES");
		System.out.println("Button Start- YES");
		System.out.println("--------------------------------------");
	}
}

class sedan2 extends Car1
{
	sedan2(){
		super(CarType.SEDAN);
		construct();
		accessories();
	}
	
	protected void construct(){
		System.out.println("\n\n--------------------------------------");
		System.out.println(" Constructing sedan car ");
	}
	
	void accessories() {
		System.out.println("--------------------------------------");
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- YES");
		System.out.println("Back Wiper- NO");
		System.out.println("Side Mirror- ONE");
		System.out.println("Touch Screen Music Player- YES");
		System.out.println("Roof Window- YES");
		System.out.println("Automotive Garbage Cans- YES");
		System.out.println("Automotice Air Freshner- NO");
		System.out.println("Button Start- YES");
		System.out.println("--------------------------------------");
	}
}

class hatchback1 extends Car1{
	
	hatchback1(){
		super(CarType.HATCHBACK);
		construct();
		accessories();
	}
	
	protected void construct(){
		System.out.println("\n\n--------------------------------------");
		System.out.println(" Constructing Hatchback Car ");
	}
	
	void accessories() {
		System.out.println("--------------------------------------");
		System.out.println("Types of Tyres- Alloy Wheels");
		System.out.println("Airbags- YES");
		System.out.println("Back Wiper- YES");
		System.out.println("Side Mirror- one");
		System.out.println("Touch Screen Music Player- NO");
		System.out.println("Roof Window- YES");
		System.out.println("Automotive Garbage Cans- YES");
		System.out.println("Automotice Air Freshner- NO");
		System.out.println("Button Start- YES");
		System.out.println("--------------------------------------");
	}
}

 class Carfacory {

	public static Car1 buildcar(CarType model){
		Car1 c=null;
		
		switch(model){
		case  SUV:
			c=new suv() ;
			break;
		case SEDAN:
			c=new sedan2();
			break;
		case HATCHBACK:
			c=new hatchback1();
			break;
		default :
			System.out.println("Invalid CarType ");
		}
		
		return c;
	}
}


public class Factory {

	public static void main(String args[])
	{
		System.out.println(Carfacory.buildcar(CarType.HATCHBACK));
		System.out.println(Carfacory.buildcar(CarType.SEDAN));
		System.out.println(Carfacory.buildcar(CarType.SUV));
	}

}


/*
  
 ##OUTPUT##
 

--------------------------------------
 Constructing Hatchback Car 
--------------------------------------
Types of Tyres- Alloy Wheels
Airbags- YES
Back Wiper- YES
Side Mirror- one
Touch Screen Music Player- NO
Roof Window- YES
Automotive Garbage Cans- YES
Automotice Air Freshner- NO
Button Start- YES
--------------------------------------
assignment.hatchback1@17a7cec2


--------------------------------------
 Constructing sedan car 
--------------------------------------
Types of Tyres- Alloy Wheels
Airbags- YES
Back Wiper- NO
Side Mirror- ONE
Touch Screen Music Player- YES
Roof Window- YES
Automotive Garbage Cans- YES
Automotice Air Freshner- NO
Button Start- YES
--------------------------------------
assignment.sedan2@6f539caf


--------------------------------------
 Constructing SUV Car 
--------------------------------------
Types of Tyres- Alloy Wheels
Airbags- YES
Back Wiper- YES
Side Mirror- Two
Touch Screen Music Player- YES
Roof Window- YES
Automotive Garbage Cans- NO
Automotice Air Freshner- YES
Button Start- YES
--------------------------------------
assignment.suv@50040f0c

*/