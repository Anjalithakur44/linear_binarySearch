import java.util.*;
import java.io.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,n,ele;
        System.out.println("Size of array=");
        n=sc.nextInt();
        System.out.println("Input array elements=");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }  
       System.out.println("Enter the element you want to search=");
       ele=sc.nextInt();
       for(i=0;i<n;i++)
       {
        if(a[i]==ele)
        {
            System.out.println("Element="+a[i]+"is present at location="+i);
            break;
        }
       }
       if(i>=n)
       {
        System.out.println("Element="+ele+" is not present");
       }
    }
   


}
