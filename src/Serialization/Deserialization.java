package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Deserialization {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;

        try {
            System.out.println("Enter the Path to read");
            String path=in.next();
            fileInputStream=new FileInputStream(path);
            objectInputStream=new ObjectInputStream(fileInputStream);
            Student ref=(Student) objectInputStream.readObject();
//            Car ref=(Car) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
            System.out.println(ref);
//            System.out.println("School id "+ref.School_id+"School Name: "+ref.School_name);
            System.out.println("***");
            ref.detailsOfStudent();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
