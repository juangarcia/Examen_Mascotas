package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class perro extends Model{

	public String nombre;
	public int edad;



public perro (String n, int e)
{
	nombre = n;
	edad = e;
}
}