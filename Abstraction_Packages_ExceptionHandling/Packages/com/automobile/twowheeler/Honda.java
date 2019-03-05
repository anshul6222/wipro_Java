package com.automobile.twowheeler;
class Honda extends com.automobile.Vehicle{

	public String getModelName(){
		return "Honda Corp" ;
	}

	public String getRegistrationNumber(){
		return "1972345";
	}

	public String getOwnerName(){
		return "Tom Cruise";
	}

	public int getSpeed(){
		return 110;
	}

	public void cdplayer(){
		System.out.println("Cd Player");
	}
}