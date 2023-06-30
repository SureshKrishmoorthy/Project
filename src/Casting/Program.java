package Casting;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        String[] str={"Apple","Banana","Orange","Mango","Strawberry","Mango"};
        ArrayList list=new ArrayList<>();
        for (int i=0;i<str.length;i++){
            if(i< str.length-1)
                list.add(Arrays.asList(str[i],str[i+1]));
            else
                list.add(Arrays.asList(str[i]));
            i++;
        }
        System.out.println(list);
    }
}
