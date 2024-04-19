import java.util.Scanner;

public class Exercicios_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i;
        int [] vetorX = new int[10];
        int [] vetorY = new int[10];

        for (i = 0; i < vetorX.length; i++){
            System.out.println("defina os elemento");
            vetorX[i] = ler.nextInt(); 


            if (i %2==0) {
                vetorY[i] = vetorX[i] * 2;
         
            }
            else {
                vetorY[i] = vetorX[i] * 3;
               
            }
        }
        System.out.println("este é o vetor Y");
        for (i = 0; i < vetorY.length; i++){ 
            System.out.println(vetorY[i]);
        }
    }

}
