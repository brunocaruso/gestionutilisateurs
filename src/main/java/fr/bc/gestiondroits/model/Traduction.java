package fr.bc.gestiondroits.model;

/**
 * La classe Traduction gère le texte du contenu à afficher selon 2 critères :
 * - la clé de droit : ex : "2" pour "tool.server.salle4"
 * - la langue id : ex : "1" pour "français"
 */
public class Traduction {

    /**
     * L'id de la traduction.
     */
    private Integer id;

    /**
     * L'id de la clé du droit lié à la traduction.
     * <p>
     * exemple : "1" pour "tool.server.salle3"
     */
    private Integer droitCleId;

    /**
     * L'id de la langue liée à la traduction.
     * <p>
     * ex : 1 correspondant à "FR" / "Français"
     */
    private Integer langueId;
}
