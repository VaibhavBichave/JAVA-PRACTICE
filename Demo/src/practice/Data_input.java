package practice;
import java.util.Scanner;
import java.util.*;

class date_input{
	int dd;
	int mm;
	String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Date: ");
		dd = sc.nextInt();
		System.out.print("Enter Month: ");
		mm = sc.nextInt();
	}
	void display() {
		System.out.println("Date is: "+dd);
		System.out.println("Month is: "+month[mm-1]);
	}
}

class displ_date extends date_input{
	int yyyy;
	int days;
	void input(){
		//super.input();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		yyyy = sc.nextInt();
		if(mm==1||mm==3||mm==5||mm==7||mm==8||mm==10||mm==12) {
			days = 31;
		}
		else if(mm==2) {
			if(yyyy%4==0) {days = 29;}
			else {days = 28;}
		}
		else
			days = 30;
	}
	void display() {
		//super.display();
		System.out.println("Year is: "+yyyy);
		System.out.println("No. of Days is: "+days);
	}
}

public class Data_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		date_input obj1 = new date_input();	//creating object of parent class/
		displ_date obj2 = new displ_date();	//creating object of inherited class//
		obj1.input();	//calling input method of parent class//
		obj2.input();	//calling input method of inherited class//
		obj1.display();	//calling display method of parent class//
		obj2.display();	//calling display method of inherited class//
		
		Calendar cal = Calendar.getInstance();
		System.out.println("The Date is: "+cal.get(Calendar.DATE));
		System.out.println("The Month is: "+cal.get(Calendar.MONTH));
		System.out.println("The Year is: "+cal.get(Calendar.YEAR));

	}

}