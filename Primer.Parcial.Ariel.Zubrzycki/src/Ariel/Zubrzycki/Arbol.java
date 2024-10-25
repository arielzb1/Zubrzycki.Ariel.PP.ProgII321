package Ariel.Zubrzycki;

public class Arbol extends Planta{
    private int alturaMaxima;
    
    public Arbol(String nombre,String ubicacion,String clima, int alturaMaxima){
        super(nombre,ubicacion,clima);
        this.alturaMaxima = alturaMaxima;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Altura maxima: " + alturaMaxima;
    }
    
     public void podar(){
        super.podar();
        System.out.println("Arbol");
    }
}
