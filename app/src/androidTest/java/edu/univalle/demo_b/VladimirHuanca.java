public class persona{
	//Vladimir Huanca Quispe
	private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoidentidad;

    
    public Persona (){
        nombre = "";
        apellidos = "";
        edad = 0;
        casado = false;
        numeroDocumentoidentidad = "";
    }

   
    public void setnombre (String valornombre){
        nombre = "nombre" + valornombre; 
    }
    public void setapellidos (String valorapellidos){
        apellidos = "apellidos" + valorapellidos;
    }
    public void setedad (int valoredad){
        edad = valoredad;
    }
    public void setcasado (boolean valorcasado){
        casado = valorcasado;
    }
    public void setnumeroDocumentoidentidad (String valornumeroDocumentoidentidad){
        numeroDocumentoidentidad = valornumeroDocumentoidentidad;
    }
    
    
    public String getnombre (){ return nombre; } 
    public String getapellidos () { return apellidos; }
    public int getedad () { return edad; } 
    public boolean getcasado () { return casado; }
    public String getnumeroDocumentoidentidad () { return numeroDocumentoidentidad; } 
	}

}