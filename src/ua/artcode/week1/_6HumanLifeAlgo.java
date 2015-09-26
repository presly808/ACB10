package ua.artcode.week1;

/**
 * Created by serhii on 20.09.15.
 */
public class _6HumanLifeAlgo {

    public static void main(String[] args) {
        String name = "Human1";
        int health = 20;
        double money = 1500;
        char sex = 'M'; // or F
        int age = 25;

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
