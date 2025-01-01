public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Factorial Program Started!");

        testFactorial(5, 120); 
        testFactorial(0, 1);  
        testFactorial(1, 1);  


        System.out.println("All tests passed!");
    }

    public static int factorial(int n) {
        assert n >= 0 : "Number must be non-negative! Received: " + n;

        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;

            assert result > 0 : "Integer overflow occurred at i = " + i + ", result = " + result;
        }
        return result;
    }

    public static void testFactorial(int input, int expectedOutput) {
        int actualOutput = factorial(input);
        assert actualOutput == expectedOutput :
                "Test failed for input: " + input + ". Expected: " + expectedOutput + ", but got: " + actualOutput;
        System.out.println("Test passed for input: " + input);
    }
}
