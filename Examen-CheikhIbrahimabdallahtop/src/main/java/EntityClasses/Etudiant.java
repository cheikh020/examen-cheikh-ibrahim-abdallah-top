/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package EntityClasses;

//Creation de la class Etudiant
public class Etudiant {
    private int Matricule;
    private String prenom;
    private String nom;
    private int age;
    private int idFiliere;
    
    //Constructeur d'initialisation de tous les champs
    public Etudiant(int Matricule, String prenom, String nom, int age, int idFiliere){
        this.Matricule = Matricule;
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.idFiliere = idFiliere;
    }
    
    //Constructeur sans paramètre
    public Etudiant(){
    }
    
    //Les Getter
    public int getMatricule(){
        return Matricule;
    }
    public String getPrenom() {
	return prenom;
    }
    public String getNom() {
	return nom;
    }
    public int getAge() {
	return age;
    }
    public int idFiliere() {
	return idFiliere;
    }
    
    //Les Setter
    public void setmatricule(int matricule){
        this.Matricule=matricule;
    }
    public void setprenom(String prenom){
	this.prenom=prenom;
    }
    public void setnom(String nom){
	this.nom=nom;
    }
    public void setage(int age){
	this.age=age;
    }
    public void idFiliere(int idFiliere){
	this.idFiliere=idFiliere;
    }
}