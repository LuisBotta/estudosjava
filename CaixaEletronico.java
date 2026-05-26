public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 117.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Você retirou " + valorSolicitado + " seu saldo agora é de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }


    }

}
