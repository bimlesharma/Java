import java.util.Scanner;

public class newJavaFile5biml{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = myObj.nextInt();
        
        FibonacciSeries.generateFibonacci(number);
    }
}

class FibonacciSeries{
    static void generateFibonacci(int n){
        int firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series till " + n + " terms");
        
        for(int i = 1 ; i <= n ; i++ ){
            System.out.print(firstNum + ", ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}