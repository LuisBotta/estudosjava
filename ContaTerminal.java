import java.util.Scanner;

public class ContaTerminal {
    static int conta = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número da conta desejada:");
        conta = sc.nextInt();
        System.out.println("Parabéns a conta " + conta + " foi criada com sucesso!");
        sc.close();
    }


}
