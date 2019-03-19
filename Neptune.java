class Neptune implements Planet {
	long distance = 4300000000l;
	public void timeToTravelFromEarth(){
		/* Used in subclass */
	}
	public void timeToTravelToEarth(){
	int timeHours = (int) (((distance / 299792) / 60) / 60); /* km/kms /m /t */
	System.out.println("Sõit Neptunist Maale valguse kiirusega võtab " + timeHours + " tundi.");  
	}
}