import java.util.*;

public class Random_Numbers {
    public static int random_number() {
        int random_num = (int) (Math.random() * 100);
        return random_num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lucky_num = random_number();
        int chance = 3;
        while (chance != 0) {
            chance -= 1;
            System.out.println("Enter a number between 1 and 100:");
            int number_entered = sc.nextInt();
            if (number_entered == lucky_num) {
                System.out.println("Congratulations! You guessed the lucky number!");
                break;
            } else if (lucky_num > number_entered) {
                System.out.println("You Entered A Lesser Number");
                System.out.println(chance + " chance left");
            } else if (lucky_num < number_entered) {
                System.out.println("You Entered A Greater Number");
                System.out.println(chance + "chance left");
            }
        }
        System.out.println("Lucky Number Is : " + lucky_num);
    }
}
