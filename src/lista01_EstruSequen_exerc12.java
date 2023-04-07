import java.util.Scanner;
/* Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Seu peso ideal.
* Descrição: 12.Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
* Data: 07/04/2023 */

public class lista01_EstruSequen_exerc12 {
    public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);
       
    System.out.print("Qual a sua altura em metros (Use virgulas)? ");
    double altura = entrada.nextDouble();

    System.out.printf("O seu peso ideal é: %.2f" , ((72.7*altura) - 58));
    entrada.close();
   }
}
