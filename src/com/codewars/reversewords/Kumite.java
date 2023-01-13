package com.codewars.reversewords;

public class Kumite {

	public static boolean block(int[] attackers, int[] defenders){
	    int puntuacionAtacamtes=0;
	    int puntuacionDefensores=0;
	    
	    for (int i=0; i<attackers.length && i<defenders.length; i++) {
	      if (attackers[i]>defenders[i]) {
	        puntuacionAtacamtes++;
	      }
	      else if (attackers[i]<defenders[i]) {
	        puntuacionDefensores++;
	      }
	    }
	    if (attackers.length>defenders.length) {
	      puntuacionAtacamtes+=attackers.length-defenders.length;
	    }
	    else if (attackers.length<defenders.length) {
	      puntuacionDefensores+=defenders.length-attackers.length;
	      
	    }
	    
	    if (puntuacionAtacamtes > puntuacionDefensores) {
	      return false;
	    }
	    else if (puntuacionAtacamtes < puntuacionDefensores) {
	      return true;
	    }
	    else {
	      int sumaFuerzasAtacante=0;
	      int sumaFuerzasDefensores=0;
	      for (int i=0; i<attackers.length; i++) {
	        sumaFuerzasAtacante=sumaFuerzasAtacante+attackers[i];
	      }
	      for (int i=0; i<defenders.length; i++) {
	        sumaFuerzasDefensores=sumaFuerzasDefensores+defenders[i];        
	      }
	      if (sumaFuerzasAtacante>sumaFuerzasDefensores){
	        return false;
	      }
	      else {
	        return true;
	      }
	    }
	    
  }

}
