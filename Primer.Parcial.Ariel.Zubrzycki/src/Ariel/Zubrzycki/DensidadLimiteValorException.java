package Ariel.Zubrzycki;

public class DensidadLimiteValorException extends RuntimeException{
    
    private static final String MESSAGE = "El valor de la densidad no es mayor a 0 y menor a 11";
    
    public DensidadLimiteValorException(){
        super(MESSAGE);
    }  
}
