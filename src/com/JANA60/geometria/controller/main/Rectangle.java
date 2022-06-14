package com.JANA60.geometria.controller.main;


/*
 * una classe Rettangolo con due attributi interi: base e altezza. 
 * La classe ha due metodi che calcolano 
 * e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
 */

public class Rectangle //si tratta di uno stampo che permette di costruire qualsiasi rettangolo di qualsiasi dimensione
{
	int width, height; //ogni rettangolo ha SEMPRE una base e un'altezza

	
	
	int getArea() //metodo per il calcolo dell'area: deve restituire solo e soltanto un int
	{
		
		return width * height;
	}
	
	int getPerimeter() //idem per il perimetro
	{
		return (width+height) * 2;
	}
	
	public String toString() //questo invece mi restituisce una stringa per poterla stampare a schermo poi nel main
	{
		return "Il rettangolo di base " +width+" e altezza " +height+" ha area " + getArea()+ " e perimetro " +getPerimeter()+ ".";
	}
	
	
}
