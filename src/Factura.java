import javax.swing.JOptionPane;

public class Factura {

	String nroFac = "01254";
	String nroPro = "24897";
	String fecha = "01/06/2022";
	String telefono = "27723065";
	String direccion = "Blv. Romero Larios";
	String rif = "V0209229397";
	
	int cantidad;
	double precio;
	int tipoProd;	
	String concepto;
	
	public Factura() 
	{
		concepto = "Desconocido";
	}
	
	public Factura( int tp, int c ) 
	{
		cantidad = c;
		tipoProd = tp;
	
	}
	
	public void setCantidad( int cant ) 
	{
		cantidad = cant;
	}	

	public void setTipoProd( int tp ) 
	{
		tipoProd = tp;
	}
	
	public int getCantidad()
	{
		return cantidad;
	}
	
	public double getPrecio() 
	{
		if ( tipoProd == 1 )	
		{
			precio = 25410.25;
		}
		else
		{
			precio = 48200.50;
		}
		return precio;
	}
	
	public String getConcepto() 
	{
		if ( tipoProd == 1 ) 
		{
			concepto = "Llave Inglesa";
		}
		else 
		{
			concepto = "Alicate de Presion";
		}
		return concepto;
	}
	
	public int getTipoProd() 
	{
		return tipoProd;
	}
	
	public double SubTotal() 
	{
		return precio * cantidad;
	}
	
	public double IVA() 
	{
		return SubTotal() * 0.12;
	}
	
	public double Total() 
	{
		return SubTotal() + IVA();
	}
	
	public void DatosFactura() 
	{
		String msg1 = String.format("\n\t%s %s\n%s %s\n%s %s\n%s %s\n%s %s\n\n%s %s\n%s %s\n%s %d %s\n%s %.2f %s\n%s %.2f %s\n%s %.2f %s\n%s %.2f %s\n",
				"Nro. de Factura:",nroFac,"R.I.F.:",rif,
				"Direccion:",direccion,"Fecha:",fecha,
				"Telefono:",telefono,
				"Nro. de Producto:", nroPro,"Concepto:",getConcepto(),"Cantidad:",getCantidad(),"Unidades",
				"Precio Unitario:",getPrecio(),"Bs.","SubTotal:", SubTotal(),"Bs.","I.V.A.:",IVA()," Bs.","Total a Pagar:",Total(),"Bs.");
				JOptionPane.showMessageDialog(null, msg1);
		
	}
	
}