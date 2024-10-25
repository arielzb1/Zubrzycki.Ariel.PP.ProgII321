package Ariel.Zubrzycki;
import java.util.ArrayList;

public class JardinBotanico {
    private ArrayList<Planta> plantas;
    
    public JardinBotanico(){
        plantas = new ArrayList<>();
    }
    
    public void agregarPlanta(Planta planta){
        if(planta == null){
            throw new NullPointerException("Me pasaste un null");
        }
        if(plantas.contains(planta)){
            throw new PlantaRepetidaException();
        }else{
            plantas.add(planta);
        }       
    }
    
    public void mostrarPlantas(){
        if(!plantas.isEmpty()){
            for (Planta planta : plantas) {
                System.out.println(planta.toString() + "\n");;
            }
        }
    }
    
    public void podarPlantas(){
        if(!plantas.isEmpty()){
            for (Planta planta : plantas) {
                planta.podar();
            }
        }
    }
}
