package LambdaPractice;

// Ex: create lambda function that prints out the word Hello
// no parameters, 1 parameter, 2 parameters

// Step 1: create an anonymous expression (e.g., class that is abstract/concrete or interface)
// that intakes a method with 0-2 parameters that returns a specific data type

// interface
interface greeting {
    // a method that takes in no parameters and returns a String
    public String sayHello();
}

interface sum {
    // a method that takes in 1 parameter and returns an integer
    public int returnNum(int a);
}

interface concat {
    // a method that takes in 2 parameters and returns a String
    public String concatString(String a, String b);
}

public class Lambda {
    // Step 2: create lambda function by making an instance of our anonymous expression, greeting
    public static void main(String[] args) {
        // lambda expressions
        greeting message = () -> {
            return "Hello";
        };

        sum addNum = (number) -> {
            return number + 5;
        };

        concat strings = (s1, s2) -> {
            return s1 + s2;
        };

        // should print Hello
        System.out.println(message.sayHello());
        // should print 8 (5+3)
        System.out.println(addNum.returnNum(3));
        // should print Hello
        System.out.println(strings.concatString("He","llo"));
    }
}