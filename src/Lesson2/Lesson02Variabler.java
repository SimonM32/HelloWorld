package Lesson2;

public class Lesson02Variabler {
    public static void main(String[] args) {
        int age = 21;
        int year = 2026;
        int quantity = 1;
// int bruge til hele numre
        double price = 19.99;
        double gas = 3.5;
        double temperature = -12.5;
// double kan bruge decimal tal
        char grade = 'A';
        char symbol = '#';
        char valuta = '$';
// Char bruges til bogstaver og symboler
        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnlime = true;
// boolean bruges når noget er true eller false

        if(isStudent == true){
           //System.out.println("You are a student");
        }
        else {
            //System.out.print("You are NOT a student");

            String name = "Bro Code";
            String food = "pizza";
            String email = "fake123@gmail.com";
            String car = "Mustang";
            String color = "red";

            System.out.println("Your choice is a " + color + " " + year + " " + car);
            System.out.println("The price is: " + valuta + price);

            if(forSale == true){
                System.out.println("There is a " + car + " for sale");
            }
            else{
                System.out.println("The " + car + " is not for sale");
            }
        }



    }
}
