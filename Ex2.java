import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = sc.nextInt();
        int contador = 0;
        int[] fibonacci = new int[numero];

        for(int i = 0; i < fibonacci.length; i++){
            if(i == 0){
                fibonacci[i] = 0;
            }

            else if(i == 1){
                fibonacci[i] = 1;
            }

            else{
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }

            System.out.print(fibonacci[i] + " ");
        }

        for(int i = 0; i < numero; i++){
            if(numero == fibonacci[i]){
                contador = 1;
            }
        }

        if(contador == 1){
            System.out.println("\nO número pertence a sequência.");
        }else{
            System.out.println("\nO número não pertence a sequência.");
        }

        sc.close();
    }
}
