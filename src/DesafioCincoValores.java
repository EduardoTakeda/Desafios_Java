
import java.io.IOException;
import java.util.Scanner;

public class DesafioCincoValores {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int entrada;

//continue a solução
        for (int i=0;i<5;i++ ) {
            entrada= leitor.nextInt();
            if (entrada>0) positivo++;
            if (entrada<0) negativo++;
            if (entrada%2==0) par++;
            if (entrada%2!=0) impar++;
        }
//insira suas variaveis corretamente
        System.out.println( par+ " valor(es) par(es)");
        System.out.println( impar+ " valor(es) impar(es)");
        System.out.println( positivo+ " valor(es) positivo(s)");
        System.out.println( negativo+ " valor(es) negativo(s)");
    }

}
