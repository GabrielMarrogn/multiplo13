import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = 0;

        if(a > b){
            int temp = b;
            b = a;
            a = temp;
        }

        for(int i = a; i <= b; i++){
            if(i%13 != 0){
                soma+= i;
            }
        }

        System.out.println(soma);
        sc.close();
    }
}
