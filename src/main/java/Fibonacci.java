public class Fibonacci {

        public static void main(String[] args){
            int number = 10;
            int[] qb = new int[number + 1];
            for(int i=0; i<number ; i++) {
                int nth = i;
                System.out.print(fib(nth, qb)+"   ");
            }
        }
        // Find Fibonnaci of nth number
        // 0 1 1 2 3 5 8 13
        // Dynamic programming , Memonization , passing question bank
        static int fib(int n, int[] qb){
            //Base Case
            if (n == 1 || n == 0){
                return n;
            }
            if( qb[n] != 0){
                return qb[n];
            }
            //   System.out.println("Hello from " + n);
            int num1 = fib(n-1,qb);
            int num2 = fib( n -2,qb);
            int fibRes = num1 + num2;
            qb[n] = fibRes;
            return fibRes ;
        }

}
