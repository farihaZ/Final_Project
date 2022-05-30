package cat.institutmvm.applicacio.entities;

public class BallenaYDelefines extends Especies{
    /**
     * declaration of the variables of primitive type
     */
    private String dientes,aletas;

    /**
     * Main constructor of class BllenaYDelefines
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
     * @param dientes
     * @param aletas
     */
   public BallenaYDelefines(String nombre , String habitat,String sexo,int profundidad ,String nubosidad,String fuerzaViento,String direcionViento,String hora,String cebo,String parasitos,String presenciaA,int tiempoNavegacion,int embaraciones,int temperatura,int numeroA,boolean proSharks,String dientes,String aletas){
        super(nombre , habitat,sexo,profundidad ,nubosidad,fuerzaViento,direcionViento,hora,cebo,parasitos,presenciaA,tiempoNavegacion,embaraciones,temperatura,numeroA,proSharks);
        this.setDientes(dientes);
        this.setAletas(aletas);
    }

    /**
     * getter method
     * @return
     */
    public String getDientes() {
        return this.dientes;
    }

    /**
     *
     * @param dientes
     */
    public void setDientes(String dientes) {
        this.dientes = dientes;
    }

    /**
     *
     * @return
     */
    public String getAletas() {
        return this.aletas;
    }

    /**
     *
     * @param aletas
     */
    public void setAletas(String aletas) {
        this.aletas = aletas;
    }
}
