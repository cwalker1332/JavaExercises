package CodecademyProjects;
import java.util.ArrayList;

class PrimeDirective {

    // create method that will return whether a number is a prime number
    public boolean isPrime(int number){
        /*
        can add:
        A method that filters an array for odd or even numbers
            (bonus points if it can do either depending on arguments passed in!).
        A method that returns an ArrayList of the first n primes in an array.
        A method that returns an ArrayList of the first n Fibonacci numbers.
         */


        // to account for edge numbers, if the number is 2 it should return true and if its < 2 it should return false
        if (number == 2){
            return true;
        } else if (number < 2){
            return false;
        }

        // for loop that returns whether or not a number is a prime number
        for (int i = 2; i < number; i++){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }

    // create ArrayList called onlyPrimes that returns a list of all prime numbers returned using isPrime
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<>();

        for (int number : numbers){
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        // create Array of numbers and print the numbers in the Array that are prime numbers
        PrimeDirective pd = new PrimeDirective();

        int[] numbers = {6, 29, 28, 11, 100, 101, 43, 89};

        System.out.println(pd.onlyPrimes(numbers));
    }
}