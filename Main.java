import java.util.*;

public class Main { 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean on = true;

        do { 
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit");
            System.out.print("\nChoose your pet number: ");
            Integer choice = input.nextInt();

            switch(choice){
                case 1: pet = new Dog();

                    
                    break;
                case 2: pet = new Cat();


                    break;
                case 3:
                    on = false;
            }
        } while (on);
        }
    }
}