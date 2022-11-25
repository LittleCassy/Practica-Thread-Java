package EJ2;

public class Estanquero extends Thread {
	Estanco estanco;
	
	public Estanquero(Estanco estanco) {
		this.estanco = estanco;
	}

	@Override
	public void run() {
		while (true) {
			int productOut = (int) (Math.random()*3+0);
			System.out.println("El estanquero ha dejado sin reponer el producto: " + productOut);
			estanco.put(productOut);
			
			try {
				sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public Estanco getEstanco() {
		return estanco;
	}

	public void setEstanco(Estanco estanco) {
		this.estanco = estanco;
	}
}
