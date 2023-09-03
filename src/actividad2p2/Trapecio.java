package actividad2p2;

public class Trapecio {
    int basemenor;//atributo que define la base menor del trapecio
    int basemayor;//atributo que define la base mayor del trapecio
    int altura;//atributo que define la altura del trapecio

    //constructor de la clase trapecio
    Trapecio(int basemenor,int basemayor,int altura){
        this.basemenor=basemenor;
        this.basemayor=basemayor;
        this.altura=altura;
    }

    //metodo para calcular y devolver el area del trapecio
    double calculararea(){
        return ((basemayor+basemenor)*altura/2);
    }

    double calcularperimetro(){
        return basemayor+basemenor+2*calcularhipotenusa();
    }
    
    private double calcularhipotenusa(){
        return Math.sqrt(Math.pow((basemayor-basemenor)/2,2)+Math.pow(altura,2));
    }
}
