import java.util.Scanner;

class sum{
    public static void main(String[] args) {
    int arr[]=new int[5];
    int sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter arrary element");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    for(int i=0;i<arr.length;i++){

    }
    System.out.println(sum);
    

        
    }
}