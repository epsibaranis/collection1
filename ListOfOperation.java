package Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ListOfOperation {
	Scanner obj;
	   ArrayList<Integer> a1;
	   public ListOfOperation() {
		   obj=new Scanner(System.in);
		   a1=new ArrayList<Integer>();
	   }
	   public void addElement() {
		   int number=obj.nextInt();   
	       a1.add(number);}
	   public void print() {
		   System.out.println(a1);
	   }
	   public int count(int a) {
		   int b=0;
		   for(int i=0;i<a1.size();i++) {
			   if(a==a1.get(i))
				   b++;
		   }
		   return b;
	   }
	   public void uniquevalue() {
		   HashSet<Integer> a2=new HashSet(a1);
		   System.out.println(a2);
	   }
	   public void frequencyCount() {
		   for (int i=0;i<a1.size();i++) {
			   int b=0;
			   for(int j=0;j<a1.size();j++) {
				   if (a1.get(i)==a1.get(j)) 
					   b++;
				   }
			   System.out.println(a1.get(i)+"count of the list   :"+b);
		   }
	   }
}
