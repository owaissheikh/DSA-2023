import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,3,88};
        System.out.println("length of array is "+ arr.length);
        System.out.println("Enter the element which you want to search");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(search == arr[i]){
                System.out.println("element is found at " + i);
            }
        }

    }
}
