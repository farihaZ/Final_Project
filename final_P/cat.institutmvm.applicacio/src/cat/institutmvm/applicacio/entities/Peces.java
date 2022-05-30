package cat.institutmvm.applicacio.entities;


public class Peces extends Especies{
    /**
     * declaration of the variables
     */
    private String piel,esqueleto;

    /**
     * Main constructor
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
     * @param piel
     * @param esqueleto
     */
    public Peces(String nombre , String habitat,String sexo,int profundidad ,String nubosidad,String fuerzaViento,String direcionViento,String hora,String cebo,String parasitos,String presenciaA,int tiempoNavegacion,int embaraciones,int temperatura,int numeroA,boolean proSharks,String piel,String esqueleto){
        super(nombre , habitat,sexo,profundidad ,nubosidad,fuerzaViento,direcionViento,hora,cebo,parasitos,presenciaA,tiempoNavegacion,embaraciones,temperatura,numeroA,proSharks);
        this.setPiel(piel);
        this.setEsqueleto(esqueleto);
    }

    /**
     *
     * @return
     */
    public String getPiel() {
        return piel;
    }

    /**
     *
     * @param piel
     */
    public void setPiel(String piel) {
        this.piel = piel;
    }

    /**
     *
     * @return
     */
    public String getEsqueleto() {
        return esqueleto;
    }

    /**
     *
     * @param esqueleto
     */
    public void setEsqueleto(String esqueleto) {
        this.esqueleto = esqueleto;
    }
}
