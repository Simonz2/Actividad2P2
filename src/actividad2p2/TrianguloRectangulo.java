package actividad2p2;

public class TrianguloRectangulo {
    int base;//atributo que define la base del triangulo
    int altura;//atributo que define la altura del triangulo

    //constructor de la clase TrianguloRectangulo
    TrianguloRectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }

    //metodo que calcula el area del triangulo
    double calculararea(){
        return (base*altura/2);
    }

    //metodo que calcula el perimetro
    double calcularperimetro(){
        return (base+altura+calcularhipotenusa());
    }

    //metodo que calcula la hipotenusa
    double calcularhipotenusa(){
        return Math.pow(base*base+altura*altura,0.5);
    }

    void determinartipotriangulo(){
        if((base==altura) && (base==calcularhipotenusa())){
            System.out.println("Es un triangulo equilatero");
            //todos los lados iguales
        }
        
        else if((base!=altura)&&(base!=calcularhipotenusa())&&
        (altura!=calcularhipotenusa())){
            System.out.println("Es un triangulo escaleno");
            //todos los lados son diferentes
        }

        else{
            System.out.println("Es un triangulo isosceles");
            //dos lados iguales
        }
    }
}
