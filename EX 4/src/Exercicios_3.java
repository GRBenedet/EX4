public class Exercicios_3 {
    public static void main(String[] args) {
        int i;
        int [] vetorB = new int[10];

        for (i = 0; i < vetorB.length; i++){
            if (i %2==0) {
                vetorB[i] = 20;
         
            }
            else {
                vetorB[i] = 10;
               
            }
        }
        System.out.println("este é seu vetor");
        for (i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
    }
}
