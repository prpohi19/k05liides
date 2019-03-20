class Main {
	public static void main(String[] args) {
		
	Mars m = new Mars();
	Neptune n = new Neptune();
	subMars sm = new subMars();
	subNeptune sn = new subNeptune();
	m.timeToTravelFromEarth();
	n.timeToTravelToEarth();
	sm.timeToTravelToEarth();
	sn.timeToTravelFromEarth();
	
	double distanceBetweenPlanets = (n.distance - m.distance);
	System.out.println("Neptuni ja Marssi kauguse vahe on " + distanceBetweenPlanets + " km");
	
	}
}