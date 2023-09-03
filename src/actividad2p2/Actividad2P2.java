/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2p2;

/**
 *
 * @author simon
 */
public class Actividad2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Trapecio figura5=new Trapecio(1,5,2);
        Rombo figura6 =new Rombo(16,12);

        System.out.println("El area del circulo es = " + figura1.
        calculararea());
        System.out.println("El perimetro del circulo es = " + figura1.
        calcularperimetro());
        System.out.println();

        System.out.println("El area del rectangulo es = " + figura2.
        calculararea());
        System.out.println("El perimetro del rectangulo es = " + figura2.
        calcularperimetro());
        System.out.println();

        System.out.println("El area del cuadrado es = " + figura3.
        calculararea());
        System.out.println("El perimetro del cuadrado es = " + figura3.
        calcularperimetro());
        System.out.println();

        System.out.println("El area del triangulo es = " + figura4.
        calculararea());
        System.out.println("El perimetro del triángulo es = " + figura4.
        calcularperimetro());
        figura4.determinartipotriangulo();
        System.out.println();

        System.out.println("El area del trapecio es = " + figura5.
        calculararea());
        System.out.println("El perimetro del trapecio = " + figura5.
        calcularperimetro());
        System.out.println();

        System.out.println("El area del rombo es = " + figura6.
        calculararea());
        System.out.println("El perimetro del rombo = " + figura6.
        calcularperimetro());
    }
    
}
