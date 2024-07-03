package fr.bc.gestiondroits.model;

/**
 * La classe Adresse renseigne les adresses de l'utilisateur.
 * <p>
 * Elle allège la classe Utilisateur.
 */
public class Adresse {

    /**
     * L'id de l'adresse
     */
    private Integer id;

    /**
     * La première ligne de l'adresse
     */
    private String adresse1;

    /**
     * La seconde ligne de l'adresse (sert pour des renseignements divers, comme le nom du bâtiment)
     */
    private String adresse2;

    /**
     * Le code postal
     */
    private String codePostal;

    /**
     * La ville
     */
    private String ville;

    /**
     * L'utilisateur lié à cette adresse
     */
    private Utilisateur utilisateur;

    /**
     * Constructeur pour initialiser une adresse avec les informations fournies.
     *
     * @param id          l'id de l'adresse
     * @param adresse1    la première ligne de l'adresse
     * @param adresse2    la seconde ligne de l'adresse
     * @param codePostal  le code postal
     * @param ville       la ville
     * @param utilisateur l'utilisateur lié à cette adresse
     */
    public Adresse(Integer id, String adresse1, String adresse2, String codePostal, String ville, Utilisateur utilisateur) {
        this.id = id;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.codePostal = codePostal;
        this.ville = ville;
        this.utilisateur = utilisateur;
    }

    /**
     * Obtient l'id de l'adresse.
     *
     * @return l'id de l'adresse
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit l'id de l'adresse.
     *
     * @param id l'id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtient la première ligne de l'adresse.
     *
     * @return la première ligne de l'adresse (adresse1)
     */
    public String getAdresse1() {
        return adresse1;
    }

    /**
     * Définit la première ligne de l'adresse.
     *
     * @param adresse1 la première ligne de l'adresse (adresse1)
     */
    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    /**
     * Obtient la seconde ligne de l'adresse.
     *
     * @return la seconde ligne de l'adresse (adresse2)
     */
    public String getAdresse2() {
        return adresse2;
    }

    /**
     * Définit la seconde ligne de l'adresse.
     *
     * @param adresse2 la seconde ligne de l'adresse (adresse2)
     */
    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    /**
     * Obtient le code postal.
     *
     * @return le code postal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit le code postal.
     *
     * @param codePostal le code postal
     */
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * Obtient la ville.
     *
     * @return la ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville.
     *
     * @param ville la ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * Obtient l'utilisateur lié à cette adresse.
     *
     * @return l'utilisateur lié à cette adresse
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Définit l'utilisateur lié à cette adresse.
     *
     * @param utilisateur l'utilisateur lié à cette adresse
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}