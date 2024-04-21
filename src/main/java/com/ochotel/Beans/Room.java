package com.ochotel.Beans;

public class Room {

	private int id;
	  private String type;
	  private int prix;
	  private String equipements;
	  private boolean disponibilite;
	  
	  
	  
	public Room(int id, String type, int prix, String equipements, boolean disponibilite) {
		super();
		this.id = id;
		this.type = type;
		this.prix = prix;
		this.equipements = equipements;
		this.disponibilite = disponibilite;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getPrix() {
		return prix;
	}



	public void setPrix(int prix) {
		this.prix = prix;
	}



	public String getEquipements() {
		return equipements;
	}



	public void setEquipements(String Equipements) {
		this.equipements = Equipements;
	}



	public boolean isDisponibilite() {
		return disponibilite;
	}



	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	  
	  
	  

}
