package aula.semana4;

public class Exercicio01 {
		 
	    static void horiz() {
	           for (int comp = 1; comp < 11; comp++)
	                System.out.print("*");
	            System.out.println();
	    }
	 
	    static void lado() {
	        System.out.print("*");
	        for (int espaco = 1; espaco <= 8; espaco++)
	            System.out.print(" ");
	        System.out.println("*");
	    }
	 
	    public static void main(String[] args) {
	        horiz();
	        for (int vert = 1; vert < 4; vert++) lado();
	        horiz();
	    }
	}

/* Exercicio: Determine o que cada um dos trechos de código a seguir irá imprimir:

a)

for(int cont = 1; cont <= 5; cont++)
    System.out.println("Oi");

Resposta:
Oi
Oi
Oi
Oi
Oi

b)
for(int cont = 1; cont <= 5; cont++)    System.out.print("Oi");

Resposta:
OiOiOiOiOi

 
c)
for(int cont = 1; cont <= 3; cont++)  {
    System.out.print("Oi");
    System.out.print(" Programador"); }
}

Resposta:

Oi ProgramadorOi ProgramadorOi Programador
 
 
d)

class Resolve {
 
    static void horiz() {
           for (int comp = 1; comp < 11; comp++)
                System.out.print("*");
            System.out.println();
    }
 
    static void lado() {
        System.out.print("*");
        for (int espaco = 1; espaco <= 8; espaco++)
            System.out.print(" ");
        System.out.println("*");
    }
 
    public static void main(String[] args) {
        horiz();
        for (int vert = 1; vert < 4; vert++) lado();
        horiz();
    }
}

Resposta:

**********
*        *
*        *
*        *
**********

*/