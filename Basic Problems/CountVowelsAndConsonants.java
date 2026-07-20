
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "Programming";
        int vCount=0;
        s=s.toLowerCase();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)== 'a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u'){
                vCount++;
            }
        }
        System.out.println("No of Vowels: "+vCount);
        System.out.println("No of Consonents: "+(s.length()-vCount));
    }
}
