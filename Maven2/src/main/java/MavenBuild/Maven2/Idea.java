package MavenBuild.Maven2;

public class Idea implements Sim{
	private String datastrength;

	public Idea(String datastrength) {
		super();
		this.datastrength = datastrength;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("this is idea sim");
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("idea has 4G data");
	}
	
	public void strength() {
		System.out.println(datastrength);
	}

}
