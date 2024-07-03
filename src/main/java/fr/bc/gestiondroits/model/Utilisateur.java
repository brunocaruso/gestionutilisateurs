package fr.bc.gestiondroits.model;

import java.io.Serializable;
import java.util.Date;

/**
 * La classe Utilisateur centralise tous les utilisateurs.
 */
public class Utilisateur implements Serializable {

    /**
     * La constante serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * L'id utilisateur.
     */
    private Integer id;

    /**
     * Le matricule de l'utilisateur.
     * <p>
     * Il doit être unique et doit identifier clairement un utilisateur.
     */
    private String matricule;

    /**
     * Le prénom.
     */
    private String prenom;

    /**
     * Le nom.
     */
    private String nom;

    /**
     * La date de naissance.
     */
    private Date dateNaissance;

    /**
     * Le sexe.
     */
    private String sexe;

    /**
     * Le commentaire lié à un utilisateur.
     */
    private String commentaire;

    /**
     * Les adresses.
     */
    private Adresse adresse;

    /**
     * Les téléphones.
     */
    private Telephone telephones;

    /**
     * Les emails.
     */
    private Email emails;

    /**
     * Instanciation d'un nouvel utilisateur.
     *
     * @param id            l'id de l'utilisateur
     * @param matricule     le matricule de l'utilisateur
     * @param prenom        le prénom de l'utilisateur
     * @param nom           le nom de l'utilisateur
     * @param dateNaissance la date de naissance de l'utilisateur
     * @param sexe          le sexe de l'utilisateur
     * @param commentaire   le commentaire de l'utilisateur
     * @param adresse       l'adresse de l'utilisateur
     * @param telephones    les numéros de téléphone de l'utilisateur
     * @param emails        les adresses emails de l'utilisateur
     *                      <p>
     *                      Note : Utilisateur :
     *                      <p>
     *                      Si on gère les adresses, les téléphones et les emails et les dates de naissance
     *                      (problème de Date entre Date (SQL) et Date (Java Utils)
     */
    public Utilisateur(Integer id, String matricule, String prenom, String nom, Date dateNaissance, String sexe,
                       String commentaire, Adresse adresse, Telephone telephones, Email emails) {
        super();
        this.id = id;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.commentaire = commentaire;
        this.adresse = adresse;
        this.telephones = telephones;
        this.emails = emails;
    }

    /**
     * Instanciation d'un nouvel utilisateur.
     *
     * @param id          l'id de l'utilisateur
     * @param matricule   le matricule de l'utilisateur
     * @param prenom      le prénom de l'utilisateur
     * @param nom         le nom de l'utilisateur
     * @param sexe        le sexe de l'utilisateur
     * @param commentaire le commentaire de l'utilisateur
     */
    public Utilisateur(Integer id, String matricule, String prenom, String nom, String sexe, String commentaire) {
        super();
        this.id = id;
        this.matricule = matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.commentaire = commentaire;
    }

    /**
     * Instanciation d'un nouvel utilisateur.
     */
    public Utilisateur() {
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
     * Définit l'id.
     *
     * @param id le nouveau id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtient le matricule.
     *
     * @return le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Définit le matricule.
     *
     * @param matricule le nouveau matricule
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Obtient le prénom.
     *
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom.
     *
     * @param prenom le nouveau prénom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Obtient le nom.
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom.
     *
     * @param nom le nouveau nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtient la date de naissance.
     *
     * @return la date de naissance
     */
    public Date getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la date de naissance.
     *
     * @param dateNaissance la nouvelle date de naissance
     */
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    /**
     * Obtient le sexe.
     *
     * @return le sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Définit le sexe.
     *
     * @param sexe le nouveau sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * Obtient le commentaire.
     *
     * @return le commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Définit le commentaire.
     *
     * @param commentaire le nouveau commentaire
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * Récupère l'adresse.
     *
     * @return l'adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Définit l'adresse.
     *
     * @param adresse la nouvelle adresse
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * Récuupère les numéros de téléphone.
     *
     * @return les numéros de téléphone
     */
    public Telephone getTelephones() {
        return telephones;
    }

    /**
     * Définit les numéros de téléphone.
     *
     * @param telephones les nouveaux numéros de téléphone
     */
    public void setTelephones(Telephone telephones) {
        this.telephones = telephones;
    }

    /**
     * Récupère les emails.
     *
     * @return les emails
     */
    public Email getEmails() {
        return emails;
    }

    /**
     * Définit les adresses mails.
     *
     * @param emails les nouveaux mails
     */
    public void setEmails(Email emails) {
        this.emails = emails;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", matricule=" + matricule + ", prenom=" + prenom + ", nom=" + nom
                + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + ", commentaire=" + commentaire + "]";
    }
}
