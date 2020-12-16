package CodecademyProjects;

// import necessary packages to run code
import java.util.*;

public class Magic8Ball{

    public static void main(String[] args){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called fortune be equal to the first randomly generated number
        with a maximum returned value of 8 */
        int fortune = rand.nextInt(9);

        // print fortune (randomly generated number)
        System.out.println(fortune);

        // make a switch statement to print a fortune based on the number that was randomly generated
        switch(fortune){
            case 1:
                System.out.println("A surprise from someone you love is coming soon!");
                break;
            case 2:
                System.out.println("Your smile is a treasure to all who know you.");
                break;
            case 3:
                System.out.println("You will enjoy good health.");
                break;
            case 4:
                System.out.println("Your present plans are going to succeed :)");
                break;
            case 5:
                System.out.println("It is up to you to create your own adventures.");
                break;
            case 6:
                System.out.println("You will meet a new opportunity without fear :)");
                break;
            case 7:
                System.out.println("Just do it!");
                break;
            case 8:
                System.out.println("To be loved, be loveable.");
                break;
            default:
                System.out.println("Error 404: No fortune found.");
                break;
        }
    }
}
