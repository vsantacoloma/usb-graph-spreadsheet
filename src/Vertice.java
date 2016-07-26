/** Clase Vertice, dise�ada para  representar concretamente
 * los nodos que pertenecen a un grafo
 */
public class Vertice 
{
	/** Id representa la identificacion �nica del nodo
	**/
    private String id;
	private long costo;
    private String funcion;
	
		/** Constructor de la Clase 
	* crea  un nodo con un id y un costo
	**/
	public Vertice(String id, long costo)
	{
		this.id = id;
		this.costo = costo;
		this. funcion = "";
	}
	
		public Vertice(String id, long costo, String funcion)
	{
		this.id = id;
		this.costo = costo;
		this.funcion = funcion;
	}
	
	/** Sobreescritura del metodo hashCode, 
	 * toma el String  "id"  y aplica el hashCode al ese String
	**/
	public int hashCode()
	{
		int code=0;
		code = this.id.hashCode();
		if (code <0)
		{
			code = -code;
		}		
		return code;
	}
	
	/** Retorna el id de un nodo
	**/
	public String obtenerId()
	{
		return this.id;
	}

    
	/** Construye el String representativo del vertice this
	*
	**/
	public String toString()
	{
		String S = this.id+" "+(int)this.costo;
		return S; 
	}
	
	/** Compara el Vertice implicito con el objeto a
	* Si son equivalentes  retorna true, en otros casos false
	**/
	public boolean equals(Object a)
	{
		boolean v= false;
		
		if ( a instanceof Vertice)
		{
			v = this.id.equals(((Vertice)a).getId()) && this.costo == (((Vertice)a).getCosto());
		}
		
		return v;
	}
	
	/**  Retorna el String representativo del id del Vertice this
	**/
	public String getId()
	{
		return this.id;
	}
	
	/**  Retorna el long representativo del costo del Vertice this
	**/	
	public long getCosto()
	{
		return this.costo;
	}
	
	public String getFuncion()
	{
		return this.funcion;
	}
	
	/** Asigna el long  costo al parametro costo del Vertice this
	**/
	public void asigCosto(long costo)
	{
		this.costo = costo;
	}
	
	/** Retorna un objeto equivalente al vertice implicito
	**/

	public Object clone()
	{
		Vertice a= new Vertice(this.id,this.costo);
		return a;
	}
	
}
