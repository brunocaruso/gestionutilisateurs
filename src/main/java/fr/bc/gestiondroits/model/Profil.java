package fr.bc.gestiondroits.model;

/**
 * La classe profil définit les profils associés à un utilisateur.
 * <p>
 * Exemple de profil : Administrateur, Utilisateur, Rédacteur
 */
public class Profil {

    /**
     * L'id de profil.
     */
    private Integer id;

    /**
     * Le nom de profil.
     */
    private String nom;

    /**
     * La description du profil.
     */
    private String description;

    /**
     * Instancie un nouveau profil.
     *
     * @param id          l'id
     * @param nom         le nom
     * @param description la description
     */
    public Profil(Integer id, String nom, String description) {
        super();
        this.id = id;
        this.nom = nom;
        this.description = description;
    }

    /**
     * Instancie un nouveau profil (constructeur par défaut).
     */
    public Profil() {
        super();
    }

    /**
     * Retourne l'id du profil.
     *
     * @return l'id du profil
     */
    public Integer getId() {
        return id;
    }

    /**
     * Paramètre l'id du profil.
     *
     * @param id le nouvel id du profil
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Retourne le nom du profil.
     * <p>
     * ex : "Administrateur"
     *
     * @return le nom du profil
     */
    public String getNom() {
        return nom;
    }

    /**
     * Défini le nom du profil.
     * <p>
     * ex : "Administrateur"
     *
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Retourne la description du profil.
     * <p>
     * exemple : "Superviseur des équipes techniques"
     *
     * @return la description du profil
     */
    public String getDescription() {
        return description;
    }

    /**
     * Défini la description du profil.
     *
     * @param description la nouvelle description du profil
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
