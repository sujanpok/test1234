package com.example.demo.model;

import java.util.Scanner;

public class DbeanMain {
	public static void hell() { Dbean bee = new Dbean();
	try (Scanner myObj = new Scanner(System.in)) {
		String inputname = myObj.next();
		String inputadress = myObj.next();
		int inputage = myObj.nextInt();
		int inputphno = myObj.nextInt();
bee.setName(inputname);
bee.setAdress(inputadress);
bee.setAge(inputage);
bee.setPhno(inputphno);
	}
	System.out.println(bee.getName());
System.out.println(bee.getAge());
System.out.println(bee.getPhno());
System.out.println(bee.getAdress());
}
public static void main(String[] args) {
hell();
}
}