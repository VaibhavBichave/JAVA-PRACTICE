package oopl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Movie {
	String date, name, status;

	Movie get(String name, String date, String status) {
		this.name = name;
		this.date = date;
		this.status = status;
		return this;
	}

	void display() throws Exception {
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = formatter1.parse(date);
		System.out.println();
		System.out.println("Name of Movie ::" + name);
		System.out.println("Status of Movie ::" + status);
		System.out.println("Date of Release ::" + date1);
	}

	public static void main(String[] args) throws Exception {
		String date, name, status;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter movie name ::");
		name = sc.next();
		System.out.print("Enter status ::");
		status = sc.next();
		System.out.print("Enter date(dd/mm/yyyy) ::");
		date = sc.next();
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = formatter1.parse(date);
		sc.close();
		Movie movie = new Movie();
		movie.get(name, date, status);
		movie.display();

	}

}
