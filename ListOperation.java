package Main;

import java.util.*;
import java.util.Scanner;
public class ListOperation {
   Scanner obj;
   ArrayList<Integer> a1;
   public ListOperation() {
	   obj=new Scanner(System.in);
	   a1=new ArrayList<Integer>();
   }
   public void addElement() {
	   int number=obj.nextInt();   
       a1.add(number);}
   public void print() {
	   System.out.println(a1);
   }
   public Integer bOfEle() {
	   int b=0;
	   for(int i=0;i<a1.size();i++) {
		   b=(b>a1.get(i))?b:a1.get(i);
	   }
	   return b;
   }
   public Integer sOfEle() {
   int b=999;
   for(int i=0;i<a1.size();i++) {
	   b=(b<a1.get(i))?b:a1.get(i);
   }
   return b;
    }
   public boolean find(Integer c) {
	   for(int i=0;i<a1.size();i++) {
		   if (c==a1.get(i))
				   return true;	  }
	   return false;
	    }
}
