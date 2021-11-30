
package practica12;


public class Producto {
    private String fCaducidad;
    private int nLote;
    
    public Producto(String fCaducidad, int nLote){
    
        System.out.println("Fecha de caducidad: "+fCaducidad);
        System.out.println("Número de lote: "+nLote);
        
    }
    
     public String GetfCaducidad()
	{
            
		return this.fCaducidad;
	}
	public void setfCaducidad(String fCaducidad)
	{
		          
		this.fCaducidad = fCaducidad;
	}
        
         public int GetnLote()
	{
            
		return this.nLote;
	}
	public void setnLote(int nLote)
	{
		          
		this.nLote = nLote;
	}
    
            
}
