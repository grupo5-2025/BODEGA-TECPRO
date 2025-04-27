package proyecto;

public class clase1 {
	private int codigo;
	private String producto,proveedor;
	private int stockactual;
	private double preciouni;
	public clase1(int codigo, String producto, String proveedor, int stockactual, double preciouni) {
		super();
		this.codigo = codigo;
		this.producto = producto;
		this.proveedor = proveedor;
		this.stockactual = stockactual;
		this.preciouni = preciouni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public int getStockactual() {
		return stockactual;
	}
	public void setStockactual(int stockactual) {
		this.stockactual = stockactual;
	}
	public double getPreciouni() {
		return preciouni;
	}
	public void setPreciouni(double preciouni) {
		this.preciouni = preciouni;
	}
	
	
	
}
