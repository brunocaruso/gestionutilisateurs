package fr.bc.gestiondroits.model;

/**
 * La classe telephone va gérer les coordonnées téléphoniques de l'utilisateur.
 */
public class Telephone {
    /**
     * id : l'id de l'occurrence téléphone de l'utilisateur.
     */
    private Integer id;

    /**
     * telephoneFixe : Le n° de téléphone fixe de l'utilisateur.
     */
    private String telephoneFixe;

    /**
     * telephonePortable : le n° de téléphone portable de l'utilisateur.
     */
    private String telephonePortable;

    /**
     * utilisateurId : l'Id de l'utilisateur.
     */
    // private Integer utilisateurId;
    private Utilisateur utilisateurId;

    /**
     * Défini le n° de téléphone fixe.
     *
     * @param telephoneFixe le nouveau numéro de téléphone fixe
     */
    public void setTelephoneFixe(String telephoneFixe) {
        this.telephoneFixe = telephoneFixe;
    }

    /**
     * Défini le n° de téléphone portable.
     *
     * @param telephonePortable le nouveau numéro de téléphone portable
     */
    public void setTelephonePortable(String telephonePortable) {
        this.telephonePortable = telephonePortable;
    }

    /**
     * Défini l'Id utilisateur.
     *
     * @param utilisateurId le nouvel Id utilisateur
     */
    public void setUtilisateurId(Utilisateur utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    /**
     * Obtient l'id.
     *
     * @return l'id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Obtient le numéro de téléphone fixe.
     *
     * @return le numéro de téléphone fixe
     */
    public String getTelephoneFixe() {
        return telephoneFixe;
    }

    /**
     * Obtient le numéro de téléphone portable.
     *
     * @return le numéro de téléphone portable
     */
    public String getTelephonePortable() {
        return telephonePortable;
    }

    /**
     * Obtient l'Id de l'utilisateur.
     *
     * @return l'id utilisateur
     */
    public Utilisateur getUtilisateurId() {
        return utilisateurId;
    }
}
