package com.automobile.twowheeler;
class Hero extends com.automobile.Vehicle{

	
	public String getModelName(){
		return "Hero Corp" ;
	}

	public String getRegistrationNumber(){
		return "1002345";
	}

	public String getOwnerName(){
		return "Amitabh Bachan";
	}

	public int getSpeed(){
		return 60;
	}

	public void radio(){
		System.out.println("Radio");
	}
}
