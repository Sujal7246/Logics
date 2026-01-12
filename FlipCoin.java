import java.util.*;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of times want to flip a coin");
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Enter a positive integer");
        }
        Random r=new Random();
    int heads=0;
    int tails=0;
    for(int i=0;i<n;i++){
        double result=r.nextInt(2);
        if(result<0.5){
            tails++;
        }else{
            heads++;
        }
    }
    double headpercent=(heads*100)/n;
    double percenttails=(tails*100)/n;
        System.out.println("NO. of times heads comes: "+heads);
        System.out.println("NO. of times tails comes: "+tails);
        System.out.println("Percentage of heads come: "+headpercent);
        System.out.println("Percentage of tails come: "+percenttails);

    }
}
