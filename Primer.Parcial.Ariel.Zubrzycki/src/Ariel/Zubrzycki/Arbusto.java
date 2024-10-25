package Ariel.Zubrzycki;

public class Arbusto extends Planta{
    private int densidad;
    
    public Arbusto(String nombre,String ubicacion,String clima, int densidad){
        super(nombre,ubicacion,clima);
        this.densidad = ingresoDensidad(densidad);
    }
    
    public int ingresoDensidad(int densidad){
        if(densidad < 1 || densidad > 10){
            throw new DensidadLimiteValorException();
        }
        return densidad;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Densidad: " + densidad;
    }
    
    public void podar(){
        super.podar();
        System.out.println("Arbusto");
    }
}
