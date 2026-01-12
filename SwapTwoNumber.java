public class SwapTwoNumber {
public static void main(String[] args) {
    int a=10;
    int b=20;
    System.out.println("BEFORE num1: "+a+" Num2: "+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("AFTER num1: "+a+" NUM2: "+b);

}
}
