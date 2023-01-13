package com.codewars.reversewords;

public class ReverseWords {
	public static void main(String[] args) {
		String frase="Hola mundo grande!";
		String resultado=reverseWords(frase);
		System.out.println("Resultado: "+resultado);
	}

	 public static String reverseWords(String str){
	     //write your code here...
	   String[] palabras=str.split(" ");
	   String resultado="";
	   for (int i=palabras.length-1; i>=0; i--) {
		   if (i==palabras.length-1) {
			   resultado+=palabras[i];
		   }
		   else {
			   resultado+=" "+palabras[i];
		   }
		  
	   }
	   
	   return resultado;
	 }
}
