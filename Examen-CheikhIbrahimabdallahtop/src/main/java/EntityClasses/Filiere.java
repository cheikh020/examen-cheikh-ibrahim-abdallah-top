/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntityClasses;

//Creation de la class Etudiant
public class Filiere {
    private int idFiliere;
    private String Libelle;
   protected String Description;
   
    
    //Constructeur d'initialisation de tous les champs
    public Filiere(int idFiliere, String Libelle, String Description){
        this.idFiliere = idFiliere;
        this.Libelle = Libelle;
        this.Description =Description;
      
    }
    
    //Constructeur sans paramètre
    public Filiere(){
    }
    
    //Les Getter
    public int idFiliere(){
        return idFiliere;
    }
    public String getLibelle() {
	return Libelle;
    }
    public String getDescription() {
	return Description;
    }
    
    
    //Les Setter
    public void idFiliere(int idFiliere){
        this.idFiliere=idFiliere;
    }
    public void setLibelle(String Libelle){
	this.Libelle=Libelle;
    }
    public void setDescription(String Description){
	this.Description=Description;
    }
   }