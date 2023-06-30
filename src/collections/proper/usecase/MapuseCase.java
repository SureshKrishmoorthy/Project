package collections.proper.usecase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapuseCase {
    static HashMap<Long,String> map;
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        map=new HashMap<Long,String>();

    }
    public static void addContact(){
        System.out.println("Enter the name");
        String name=in.next();
        System.out.println("Enter the number:");
        Long num=in.nextLong();
        map.put(num,name);

    }

    public static void getname(){
        System.out.println("Enter the number");
        Long l=in.nextLong();
        System.out.println(map.get(l));

    }
    public static void getNumber(){

    }
}
