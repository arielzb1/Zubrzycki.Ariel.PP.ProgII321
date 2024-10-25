package Ariel.Zubrzycki;


public abstract class Planta {
    protected String nombre;
    protected String ubicacion;
    protected String clima;
    
    public Planta(String nombre, String ubicacion, String clima){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.clima = clima;
    }
    
    private String mostrar(Planta p1){
        return "Nombre: " + p1.nombre + "\n" +
                "Ubicacion: " + p1.ubicacion + "\n" +
                "Clima: " + p1.clima;
    }
    
    public String toString(){
        return mostrar(this);
    }
    
    public void podar(){
        System.out.printf("Se ha podado ");
    }
    
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        Planta planta = (Planta)obj;
        return planta.nombre == this.nombre && planta.ubicacion == this.ubicacion;
    }
}
