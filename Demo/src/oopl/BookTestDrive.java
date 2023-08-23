package oopl;
class Book{
String title;
String author;
}
public class BookTestDrive {
	public static void main(String [] args) {
		Book [] myBooks =new Book[3];
		int x=0;
		for (int i=0;i<3;i++) {
			 myBooks[i]=new Book();
		}
		myBooks[0].title="The Graph of Java";
		myBooks[1].title="The java Gaveby";
		myBooks[2].title="The java Cookbook";
		myBooks[0].author="bob";
		myBooks[1].author="sue";
		myBooks[2].author="ian";
		while(x<3) {
			System.out.println(myBooks[x].title+" by "+myBooks[x].author);
			x=x+1;
		}
	}
}
