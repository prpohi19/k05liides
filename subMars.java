class subMars extends Mars {
	@Override
	public void timeToTravelToEarth(){
		int timeMinutes = (int) (((distance / 299792) / 60)); /* km/s /m */
	System.out.println("Sõit Marsist Maale tagasi sama kiirusega võtab " + timeMinutes + " minutit.");
	}	
}