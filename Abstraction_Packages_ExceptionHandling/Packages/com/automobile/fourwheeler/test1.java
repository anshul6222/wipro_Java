package com.automobile.fourwheeler;
class test1{

public static void main(String[] args) {
		Logan obj1 = new Logan();
		Ford obj2 = new Ford();

		//Hero
		System.out.println(obj1.getModelName());
		System.out.println(obj1.getRegistrationNumber());
		System.out.println(obj1.getOwnerName());
		System.out.println(obj1.speed());
		obj1.gps();
		System.out.println();

		//Honda
		System.out.println(obj2.getModelName());
		System.out.println(obj2.getRegistrationNumber());
		System.out.println(obj2.getOwnerName());
		System.out.println(obj2.speed());
		obj2.tempControl();

	}
}