public class Arma{

    private boolean seguroDeTiro;
    
    private int numeroDeBalas;
    
    private String numeroDeSerie;
    
    public Arma(int numBalas, boolean seguro, String numSerie){
        numeroDeBalas = numBalas;
        seguroDeTiro = seguro;
        numeroDeSerie = numSerie;
    }
    
    public int getCantidadDeBalasRestantes(){
        return numeroDeBalas;
    }
    
    public void modificarSeguro(boolean cambiarSeguro){
        seguroDeTiro = cambiarSeguro;
    }
    
    public void introducirBalas(int balas){
        numeroDeBalas = balas;
    }
    
    public void cambiarNumSerie(String numSerie){
        numeroDeSerie = numSerie;
    }
    
    public void imprimirEstado(){
        System.out.println("La cantidad de balas que tiene el cargador son " + numeroDeBalas);
        if (seguroDeTiro == true){
            System.out.println("El seguro esta puesto");
        }
        else{
            System.out.println("El seguro esta quitado");
        }
        System.out.println("El numero de serie es " + numeroDeSerie);
    }
    
    public String devolverEstado(){
        String seguro = null;
        if (seguroDeTiro == true){
            seguro = " el seguro esta puesto";
        }
        else{
            seguro = " el seguro esta quitado";
        }
        String estado = "La cantidad de balas es " + numeroDeBalas + ", el numero de serie es " + numeroDeSerie + seguro ;
        return estado;
    }
    
}