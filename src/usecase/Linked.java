package usecase;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked {

    LinkedList image=new LinkedList<Image>();
    static Scanner in=new Scanner(System.in);
    static int i;
    public void insertImage(){
        boolean b=true;
        while(b){
            System.out.println("Enter the path");
            String path=in.next();
            image.add(new Image("abc",path));
            System.out.println("Path Added");
            System.out.println("Do you want to add image: 1.yes 2.no");
            i=in.nextInt();
            if(i==1){
                insertImage();}
            else{
                b=false;
            }
        }
    }
}
