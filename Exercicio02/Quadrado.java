package Exercicio02;

public class Quadrado implements AreaCalculavel{
    private double lado;

    public Quadrado(double lado){
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return getLado() * getLado();
    }


}