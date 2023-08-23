import java.util.Scanner;
public class domino{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Box : ");
        int M = sc.nextInt();
        System.out.println("Enter The Width Of The Box : ");
        int N = sc.nextInt();
        int count = (M*N)/2;
        System.out.println(count);
    }
}
