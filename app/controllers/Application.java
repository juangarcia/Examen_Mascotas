package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void alta(String nom, int edad) {
        perro u = null;
    	if (nom != null && !nom.equals(""))
    	    u = new perro (nom, edad).save();
    	
    	render(u);
    }
    
    public static void altarazas(String t, String d) {
        razas r = null;
    	if (t != null && !t.equals("")){
    	    r = new razas (t,d).save();
    	}
    	render(r);
    }
    
    public static void cambio(String nom1, String nom2) {
   	 perro u = null;
    	if (nom1 != null && !nom1.equals("")){
    	    u = perro.find("byNombre", nom1).first();
    	    
    	    if ( u != null){
    	    	u.nombre = nom2;
    	    	u.save();
    	    }
    	    
    	}
   	render(u);
   }
    public static void cambiorazas(String t, String t2) {
        razas r = null;
    	if (t != null && !t.equals("")){
    		r= razas.find("byTipo", t).first();
    	if ( r != null){
    	    	r.tipo = t2;
    	    	r.save();
    	    }
    	}
    	render(r);
    }
    
    public static void baja(String nom) {
      	 perro u = null;
       	if (nom != null && !nom.equals("")){
       	    u = perro.find("byNombre", nom).first();
       	    
       	    if ( u != null){
       	    	
       	    	u.delete();
       	    }
       	    
       	}
      	render(u);
      }
    public static void bajarazas(String t) {
     	 razas r = null;
      	if (t != null && !t.equals("")){
      	    r = razas.find("byTipo", t).first();
      	    
      	    if ( r != null){
      	    	
      	    	r.delete();
      	    }
      	    
      	}
     	render(r);
     }

}