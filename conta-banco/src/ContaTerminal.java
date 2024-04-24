import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        int numeroID = 1;
        System.out.println("Qual numero da conta? ");
        numeroID = numero.nextInt();

        Scanner agencia = new Scanner(System.in);
        String agenciaID = "abc";
        System.out.println("Qual Numero da agencia?  ");
        agenciaID = agencia.nextLine();

        Scanner nome = new Scanner(System.in);
        String nomeCLiente = "abc";
        System.out.println("Qual seu nome ? ");
        nomeCLiente = nome.nextLine();

        double saldoTotal = 23556.58;          

        System.out.printf("Olá" + nomeCLiente + "brigado por criar uma conta em nosso banco, sua agência é " +agenciaID + "conta" +numeroID +"e seu saldo" +saldoTotal  + "já está disponível para saque" );


    }
}
