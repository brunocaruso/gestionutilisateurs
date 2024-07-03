package fr.bc.gestiondroits.model;

/**
 * La classe des droits utilisateurs.
 */
public class Droit {

    /**
     * L'id des droits.
     */
    private Integer id;

    /**
     * La clé des droits.
     */
    private String cle;

    /**
     * Instancie un nouveau droit.
     *
     * @param id  l'id du droit
     * @param cle la clé du droit
     */
    public Droit(Integer id, String cle) {
        super();
        this.id = id;
        this.cle = cle;
    }

    /**
     * Instancie un nouveau droit.
     */
    public Droit() {
    }

    /**
     * Obtient l'id des droits.
     *
     * @return l'id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Défini l'id des droits.
     *
     * @param id le nouvel id des droits
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Retourne la clé.
     *
     * @return la clé
     */
    public String getCle() {
        return cle;
    }

    /**
     * Défini la clé.
     *
     * @param cle la nouvelle clé
     */
    public void setCle(String cle) {
        this.cle = cle;
    }
}
