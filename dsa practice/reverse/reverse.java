import  java.util.Scanner;

class reverse{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter array element");

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("all arrays elements are");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"");
    }
    System.out.println("reverse array elements ARE"+" " );
    for(int i=arr.length-1;i>=0;i--){
        System.out.println(arr[i]);
    }

        
    }


}