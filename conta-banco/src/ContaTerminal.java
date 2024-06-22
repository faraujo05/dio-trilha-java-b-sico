import java.util.Scanner;

public class ContaTerminal {
    


public static void main(String[] args) throws Exception {
    
   String nomeCliente = "Fabio";
    int numeroAgência;
    String contaCorrente;
    double saldoConta = 237.48;

    
    Scanner imput = new Scanner(System.in);
    
    System.out.println("Digite o numero da Agência ");
    int numero = imput.nextInt();

    System.out.println("Digite o numero da Conta Corrente ");
    contaCorrente = imput.next();

    
    


        
    System.out.println("Olá " + nomeCliente + "," + " obrigado por criar uma conta em nosso banco, sua agência " + numero + ", " + "conta " + contaCorrente + " e seu saldo " + saldoConta + " já está disponível para saque.");
    

}

}
