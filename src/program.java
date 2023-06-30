public class program {
    public static void main(String[] args) {
        int[] a={15,17,33,12,89,4};
        int[] b=new int[a.length];
        int val;
        int[] c=new int[a.length+a.length];
        for (int i=0;i<a.length;i++){
            val=sum(a[i]);
            if(val<10)
                b[i]=val;
            else
                b[i]=sum(val);

        }int m=0;
        for (int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }
            else
                c[i]=b[m++];
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]+"  ");
        }
    }
    public static int sum(int num){
        int sum1=0;
        if(num<10)
            sum1=num;
        else {
            while(num>0){
                int temp=num%10;
                sum1+=temp;
                num/=10;
            }
        }
        return sum1;
    }
}
