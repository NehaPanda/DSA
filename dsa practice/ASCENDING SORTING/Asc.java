import java.util.Scanner;
class Asc{
    public static void main(String[] args) {
        int arr[]=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter an array elements");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("sorted array element");
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }

}