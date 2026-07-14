public class PrimeNumber {
    public static void main(String[] args) {
       boolean isPrime= true;
       int num=17;

       if (num<=1){
           System.out.println(num+" is not prime");
       }else{
           for (int i=2; i*i <= num; i++){
               if (num%i==0){
                   isPrime=false;
                   break;
               }
           }
       }

       if (isPrime){
           System.out.println(num+" is a Prime Number");
       }else {
           System.out.println(num+" is not a Prime Number");
       }
    }
}
