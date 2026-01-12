import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();

        if(year < 1000 || year > 9999){
            System.out.println("Please Enter a four digit number");
            return;
        }
            System.out.println("Number Entered: "+year);
            if(year%4==0){
                System.out.println("It is leap year.");
            }else{
                System.out.println("Not a leap  year");
            }
        }
    }

