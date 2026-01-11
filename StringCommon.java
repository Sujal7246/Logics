import java.util.*;
public class StringCommon {
   public  static void main(String[] args) {
        String[] arr={"a","b","c","d","e"};
        String[] arr2={"b","f","e","g","h"} ;
        for(int i=0;i <=arr.length-1;i++){
            for(int j=0;j<= arr2.length-1;j++){
                if(arr[i].equals(arr2[j])){
                    System.out.println(arr[i]);
                }
            }
        }
   }
}
