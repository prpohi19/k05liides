class subNeptune extends Neptune {
	@Override
	public void timeToTravelFromEarth(){
		int fastestSpaceCraftSpeed = 266000; /* km/h */
		double hours = distance / fastestSpaceCraftSpeed;
		int timeDays = (int) hours / 24;
		System.out.println("Sõit kõige kiirema lennukiga Maast Neptunile võtab " + timeDays + " päeva.");
	}	
}