import java.util.Scanner;

public class Dio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer[] idade;
        int M = scan.nextInt();
        idade = new Integer[M];
        String string;
        String[] s;
        for( int i = 0; i < idade.length; i++ ){
            M = scan.nextInt();
            idade[i] = M;
            string = scan.nextLine();
            s = string.split(" ");
        }
        System.out.println("Nao poderao entrar as idades:");
        for( int i = 0; i < idade.length; i++ ){
            if((int)idade[i] < 7){
                continue;
            }
            if( idade[i] > 7 && idade[i] < 18 ){
                System.out.println((int)idade[i]);
            }
        }
    }
}

