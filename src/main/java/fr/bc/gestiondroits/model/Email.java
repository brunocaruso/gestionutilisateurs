package fr.bc.gestiondroits.model;

/**
 * La classe Email gère les coordonnées de courrier électronique de l'utilisateur.
 * <p>
 * Elle allège la classe Utilisateur.
 */
public class Email {

    /**
     * L'id.
     */
    private Integer id;

    /**
     * L'adresse mail professionnelle.
     */
    private String emailPro;

    /**
     * L'adresse email personnelle.
     */
    private String emailPerso;

    /**
     * L'utilisateur rattaché.
     */
    private Utilisateur utilisateur;

    /**
     * Constructeur.
     */
    public Email(Integer id, String emailPro, String emailPerso, Utilisateur utilisateur) {
        this.id = id;
        this.emailPro = emailPro;
        this.emailPerso = emailPerso;
        this.utilisateur = utilisateur;
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
     * Défini l'id.
     *
     * @param id le nouvel id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtient l'adresse email professionnelle.
     *
     * @return l'adresse email professionnelle
     */
    public String getEmailPro() {
        return emailPro;
    }

    /**
     * Défini l'adresse email professionnelle.
     *
     * @param emailPro la nouvelle adresse email professionnelle
     */
    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    /**
     * Obtient l'adresse email personnelle.
     *
     * @return l'adresse email personnelle
     */
    public String getEmailPerso() {
        return emailPerso;
    }

    /**
     * Défini l'adresse email personnelle.
     *
     * @param emailPerso la nouvelle adresse personnelle
     */
    public void setEmailPerso(String emailPerso) {
        this.emailPerso = emailPerso;
    }

    /**
     * Obtient l'utilisateur.
     *
     * @return l'utilisateur
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Défini l'utilisateur.
     *
     * @param utilisateur l'utilisateur
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
