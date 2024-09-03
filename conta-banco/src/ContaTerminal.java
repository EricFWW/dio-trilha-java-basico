import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

      //TODO: Conhecer e importar a classe Scanner
        Scanner teclado = new Scanner(System.in);
      // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da agência!");
      // Obter pela Scanner os valores digitados no terminal
        numero = teclado.nextInt();

        System.out.println("Por favor, insira o nome da agência:");
        agencia = teclado.nextLine();

        System.out.println("Por favor, insira seu nome:");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        saldo = teclado.nextDouble();
      // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
