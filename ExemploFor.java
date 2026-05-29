public class ExemploFor {

    public static void main(String[] args) {

    //Exemplo básico de For
     /*   for  (int carneiros = 0; carneiros <= 10; carneiros++) {
            System.out.println("Contando carneirinhos: " + carneiros);
        }

        System.out.println("O Guerreiro dormiu");
*/

        String alunos[] = {"FELIPE","JONAS","JULIA","MARCOS"};

    //Exemplo de For com Array
    /*
        for(int i=0; i < alunos.length;i++){
            System.out.println("O aluno no indice i= " + i + " é " + alunos[i]);

        }*/

    //For each para Array

        for(String aluno : alunos){
            System.out.println("Nome do aluno: " + aluno);
        }



    }
}
