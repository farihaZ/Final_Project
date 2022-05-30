package cat.institutmvm.applicacio.entities;

public class Focas extends Especies{
    /**
     * declaration of the variable of primitive type
     */
    private String aletasDelanteras,bigotes;

    /**
     * Main constructor of the class Focas
     * @param nombre
     * @param habitat
     * @param sexo
     * @param profundidad
     * @param nubosidad
     * @param fuerzaViento
     * @param direcionViento
     * @param hora
     * @param cebo
     * @param parasitos
     * @param presenciaA
     * @param tiempoNavegacion
     * @param embaraciones
     * @param temperatura
     * @param numeroA
     * @param proSharks
     * @param aletasDelanteras
     * @param bigotes
     */
   public Focas(String nombre , String habitat,String sexo,int profundidad ,String nubosidad,String fuerzaViento,String direcionViento,String hora,String cebo,String parasitos,String presenciaA,int tiempoNavegacion,int embaraciones,int temperatura,int numeroA,boolean proSharks,String aletasDelanteras,String bigotes){
       super(nombre , habitat,sexo,profundidad ,nubosidad,fuerzaViento,direcionViento,hora,cebo,parasitos,presenciaA,tiempoNavegacion,embaraciones,temperatura,numeroA,proSharks);
        this.setAletasDelanteras(aletasDelanteras);
        this.setBigotes(bigotes);
    }

    /**
     * getter method
     * @return
     */
    public String getAletasDelanteras() {
        return aletasDelanteras;
    }

    /**
     * setter method
     * @param aletasDelanteras
     */
    public void setAletasDelanteras(String aletasDelanteras) {
        this.aletasDelanteras = aletasDelanteras;
    }

    /**
     * getter method
     * @return
     */
    public String getBigotes() {
        return bigotes;
    }

    /**
     * setter method
     * @param bigotes
     */
    public void setBigotes(String bigotes) {
        this.bigotes = bigotes;
    }
}
