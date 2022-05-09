package MavenBuild.Maven2;

public class Airtel implements Sim {
 
	private String datastrength;
	
	public String getDatastrength() {
		return datastrength;
	}

	public void setDatastrength(String datastrength) {
		this.datastrength = datastrength;
	}

	public void typeOfSim() {
		
		System.out.println("this is airtel sim");
	}

	public void dataTypeOfSim() {
		
		System.out.println("airtel has 5G data");
	}
	
	public void dataStrength() {
		System.out.println(datastrength);
	}


}
