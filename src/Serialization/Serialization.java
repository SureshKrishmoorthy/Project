package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        FileOutputStream fileoutputStream;
        ObjectOutputStream objectOutputStream;
        Student student1=new Student("ABc",13,"ABC",120,"Suresh",3);
//        Car car=new Car("skoda",1200000,"Blue",new Engine("1.2 Revatron",1200,"Turbo"));
        try{
            System.out.println("Enter the path");
            String path=in.next();
            fileoutputStream=new FileOutputStream(path);
            objectOutputStream=new ObjectOutputStream(fileoutputStream);
            objectOutputStream.writeObject(student1);
            System.out.println("Done");
            fileoutputStream.close();
            objectOutputStream.flush();
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
