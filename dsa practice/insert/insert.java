//insert a new element at a specified position of array
 class insert{
    public static void main(String[] args) {
    int[]orgarray={1,2,3,4,5};
    int pos=2;
    int element=8;
    int[]newarr=new int[orgarray.length+1];
    for(int i=0;i<pos;i++){
        newarr[i]=orgarray[i];

    }
    newarr[pos]=element;
    for(int i=pos;i<orgarray.length;i++){
        newarr[i+1]=orgarray[i];
    }
    for(int i=0;i<newarr.length;i++){
        System.out.println(newarr[i]);
    }
        
    }
    

}