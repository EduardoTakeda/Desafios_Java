import java.io.IOException;
import java.util.Scanner;

public class  DesafioIdade {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        //complete o codigo
        int n;
        double soma=0d;
        do {
            n = leitor.nextInt();
            if (n<0) break;
            if (n > 0) {
                //complete o codigo
                soma += n;
                cont++;
                //o teste reservado 5, só passa se o cont++ estiver dentro do if
            }
        } while (n > 0);
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }

}

