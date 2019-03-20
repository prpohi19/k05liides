class Mars implements Planet {
	int distance = 54600000;
	int timeHours = distance / 58000;
	int days = timeHours / 24;
	public void timeToTravelFromEarth(){
	System.out.println("Sõit Maalt Marssile kiirusega 58000 km/t võtab " + days + " päeva.");
	}
	public void timeToTravelToEarth(){
		/* Used in subclass */
	}	
}