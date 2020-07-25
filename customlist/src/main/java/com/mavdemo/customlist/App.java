package com.mavdemo.customlist;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


interface opns
{
	public void fetch(List<Integer> obj);
	public void append(List<Integer> obj);
	public void rem(List<Integer> obj);
	public void print(List<Integer> obj);
}
public class App implements opns
{
    public static void main( String[] args )
    {
    	opns a=new App();
    	int ch;
    	List<Integer> obj = new LinkedList<Integer>(); 
    	obj.add(2); 
        obj.add(3);  
        ((LinkedList<Integer>) obj).addFirst(1); 
        obj.add(4); 
        obj.add(5); 
        obj.add(6); 
        obj.add(7); 
        obj.add(8); 
        obj.add(9); 
        ((LinkedList<Integer>) obj).addLast(10);
    	Scanner sc=new Scanner(System.in);
    	do
    	{
        System.out.println( "Menu for list operations:");
        System.out.println( "1.Fetch an element");
        System.out.println( "2.Add an element");
        System.out.println( "3.Delete an element");
        System.out.println( "4.Display the list");
        System.out.println( "5.Exit");
        System.out.println( "Enter your choice:");
        ch=sc.nextInt();
        
        switch(ch)
        {
        case 1:a.fetch(obj);break;
        case 2:a.append(obj);break;
        case 3:a.rem(obj);break;
        case 4:a.print(obj);break;
        case 5:System.exit(0);
        }
    	}while(ch!=5);
        sc.close();
    }
    
    public void fetch(List<Integer> obj)
    {
    	Scanner sc1=new Scanner(System.in);
    	System.out.println( "Enter the index of the element to be fetched");
    	int c = sc1.nextInt();
    	Integer no=obj.get(new Integer(c));
    	System.out.println("The element is "+no);
    	sc1.close();
    }
    public void append(List<Integer> obj)
    {
    	Scanner sc2=new Scanner(System.in);
    	System.out.println( "Enter the element to be added");
    	int c = sc2.nextInt();
    	obj.add(new Integer(c));
    	sc2.close();
    }
    public void rem(List<Integer> obj)
    {
    	Scanner sc3=new Scanner(System.in);
    	System.out.println( "Enter the index of the element to be deleted");
    	int c = sc3.nextInt();
    	obj.remove(new Integer(c));
    	sc3.close();
    }
    public void print(List<Integer> obj)
    {
    	Iterator<Integer> iterator = obj.listIterator();
    	while (iterator.hasNext()) {
    	    System.out.println(iterator.next());
    	}

    }

	
}
