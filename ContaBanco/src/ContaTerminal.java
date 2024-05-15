import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: conhecer e importar a classe Scanner 
        String regex = "[A-Za-z0-9\\-]+";
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
                 

        //Exibir as mensagens para o usuário
        System.out.println("Digite seu nome completo ");
        String nome = scanner.next();

        System.out.println("Digite sua agência ");       
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu saldo ");
        double saldo = scanner.nextDouble();

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem final da conta triada 
        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque." );


    }
}
