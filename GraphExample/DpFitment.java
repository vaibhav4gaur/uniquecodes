public class DpFitment {
      static int fibo(int n){
        if(n==0 || n==1)
        {
            return n;
        }
        int firstTerm = fibo(n-1);
        int secondTerm = fibo(n-2);
        int thirdTerm = firstTerm + secondTerm;
        return thirdTerm;
      }
      public static void main(String[] args){
          System.out.println(fibo(6));
      }   
}
