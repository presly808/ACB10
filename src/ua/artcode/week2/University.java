package ua.artcode.week2;

/**
 * Created by serhii on 26.09.15.
 */
public class University {


    // signature -> interface for user, name is verb
    // public static <return_type> <name> (<arg_type> <arg_name>){<logic>}
    // public static <return_type> <name> (){<logic>}
    //
    public static String buyCoffee(double money, int choice){
        // logic
        int middleCoffeePrice = 10;

        if(money < middleCoffeePrice){
            return "Not enough money"; // return and destroy frame
        }

        if(choice == 1){
            return "Americano";
        } else if(choice == 2){
            return "Capucino";
        }

        return "Wrong choice";
    }


}
