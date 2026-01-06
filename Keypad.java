import java.util.*;

public class Keypad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine().toUpperCase();

        String[] keypad = {
                " ",     //0
                "",      //1
                "ABC",   //2
                "DEF",   //3
                "GHI",   //4
                "JKL",   //5
                "MNO",   //6
                "PQRS",  //7
                "TUV",   //8
                "WXYZ"   //9
        };

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                result = result + "0 ";
            } else {
                for (int j = 2; j <= 9; j++) {
                    int pos = keypad[j].indexOf(ch);
                    if (pos != -1) {
                        for (int k = 0; k <= pos; k++) {
                            result = result + j;
                        }
                        result = result + " ";
                        break;
                    }
                }
            }
        }

        System.out.println("Keypad Code: " + result.trim());
    }
}
