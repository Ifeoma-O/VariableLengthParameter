import java.util.Scanner;

public class variableLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();
        double[] num = new double[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++){
            num[i] = scanner.nextDouble();
        }

        printMax(num);

    }
    public static void printMax(double... numbers){
        double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > result){
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
