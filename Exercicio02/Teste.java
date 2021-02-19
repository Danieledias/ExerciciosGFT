package Exercicio02;

public class Teste{

    public static void main(String [] args){

        Quadrado quadrado=new Quadrado(5);

        Circulo circulo= new Circulo(5);

        Retangulo retangulo= new Retangulo(3,12);


        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: "+retangulo.calcularArea());


    }

}
