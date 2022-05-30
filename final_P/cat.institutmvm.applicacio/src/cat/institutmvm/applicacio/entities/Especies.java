package cat.institutmvm.applicacio.entities;

public class Especies {
    /**
     *  declaration of the variables of primitive type
     */
    private String nombre , habitat,sexo,nubosidad,fuerzaViento,direcionViento,hora,cebo,parasitos,presenciaA;
        private int profundidad ,tiempoNavegacion,embaraciones,temperatura,numeroA;
        private boolean proSharks;

    /**
     * main constructor
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
     */
        public Especies(String nombre , String habitat,String sexo,int profundidad ,String nubosidad,String fuerzaViento,String direcionViento,String hora,String cebo,String parasitos,String presenciaA,int tiempoNavegacion,int embaraciones,int temperatura,int numeroA,boolean proSharks) {
            this.setNombre(nombre);
            this.setHabitat(habitat);
            this.setSexo(sexo);
            this.setProfundidad(profundidad);
            this.setNubosidad(nubosidad);
            this.setFuerzaViento(fuerzaViento);
            this.setDirecionViento(direcionViento);
            this.setHora(hora);
            this.setCebo(cebo);
            this.setParasitos(parasitos);
            this.setPresenciaA(presenciaA);
            this.setTiempoNavegacion(tiempoNavegacion);
            this.setEmbaraciones(embaraciones);
            this.setTemperatura(temperatura);
            this.setNumeroA(numeroA);
            this.setProSharks(proSharks);

        }

    public Especies(String text, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8, String text9, String text10, String text11, String text12, String text13, String text14, String text15) {
    }


    /**
     * getter method for the variable nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter method
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter method of the variable habitat
     * @return
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * setter method
     * @param habitat
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * getter method
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * setter method
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * getter method
     * @return
     */
    public int getProfundidad() {
        return profundidad;
    }

    /**
     * setter method
     * @param profundidad
     */
    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * getter method
     * @return
     */
    public String getNubosidad() {
        return nubosidad;
    }

    /**
     * setter method
     * @param nubosidad
     */
    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    /**
     * getter method
     * @return
     */
    public String getFuerzaViento() {
        return fuerzaViento;
    }

    /**
     * setter method
     * @param fuerzaViento
     */
    public void setFuerzaViento(String fuerzaViento) {
        this.fuerzaViento = fuerzaViento;
    }

    /**
     * getter method
     * @return
     */
    public String getDirecionViento() {
        return direcionViento;
    }

    /**
     * setter method
     * @param direcionViento
     */
    public void setDirecionViento(String direcionViento) {
            this.direcionViento = direcionViento;
    }

    /**
     *getter method
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     * setter method
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * getter method
     * @return
     */
    public String getCebo() {
        return cebo;
    }

    /**
     * setter method
     * @param cebo
     */
    public void setCebo(String cebo) {
        this.cebo = cebo;
    }

    /**
     * getter method
     * @return
     */
    public String getParasitos() {
        return parasitos;
    }

    /**
     * setter method
     * @param parasitos
     */
    public void setParasitos(String parasitos) {
        this.parasitos = parasitos;
    }

    /**
     * getter method
     * @return
     */
    public String getPresenciaA() {
        return presenciaA;
    }

    /**
     * setter method
     * @param presenciaA
     */
    public void setPresenciaA(String presenciaA) {
        this.presenciaA = presenciaA;
    }

    /**
     * getter method
     * @return
     */
    public int getTiempoNavegacion() {
        return tiempoNavegacion;
    }

    /**
     * setter method
     * @param tiempoNavegacion
     */
    public void setTiempoNavegacion(int tiempoNavegacion) {
        this.tiempoNavegacion = tiempoNavegacion;
    }

    /**
     * getter method
     * @return
     */
    public int getEmbaraciones() {
        return embaraciones;
    }

    /**
     * setter method
     * @param embaraciones
     */
    public void setEmbaraciones(int embaraciones) {
        this.embaraciones = embaraciones;
    }

    /**
     * getter method
     * @return
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * setter method
     * @param temperatura
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * getter method
     * @return
     */
    public int getNumeroA() {
        return numeroA;
    }

    /**
     * setter method
     * @param numeroA
     */
    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    /**
     * getter method
     * @return
     */
    public boolean isProSharks() {
        return proSharks;
    }

    /**
     * setter method
     * @param proSharks
     */
    public void setProSharks(boolean proSharks) {
        this.proSharks = proSharks;
    }
}
