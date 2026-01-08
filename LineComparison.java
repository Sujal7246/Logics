import java.util.*;
public class LineComparison {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter cordinates of X1 and Y1: ");
       int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter cordinates of X2 and Y2: ");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
       int dx=x2-x1;
       int dy=y2-y1;
       System.out.println("Enter cordinates of second X3 and Y3: ");
       int x3=sc.nextInt();
       int y3=sc.nextInt();
         System.out.println("Enter cordinates of second X4 and Y4: ");
         int x4=sc.nextInt();
         int y4=sc.nextInt();
         int dx1=x4-x3;
         int dy1=y4-y3;
        double l1=Math.sqrt((dx*dx)+(dy*dy));
        System.out.println(" length of the line is: "+l1);
        double l2=Math.sqrt((dx1*dx1)+(dy1*dy1));
        System.out.println(" length of the line2 is: "+l2);
        Double length1=l1;
        Double length2=l2;
        int result=length1.compareTo(length2);
        if(result>0){
            System.out.println("length1  is greater than length2 ");
        }else if(result==0){
            System.out.println("Both lines are equals");
        }else{
            System.out.println("length2 is greater than length1 ");
        }
    }
}
