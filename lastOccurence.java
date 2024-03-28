public class lastOccurence {
    public static int lO(int a[],int key)
    { int l=0,r=a.length-1,mid,res=-1;
        while(l<=r)
        {  
           mid=(l+r)/2;
            if(a[mid]==key){
              res= mid;
              l=mid+1;  
            }
            else if(a[mid]<key){
               l=mid+1;
            }
            else {
               r=mid-1;
            }

        }
      return res;

    }
    public static void main(String args[])
    {
        int a[]={1,1,1,2,3,4,4,5,6,6,6,6};
        int key=4;
        int ans=lO(a,key);
        if(ans!=-1)
        System.out.println("Last Occurence of element="+key+"is at location"+ans);
        else
        System.out.println("ELEMENT NOT PRESENT");
       
    }
}
