import java.util.Scanner;

public class Exercicios_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, mult = 1, soma = 0, opcoes; 
        double media;


        System.out.println("defina vetor");
        int[] vetor = new int[6];
        for (i = 0; i < vetor.length; i++){
            vetor[i] = ler.nextInt();
        }
        System.out.printf("----- opções ----- %n" + "1 - soma dos elementos %n" + "2 - produtos dos elementos %n" + "3 - media dos elementos %n" + "4 - mostrar vetor %n");
        opcoes = ler.nextInt();
        switch (opcoes) {
            case 1:
            System.out.println("Você escoleu a opcão 1");
            for (i = 0; i < vetor.length; i++) {
                soma = soma + vetor[i];
            }
            System.out.println(soma);
            break;
            case 2:
            System.out.println("Você escoleu a opcão 2");
            for (i = 0; i < vetor.length; i++) {
                mult = mult * vetor[i];
            }
            System.out.println(mult);
            break;
            case 3:
            System.out.println("Você escoleu a opcão 3");
            for (i = 0; i < vetor.length; i++) {
                soma = soma + vetor[i];
            }
            media = soma / 6;
            System.out.println(media);
            break;
            case 4:
            System.out.println("Você escoleu a opcão 3");
            for (i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }
            break;
            default:
                break;
        }
    }
}
