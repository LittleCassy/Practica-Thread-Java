package EJ2;

public class Main {
	
	public static void main(String[] args) {

		Estanco miEstanco = new Estanco();
		
		Smoker s1 = new Smoker(0, miEstanco);
		Smoker s2 = new Smoker(1, miEstanco);
		Smoker s3 = new Smoker(2, miEstanco);
		
		Estanquero e1 = new Estanquero(miEstanco);
				
		e1.start();
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}
