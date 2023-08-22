import java.util.Scanner;
public class watermelon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Weight Of Watermelan : ");
        int weight = sc.nextInt();
        if (weight>=4 && weight%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}