package EJ1;

public class Cashier extends Thread{

	private int id;
	private Client currentClient=null;
	
	public Cashier(int id) {
		super();
		this.id = id+1;
	}
	
	public Client getCurrentClient() {
		return currentClient;
	}
	
	public void setCurrentClient(Client currentClient) {
		this.currentClient = currentClient;
	}

	@Override
	public void run() {
		if(currentClient!=null) {
			for (int i = 0; i < currentClient.getProductos().length; i++) {
				System.out.println("Cashier " + id + " scans the product " + (i+1) + " from Client " + currentClient.getId());
				try {
					this.sleep(currentClient.getProductos()[i]*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Cashier " + id + " has finished.");
		}
	}
}
