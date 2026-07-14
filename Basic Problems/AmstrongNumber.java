
public class AmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int temp=num;
        int sum=0;
        while (num>0){
            int digit=num%10;
            sum=sum+digit*digit*digit;
            num=num/10;
        }
        if (temp==sum){
            System.out.println(temp+ " is an Amstrong Number");
        }else {
            System.out.println(temp+ " is not an Amstrong Number");
        }
    }
}
