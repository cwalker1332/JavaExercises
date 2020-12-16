package CodecademyProjects;

    // this code is my answer to the common FizzBuzz challenge

public class FizzBuzz{

    public static void main(String[] args){

        /*
        create a for loop that prints numbers 1 through 100, but for values
        divisible by 3 print "Fizz", for values divisible by 5 print "Buzz",
        and for values divisible by 3 AND 5 print "FizzBuzz"
         */
        for(int i = 1; i <= 100; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0){
                System.out.println("Fizz");

            } else if (i % 5 == 0){
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }
}