package javaNetworkingday6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Humandemo {

	public static void main(String[] args) throws IOException {
		// create object for the class
		Human firstHuman=new Human();
		firstHuman.name="Ashok";
		
		Human secondHuman=new Human();
		secondHuman.name="Ajay";
		//create an array of human objects
		
		Human [] associates=new Human[6];
		associates[0]=firstHuman;
		associates[1]=secondHuman;
		
		//create input stream reader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int counter=2;counter<6;counter++) {
			System.out.println("Enter the name:");
			associates[counter]=new Human();
			
			//set the properties
			associates[counter].name=br.readLine();
		}
		
		//display all names
		for(Human associate: associates) {
			System.out.println(associate.name);
			System.out.println("Hands:"+Human.hands);
			System.out.println("Legs:"+Human.legs);
			
		}

	}

}
