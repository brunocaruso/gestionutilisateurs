package fr.bc.gestiondroits.model;

/**
 * La classe Langue gère les différentes langues supportées par ce projet.
 * <p>
 * FR (Français)
 * EN (Anglais)
 * IT (Italien)
 */
public class Langue {

    /**
     * id : l'identifiant de la langue.
     */
    private Integer id;

    /**
     * code : le code de la langue (ex : "FR" ou "IT").
     */
    private String code;

    /**
     * nom : le nom de la langue.
     * <p>
     * Il devra être dans la langue du code correspondant
     * exemple :
     * <p>
     * - FR => "Français"
     * - EN => "English"
     * - IT => "Italiano"
     */
    private String nom;

    /**
     * defaut : la langue par défaut.
     * <p>
     * Valeur booléenne (éventuellement un Integer) :
     * - 0 = Langue pas par défaut
     * _ 1 = Langue par défaut
     */
    private boolean defaut;

    /**
     * Obtient l'id de la langue.
     *
     * @return l'id de la langue
     */
    public Integer getId() {
        return id;
    }

    /**
     * Obtient le code.
     *
     * @return le code de la langue (ex : "FR", "EN", "IT")
     */
    public String getCode() {
        return code;
    }

    /**
     * Obtient le nom de la langue (ex : "français").
     *
     * @return le nom de la langue
     */
    public String getNom() {
        return nom;
    }

    /**
     * Obtient si la langue est défini par défaut ou non.
     * <p>
     * 1 = par défaut
     * 0 = pas par défaut
     *
     * @return si la langue est par défaut
     */
    public Boolean getDefaut() {
        return defaut;
    }

    /**
     * Défini l'id de la langue.
     *
     * @param id le nouveau id de la langue
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Défini le code.
     *
     * @param code le nouveau code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Défini le nom.
     *
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Défini la valeur par défaut de la langue.
     * <p>
     * - 0 = pas par défaut
     * - 1 = par défaut
     *
     * @param defaut la valeur de la langue par défaut
     */
    public void setDefaut(boolean defaut) {
        this.defaut = defaut;
    }
}
