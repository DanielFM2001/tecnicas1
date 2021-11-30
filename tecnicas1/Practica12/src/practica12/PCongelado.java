
package practica12;


public class PCongelado extends Producto{
    private int temperaturaR;
    
    public PCongelado(String fCaducidad, int nLote) {
        super(fCaducidad, nLote);
        
        temperaturaR = 0;
    }
    
     public int GettemperaturaR()
	{
            
		return this.temperaturaR;
	}
	public void settemperaturaR(int temperaturaR)
	{
		          
		this.temperaturaR = temperaturaR;
	}
        
        public void mostrarCongelado(){
            
            System.out.println("Temperatura recomendada: "+GettemperaturaR());
        }
    
}
