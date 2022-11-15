public class Arma{

    private boolean seguroTiro;
    
    private int numeroDeBalas;
    
    private String numeroDeSerie;
    
    public Arma(int numBalas, boolean seguro, String numSerie){
        numeroDeBalas = numBalas;
        seguroTiro = seguro;
        numeroDeSerie = numSerie;
    }
    
    public void setSeguro(){
        if(seguroTiro == true){
            seguroTiro = false;
        }
        else{
            seguroTiro = true;
        }
    }
    
    public void setBalas(int balas){
        numeroDeBalas += balas;
    }
    
    public void setNumSerie(String numSerie){
        numeroDeSerie = numSerie;
    }
    
    public void imprimirEstado(){
        String seguro = null;
        String numBalas = "al cargador le quedan " + numeroDeBalas + " balas";
        if (seguroTiro == true){
            seguro = "el seguro esta puesto";
        }
        else{
            seguro = "el seguro esta quitado";
        }
        System.out.println("El numero de serie es " + numeroDeSerie + " , " + seguro + " y " + numBalas);
    }
    
    public String devolverEstado(){
        String seguro = null;
        if (seguroTiro == true){
            seguro = " el seguro esta puesto";
        }
        else{
            seguro = " el seguro esta quitado";
        }
        String estado = "La cantidad de balas es " + numeroDeBalas + ", el numero de serie es " + numeroDeSerie + seguro ;
        return estado;
    }
    
    public int getNumBalas(){
        return numeroDeBalas;
    }
    
    public String getNumSerie(){
        return numeroDeSerie;
    }
    
    public boolean getSeguro(){
        return seguroTiro;
    }
    
}