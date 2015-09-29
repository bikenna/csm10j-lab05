/**
 *
 * @author brianobioha
 */
import java.util.Scanner;

public class Lab05 {
    public static String add(int[] num1, int[] num2){
        StringBuilder sum = new StringBuilder("");
        int remainder = 0;
              
        for(int i = 0; i < num1.length; i++)
        {
            int val = (i < num1.length ? num1[i] : 0) + (i < num2.length ? num2[i] : 0) + remainder;
            remainder = 0;
            if(val > 9)
            {
                sum.append(val%10);

                remainder = val/10;
            }
            else sum.append(val);     
        }
        
        if(remainder != 0)
            sum.append(remainder);
        
        sum.reverse();
        return sum.toString();
    }
    public static int[] createArray(String value, int size){
        
        String arryString1 [] = new String[size];
        for(int index = 0; index < size; index++){
            char c  = value.charAt(index);
            arryString1[index] = String.valueOf(c);
        }
        
        int [] numArray = new int[size];
        
        for(int index = size - 1; index >= 0; index--){
            numArray[size - 1 - index] = Integer.parseInt(arryString1[index]);
        }
        
        return numArray;
    }
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        String num1 = input.next();

        int [] array1 = createArray(num1, num1.length());
        
        System.out.print("Enter the second number: ");
        String num2 = input.next();
        
        int [] array2 = createArray(num2, num2.length());
        
        String sum = add(array1, array2);
        
        System.out.println("\t"+num1);
        System.out.println("+\t"+num2);
        System.out.println("=\t"+sum);
        
    }
}
