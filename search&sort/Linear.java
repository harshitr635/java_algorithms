import java.util.Scanner;

public class Linear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int searchvalue = sc.nextInt();
        int[] arr1 = {12, 4, 8, 20, 1, 7};
        boolean found = false;
        for(int i=0; i<arr1.length;i++){
            if (arr1[i] == searchvalue){
                System.out.println("Yes the value exist at index " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Searched result not found in the array");
        }
    }
}