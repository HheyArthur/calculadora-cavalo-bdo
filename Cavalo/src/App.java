import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("1- Doom ");
        System.out.println("2- Unicornio ");
        System.out.println("3- Pegasus ");
        int x = ler.nextInt();
        
        // validação das opções

        if (x==1 ) {
        
//calculo Doom

        int nv = 30;  
        int hab = 25;
        System.out.println("Informe o nivel atual do cavalo: ");
        int nvatual = ler.nextInt();
        System.out.println("Informe a quantidade de habilidades atuais do cavalo: ");
        int habatual = ler.nextInt();
        
        int conta1 = nv - nvatual;
        int conta2 = hab - habatual;
        int conta3 = conta1 - conta2;

        //validação do resultado do calculo

        if (conta3 == 0) {
        System.out.println("Você precisa usar um cupom" );
        } else {
        System.out.println("Você precisa não precisa usar cupom" );
         }
    } 
    
    // calculo Unicornio e Pegasus

    else if (x != 1) {
        int nv = 30;
        int hab = 24;
        System.out.println("Informe o nivel atual do cavalo: ");
        int nvatual = ler.nextInt();
        System.out.println("Informe a quantidade de habilidades atuais do cavalo: ");
        int habatual = ler.nextInt();
        
        int conta1 = nv - nvatual;
        int conta2 = hab - habatual;
        int conta3 = conta1 - conta2;

//validação do resultado do calculo

        if (conta3 == 0) {
        System.out.println("Você precisa usar um cupom" );
        } else {
        System.out.println("Você precisa não precisa usar cupom" );
         }
        
    }
    }
}
