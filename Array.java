import java.util.Scanner;

class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the element of array position " + arr[i]);
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}

