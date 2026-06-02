import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro precisa ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;
        if(parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        } else{
            for(int i = 0;i<contagem;i++){
                System.out.println("Imprimindo o número: " + i);

            }
        }
    }
}


