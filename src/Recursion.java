public class Recursion {

    public static void main(String[] args) {
        // declare array for use in iterativeArray method
        int[] arr = {1, 2, 3, 4, 5};

        // call iterativeArray method
        iterativeArray(arr);

        // call recursiveArray method
        recursiveArray(arr, 4);

        // call iterative fibonacci
        int n = 100;
        iterativeFibonacci(n);

        // call recursive fibonacci method
        System.out.println(recursiveFibonacci(6));
    }

    // Exercise: given the following loop, write the same thing but recursively

    public static void iterativeArray(int[] array){
        // iterative version
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    // recursive version
    public static void recursiveArray(int[] array, int index){
        if (index != -1) {
            recursiveArray(array, index - 1);
            System.out.println(array[index]);
        }
    }

    // Exercise: create method to get fibonacci sequence iteratively and recursively

    // iterative version
    public static void iterativeFibonacci() {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
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
    public static int factorial (int num) {
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
