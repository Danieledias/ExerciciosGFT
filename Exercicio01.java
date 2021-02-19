import java.util.Scanner;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Multiplicando: ");
        int multiplicando= scan.nextInt();

        System.out.println("Início do intervalo: ");
        int inicio=scan.nextInt();

        System.out.println("Fim do intervalo: ");
        int fim=scan.nextInt();

        if(multiplicando>0 && multiplicando<=3000 && inicio>0 && fim>0 && inicio<=3000 && fim<=3000
                && fim-inicio<=10)
        {
            System.out.println("Válida");
            for(int ini=inicio; ini<=fim; ini++){
                System.out.println(multiplicando + " X " + ini+ "=" + multiplicando*ini);

            }

        }else if(inicio>fim)
        {
            System.out.println("O início do intervalo deve ser que seu fim");
        }
        else{
            System.out.println("Inválida");
        }

    }

}