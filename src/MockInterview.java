public class MockInterview {
   static void Fibonacci(int N){
       int num1 = 0;
       int num2 = 1;
       System.out.println(num1);
       int counter = 0;

       while(counter < N) {
         int num3 = num1 + num2;
           System.out.println(num3);
         num1 = num2;
         num2 = num3;
         ++counter;
       }
   }


    public static void main(String[] args) {
       int N = 15;
       Fibonacci(N);

    }


}
