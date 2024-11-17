import java.util.Scanner;

class search{
    public static void main(String[] args) {
        int search_ele;
        int count=0;

        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an array element");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the array element to be searched");
        search_ele=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search_ele){
                count++;
             System.out.println("index"+arr[i]);
            }
            
            // System.out.println("index"+arr[i]);
        }
        if(count>=1){
            System.out.println("element found at"+"times"+count);
        }else{
            System.out.println("item is not found");
        }
        

        
    }
}