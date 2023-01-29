package Main;

import java.util.*;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		ArrayList<String> a1=new ArrayList<String>();
		for(int i=0;i<10;i++) {
			System.out.println("Enter the name");
			String name=obj.nextLine();
			a1.add(name);
		}
		System.out.println("");
		System.out.println("ArrayList is "+a1);
	}

}