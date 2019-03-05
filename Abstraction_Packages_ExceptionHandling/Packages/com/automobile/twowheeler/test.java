package com.automobile.twowheeler;
class test{
	public static void main(String[] args) {
		Hero obj1 = new Hero();
		Honda obj2 = new Honda();

		//Hero
		System.out.println(obj1.getModelName());
		System.out.println(obj1.getRegistrationNumber());
		System.out.println(obj1.getOwnerName());
		System.out.println(obj1.getSpeed());
		obj1.radio();

		System.out.println();

		//Honda
		System.out.println(obj2.getModelName());
		System.out.println(obj2.getRegistrationNumber());
		System.out.println(obj2.getOwnerName());
		System.out.println(obj2.getSpeed());
		obj2.cdplayer();

	}
}