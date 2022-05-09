package CoffeeMachine.coffeeMachine;

public class Capacinno implements CoffeeMaker {

		private String  Cream;
			
			public String getCream() {
				return Cream;
			}

			public void setCream(String cream) {
				Cream = cream;
			}
			public void withCream() {
				System.out.println(Cream);
			}

			public void testeOfCoffe() {
				System.out.println("Super Test for Mind and Helth..");
				
			}
			public void withOutCream() {
				System.out.println(" Your Coffe Without Cream");
			}
			public void costOfCoffe() {
				System.out.println("150/- only");
				
			}

}
