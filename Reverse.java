public class Reverse {
    public static void main(String[] args) {
        int i=1234;
        int digit;
        int rev=0;
        while(i>0){
            digit=i%10;
            rev =rev*10 + digit;
            i=i/10;
        }
        System.out.println(rev);
    }
    
}
