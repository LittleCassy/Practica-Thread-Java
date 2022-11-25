package EJ2;

public class Smoker extends Thread {
	
	private int ingredient;
	private Estanco estanco;
	
	public Smoker(int ingredient, Estanco estanco) {
		this.ingredient = ingredient;
		this.estanco = estanco;
	}
	
	@Override
	public void run() {
		while (true) {
			estanco.get(this.ingredient);
			System.out.println("El fumador " + ingredient + " va a fumar.");
			
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("El fumador " + ingredient + " ha terminado de fumar.");
		}
	}

	public int getIngredient() {
		return ingredient;
	}

	public void setIngredient(int ingredient) {
		this.ingredient = ingredient;
	}

	public Estanco getEstanco() {
		return estanco;
	}

	public void setEstanco(Estanco estanco) {
		this.estanco = estanco;
	}
	
	
}
