import java.util.Scanner;

public class Ttwo {
    //madin element ekk ekthu kirima
    public static void main(String[] args) {
        int[] arr=new int[10];
        int size=5;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Data: ");
        for (int j=0;j<size;j++){
        arr[j]=sc.nextInt();
        }
        System.out.println("Output of Array: ");
        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        //System.out.println("Enter the Index: ");
        //int ind= sc.nextInt();
        //System.out.println("Enter the Element: ");
        //int ele=sc.nextInt();
        //size++;
        //for (int k=size;k>ind;k--){
          //  arr[k]=arr[k-1];
        //}
        //arr[ind]=ele;
        //System.out.println("Output of Array: ");
        //for (int i=0;i<size;i++){
         //   System.out.println(arr[i]);
        //}
        //System.out.println("Enter the Index want to delete: ");
        //int ind= sc.nextInt();
        //for (int j=ind;j<size;j++){
          //  arr[j]=arr[j+1];
        //}
        //size--;
        //System.out.println("Output of Array: ");
        //for (int i=0;i<size;i++){
          //  System.out.println(arr[i]);
        //}
       // {System.out.println("Enater the data want to Search: ");
        //int data= sc.nextInt();
        //int k ;
        //for( k=0;k<size;k++){
          // if(arr[k]==data){
            //   break;
    //}
      //  }
        //System.out.println("Index "+ k);}

        System.out.println("Enter index  want to update:" );
                int ind=sc.nextInt();

        System.out.println("Enter new Data: ");
        int ele=sc.nextInt();
        arr[ind]=ele;
        System.out.println("Output Array");
        for (int i=0;i<size;i++){
            System.out.println(arr[i]);}
    }
    }
