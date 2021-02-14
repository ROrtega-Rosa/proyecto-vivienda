package gestionVivienda;

/**
 * Esta clase pretende construir diferentes tipos de viviendas
 * @author Rosa
 *
 */

public class Vivienda {

	
	private String referencia;
    private String direccion;
    private String poblacion;
    private int superficie;
    private byte habitaciones;
    private byte banios;
    private byte plantas;
    private boolean garage;
    private double precio;
    private String fotosdireccion;
    private boolean disponible; 
    private boolean amueblado;
    /**
     *Constructores para inicializar las variables de clases
     */
    		
    Vivienda(){}
    
    Vivienda(String referencia, String direccion, String poblacion, int superficie,
            byte habitaciones, byte banios, byte plantas, boolean garage, double precio,
            String fotosdireccion, boolean disponible, boolean amueblado){
    
        this.direccion=direccion;
        this.referencia=referencia;
        this.poblacion=poblacion; 
        this.superficie=superficie;
        this.habitaciones= (byte)habitaciones;
        this.banios=(byte)banios;
        this.plantas=(byte)plantas;
        this.garage=garage;
        this.precio=precio;
        this.fotosdireccion=fotosdireccion;
        this.disponible=disponible; 
        this.amueblado=amueblado;
    }
    /*métodos getters y setters para poder recuperar o cambiar los datos de las variables*/
    
    /**
     * Método clave para escoger vivienda
     * @param referencia. Este parámetro de permitirá escoger una referencia
     */
    
    public void estableceReferencia(String referencia){
        
       this.referencia=referencia;
    }
    /**
     * 
     * @param referencia.
     * @return. Devuelve la referencia escogida.
     */
    public String dimeReferencia(String referencia){
        
        return referencia;
    }
    /**
     * 
     * @param direccion
     */
    
    public void estableceDireccion(String direccion){
        
        this.direccion=direccion;
    }
    /**
     * 
     * @param direccion
     * @return
     */
    public String dimeDireccion(String direccion){
        
        return direccion;
    }
    /**
     * 
     * @param poblacion
     */
    public void establecePoblacion(String poblacion){
    
        this.poblacion=poblacion;
    }
    /**
     * 
     * @param poblacion
     * @return
     */
    public String dimePoblacion (String poblacion){
        
        return poblacion;
    }
    /**
     * 
     * @param superficie
     */
    
    public void estableceSuperficie (int superficie){
    
        this.superficie=superficie;
    }
    /**
     * 
     * @param superficie
     * @return
     */
    public int dimeSuperficie(int superficie){
        
        return superficie;
    
    }
    /**
     * 
     * @param habitaciones
     */
    
    public void estableceHabitaciones ( byte habitaciones){
    
        this.habitaciones= (byte)habitaciones; 
    }
    /**
     * 
     * @param habitaciones
     * @return
     */
    public byte dimehabitaciones (byte habitaciones){
        
        return habitaciones;
    }
    /**
     * 
     * @param banios
     */
    public void estableceBanios (byte banios){
    
        this.banios= (byte)banios;
    }
    /**
     * 
     * @param banios
     * @return
     */
    public byte dimeBanios (byte banios){
    
        return banios;
    }
    /**
     * 
     * @param plantas
     */
    
    public void establecePlantas (byte plantas){
    
        this.plantas=(byte)plantas;
    }
    /**
     * 
     * @param plantas
     * @return
     */
    
    public byte dimePlantas (byte plantas){
        
        return plantas;
    }
    /**
     * 
     * @param si
     * @param no
     */
    public void estableceGarage (String si, String no){
    
        if (si.equals(true)){
        
        }else if (no.equals(false));
        
        this.garage= garage;
    }
    /**
     * 
     * @param garage
     * @return
     */
    public String dimeGarage (boolean garage){
       
        
        if (this.garage==true){
        return "si";
    } else if (this.garage==false);
        
        return "no";
    
    }
    
    /**
     * 
     * @param precio
     */
    public void establecePrecio (double precio){
    
        this.precio=precio;
    }
    /**
     * 
     * @param precio
     * @return
     */
    public double dimePrecio (double precio){
        
        return precio;
    }
    /**
     * 
     * @param fotosdireccion
     */
    public void estableceFotosdireccion (String fotosdireccion){
    
        this.fotosdireccion= fotosdireccion;
    }
    /**
     * 
     * @param fotosdireccion
     * @return
     */
    public String dimeFotosdireccion (String fotosdireccion){
        
        return fotosdireccion;
    }
    /**
     * 
     * @param si
     * @param no
     */
    
    
    public void estableceDiponible (String si, String no){
    
         if (si.equals(true)){
         
         }else if (no.equals(false));
         
        this.disponible=disponible;
    }
    /**
     * 
     * @param disponible
     * @return
     */
    public String dimeDisponible (boolean disponible){
        
        
        
        if (this.disponible==true){
        return "si";
        }else if (this.disponible ==false);
        return "no";
    }
    /**
     * 
     * @param si
     * @param no
     */
    public void estableceAmueblado(String si, String no){
       
        if (si.equals(true)){
        
        }else if (no.equals(false));
       
        
      this.amueblado= amueblado;
    }
    public String dimeAmueblado(boolean amueblado){
        
      
        if (this.amueblado==true){
            return "si";
        } 
        else if (this.amueblado==false);
        
         return "no";
        
        
    }
    
     /**
     * Metodo inserta todos los datos de la vivienda
     
     * @return  y que nos retorna la frase.
     */
    public String descripcion (){
    
    return "lujosa casa de viviendas de "+plantas+" plantas situada en "+direccion+" y en la población "+ poblacion+
            " que cuenta con "+habitaciones+" habitaciones y "+banios+" baños que tiene "+superficie+
            " de superficie y "+garage+" tiene garage con un precio de "+precio+ " y "+amueblado+" tiene muebles. Su referencia es "
            +referencia+" puede estar "+disponible+" o tener "+fotosdireccion;
    
    }
    
      public String caracteristicas(){
      
      return "\n caracteristicas: "+"\n Referencia Vivhu"+"\n Superficie 180m2"+
              "\n Plantas 2"+"\n Habitaciones 3 dormitorios y 2 baños"+"\n Garage NO"
              +"\n Amueblado SI"+"\n Disponible SI";
      
      }
    
}
