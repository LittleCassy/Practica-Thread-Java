package EJ1;

public class MyMain {

	private static Client[] myClients = new Client[] {new Client(1, new int[] {10,2,5,3}), new Client(2, new int[] {20,3,4,7}),new Client(3,new int[] {11,20,1,1})};
	private static Cashier[] myCashiers = new Cashier[] {new Cashier(0),new Cashier(1),new Cashier(2)};
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for (int i = 0; i < myClients.length; i++) {
				for (int j = 0; j < myCashiers.length; j++) {
					if(myCashiers[j].getCurrentClient()==null) {
						myCashiers[j].setCurrentClient(myClients[i]);
						break;
				}
			}
		}
		
		for(int i = 0; i < myCashiers.length; i++) {
			if(myCashiers[i].getCurrentClient()!=null) {
				myCashiers[i].start();
			}
		}
	}
}
