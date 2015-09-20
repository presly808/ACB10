import java.util.Scanner;

public class _6HumanLifeAlgoWithScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Input name");
        String name = sc.next();
        System.out.println("Input health");
        int health = sc.nextInt();

        System.out.println("Input money");
        double money = sc.nextDouble();
        System.out.println("input age");
        int age = sc.nextInt();

        int healthLimit = 30;


        if(health < healthLimit){
            System.out.println(name + " is weak");
            if(money > 1000){
                System.out.println("He will live");
            } else {
                System.out.println("Sorry, maybe next time");
            }
        } else {
            if(age > 16 && age < 40){
                System.out.println(name + ", have a nice day");
            } else {
                if(age <= 16){
                    System.out.println("You dont have full rights:(");
                } else {
                    System.out.println("Too old for fun");
                }
            }
        }



    }
}
