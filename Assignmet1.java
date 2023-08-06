package cgi.b3;
import java.io.*;
import java.util.*;
public class Assignmet1 {

		
		public static void main(String[] args) throws IOException {
			List<String> top = new ArrayList<>();
			Scanner scc = new Scanner(System.in);
			System.out.println("Enter your State: ");
			String s1 = scc.nextLine();
			top.add(s1);
			System.out.println("Enter your house name: ");
			String s2 = scc.nextLine();
			top.add(s2);
			System.out.println("Enter your flat No: ");
			String s3 = scc.nextLine();
			top.add(s3);
			System.out.println("Enter your Office Name: ");
			String s4 = scc.nextLine();
			top.add(s4);
			
		
			System.out.println("Enter your Seller Name: ");
			String sl = scc.nextLine();

			System.out.println("PLease enter the Location: ");
			String s5 = scc.nextLine();
			
			System.out.print("Please enter the non negative area: ");
			int a = scc.nextInt();
			
			System.out.println("Please enter the Expected Price: ");
			double exP = scc.nextDouble();
			
			System.out.println("State is: " + top);
			System.out.println("House name is: " + a);
			System.out.println("Flat no is: " + s5);
			System.out.println("Office name is: " + a);
			
			System.out.println("Area is: " + a);
			System.out.println("Location  is: " + s5);
			System.out.println("Expected Pric is: "+exP);
			System.out.println("Seller Name"+sl);
			

		}

	}