package com.celcom.Assignment1;
import java.util.Scanner;


class Library
{
	String title;
	String author;
	int ISBN;
	Library(String title,String author,int ISBN){
		this.author=author;
		this.title=title;
		this.ISBN=ISBN;
		}
	
	void addBooks()
	{
		System.out.println("The book added is: "+title);
		System.out.println("The author and ISBN: "+author+" "+ISBN);
	}
	void removeBooks(String tit1,String auth1,int Isbn)
	{
		System.out.println("Removed book is: "+tit1);
		System.out.println("It's author is: "+auth1);
		System.out.println("ISBN: "+Isbn);
	}
}
public class Books {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the book to be added: ");
		String title=sc.next();
		String author=sc.next();
		int ISBN=sc.nextInt();
		
		Library book=new Library(title,author,ISBN);
		book.addBooks();
		book.removeBooks("C","Dennis",9084);
		
		
	}

}
