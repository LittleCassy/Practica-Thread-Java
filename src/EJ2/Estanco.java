package EJ2;

public class Estanco {
	
	private int notAvailable;
	private boolean nothingOnTable = false;
	
	public synchronized void get(int tipoCliente) {
		while (tipoCliente!=this.notAvailable || !this.nothingOnTable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		this.nothingOnTable = false;
		notify();
	}
	
	public synchronized void put(int noDisponible) {
		while (this.nothingOnTable) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.nothingOnTable = true;
		this.notAvailable = noDisponible;
		notifyAll();
	}

	public int getNotAvailable() {
		return notAvailable;
	}

	public void setNotAvailable(int notAvailable) {
		this.notAvailable = notAvailable;
	}

	public boolean isNothingOnTable() {
		return nothingOnTable;
	}

	public void setNothingOnTable(boolean nothingOnTable) {
		this.nothingOnTable = nothingOnTable;
	}
}