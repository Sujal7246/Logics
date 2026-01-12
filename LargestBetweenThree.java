public class LargestBetweenThree {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=50;
        if(a>b && a>c){
            System.out.println("num1 is greatest");
        }else if (b>a && b>c){
            System.out.println("num2 is greatest");
        }else{
            System.out.println("num3 is greatest");
        }
    }
}
