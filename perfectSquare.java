import java.util.*;
import java.io.*;
public class perfectSquare{
    public static boolean sqRo(int a[],int number)
    {
        int l=0,r=number-1,mid,result=-1,value;
        while(l<=r)
        {
            mid=(l+r)/2;
            value=mid*mid;
            if(value>number)
            {
                result=mid;
                r=mid-1;
            }
            else if(value<number)
            {
                result=mid;
                l=mid+1;
            }
            else//value==number
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[100];
        int number;
        System.out.println("Enter the number=");
        number=sc.nextInt();
        if(sqRo(a,number))
        {
             System.out.println(sqRo(a, number));
        }
        else
        {
            System.out.println(sqRo(a, number));
        }

    }
}