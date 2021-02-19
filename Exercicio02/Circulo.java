package Exercicio02;

public class Circulo implements AreaCalculavel{
    private double raio;
    double pi=3.1415;

    public Circulo(double raio){
        this.setRaio(raio);

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    @Override
    public double calcularArea(){
        return 2 * pi * getRaio();
    }

}