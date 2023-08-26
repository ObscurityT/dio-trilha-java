import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parametro: ");
        int parametro01 = scanner.nextInt();

         System.out.println("Digite o segundo parametro: ");
        int parametro02 = scanner.nextInt();

        scanner.close();

        try 
        {
            contar(parametro01, parametro02);

        } catch (ParametrosInvalidosException e)
        {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametro01, int parametro02 ) throws ParametrosInvalidosException {

        if(parametro01 > parametro02)
        {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro02 - parametro01;
        System.out.println("Acontecerão " + contagem + " ocorrencias");
        for(int i = 0; i < contagem; i++)
        {
            System.out.println("Imprimindo o numero: " + (i + 1));
        }
    }
}
