package Ariel.Zubrzycki;

public class Flor extends Planta{
    private TipoTemporada temporadaFlorecimiento;
    
    public Flor(String nombre,String ubicacion,String clima, TipoTemporada temporadaFlorecimiento){
        super(nombre,ubicacion,clima);
        this.temporadaFlorecimiento = temporadaFlorecimiento;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Temporada de florecimiento: " + temporadaFlorecimiento;
    }
    
    public void podar(){
        System.out.println("No se ha podido podar Flor");
    }
}
