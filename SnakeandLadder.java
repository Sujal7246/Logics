import java.util.*;

public class SnakeandLadder {
    public static void main(String[] args) {
       int player1;
        int pos=0;
        int snake=4;
        int ladder=5;
        int target=10;
        Random r=new Random();
        int num=r.nextInt(6);
        if(num==0){
            System.out.println("player1 will be at same position");
        }else{
        System.out.println("Number came on dice: "+ num);
    }
      //  pos=pos+num;
      //  System.out.println(pos);
      System.out.println();
        int opt=r.nextInt(1);
        
        if (opt==1) {
            System.out.println("player will move to " + ladder + " " +" times");
            pos=pos + num + ladder;
            System.out.println("player is now at: "+pos);
        }
        else if (opt==0) {
            System.out.println("player will goes down " + snake +" times");
            pos=pos-snake;
            System.out.println("player is now at: "+pos);
        }else{
            System.out.println("wrong input");
        }

    }
}
