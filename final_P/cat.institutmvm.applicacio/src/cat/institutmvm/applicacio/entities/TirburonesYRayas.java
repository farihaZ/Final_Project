package cat.institutmvm.applicacio.entities;

public class TirburonesYRayas extends Especies{

    /**
     * declaration of the variables of primitive type
     */
    private String patron , dientes,aletas;

    /**
     * main constructor of class TirburonesYRayas
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
     * @param patron
     * @param dientes
     * @param aletas
     */
    public TirburonesYRayas(String nombre , String habitat,String sexo,int profundidad ,String nubosidad,String fuerzaViento,String direcionViento,String hora,String cebo,String parasitos,String presenciaA,int tiempoNavegacion,int embaraciones,int temperatura,int numeroA,boolean proSharks,String patron,String dientes,String aletas){
        super(nombre , habitat,sexo,profundidad ,nubosidad,fuerzaViento,direcionViento,hora,cebo,parasitos,presenciaA,tiempoNavegacion,embaraciones,temperatura,numeroA,proSharks);
        this.setPatron(patron);
        this.setDientes(dientes);
        this.setAletas(aletas);
    }

    /**
     *
     * @return
     */
    public String getPatron() {
        return patron;
    }

    /**
     *
     * @param patron
     */
    public void setPatron(String patron) {
        this.patron = patron;
    }

    /**
     *
     * @return
     */
    public String getDientes() {
        return dientes;
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
        return aletas;
    }

    /**
     *
     * @param aletas
     */
    public void setAletas(String aletas) {
        this.aletas = aletas;
    }
}
