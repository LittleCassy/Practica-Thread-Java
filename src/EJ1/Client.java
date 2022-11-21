package EJ1;

public class Client {
	
	private int id;
	private int[] productos;
	
	public Client(int id, int[] productos) {
		super();
		this.id = id;
		this.productos = productos;
	}

	public int[] getProductos() {
		return productos;
	}

	public void setProductos(int[] productos) {
		this.productos = productos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
