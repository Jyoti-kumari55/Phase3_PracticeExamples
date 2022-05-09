package JunitTest.PrimeNo;

public class PrimeNumber {

	public boolean prime(int n) {
		boolean boo = true;
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				boo=false;
			break;
		}
	}
	
	return boo;
}
}
