import java.util.*;
import java.io.*;
public class count1 {
    public static int countOne(int a[],int n)
    {
        int low=0,high=n-1,mid,ans=-1;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]==1)
            {
               ans=n-mid;
               high=mid-1;
            }
            else //if(a[mid]==0)
            {
                low=mid+1;
            }
           
           
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,n;
        System.out.println("size of array=");
        n=sc.nextInt();
        System.out.println("Enter array elements=");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int ans1=countOne(a,n);
        System.out.println("The number of 1's is="+ans1);
    }
    
}
