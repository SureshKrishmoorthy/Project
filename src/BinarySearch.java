import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a={6,5,4,3,7,9,7};
        Arrays.sort(a);
        System.out.println("Enter  the element to search");
        System.out.println(search(a,in.nextInt()));
    }
    public static String search(int[] a,int target){
        int low=0,mid=0,high=a.length-1;
        String s="Not Present";
        while (high>=low){
            mid=(low+high)/2;
            if(a[mid]==target){
                s="present";
                break;
            }else if(a[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return s;
    }
}
