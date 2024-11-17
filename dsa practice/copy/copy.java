import java.util.Scanner;

class copy{
    public static void main(String[] args) {
        int a[]=new int[4];
        int b[]=new int[4];
     Scanner sc=new Scanner(System.in);
     System.out.println("enter arrray elements are");
     for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
     }
     System.out.println("copy elements are");
     for(int i=0;i<b.length;i++){
        b[i]=a[i];
        System.out.println(b[i]);

     }


        
    }
}