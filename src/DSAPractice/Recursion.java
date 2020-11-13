package DSAPractice;

public class Recursion {

    public static void main(String[] args) {
        // declare array for use in iterativeArray method
        int[] arr = {1, 2, 3, 4, 5};

        // call iterativeArray method
        System.out.println(iterativeArray(arr));;

        // call recursiveArray method
        System.out.println(recursiveArray(arr, 4));

        // call iterative fibonacci
        System.out.println(iterativeFibonacci(5));

        // call recursive fibonacci method
        System.out.println(recursiveFibonacci(5));

        // call iterative factorial
        System.out.println(iterativeFactorial(4));

        // call recursive factorial
        System.out.println(recursiveFactorial(4));

    }

    // Exercise: given the following loop, write the same thing but recursively

    public static int[] iterativeArray(int[] array){
        // iterative version
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        return array;
    }

    // recursive version
    public static int[] recursiveArray(int[] array, int index){
        if (index != -1) {
            recursiveArray(array, index - 1);
            System.out.println(array[index]);
        }
        return array;
    }

    // Exercise: create method to get fibonacci sequence iteratively and recursively

    // iterative version
    public static int iterativeFibonacci(int n) {
        int t1 = 0;
        int t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        return n;
    }

    // recursive version
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            n = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
        return n;
    }

    // Exercise: create method to get factorial of a number recursively and iteratively

    // iterative version
    public static int iterativeFactorial (int num) {
        int result = 1;
        int i;

        for (i = 2; i <= num; i++){
            result *= i;
        }
        return result;
    }

    // recursive version
    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        } else {
            num = num * recursiveFactorial(num - 1);
        }
        return num;
    }
}
