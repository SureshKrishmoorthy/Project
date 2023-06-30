package collection.framework.List;

public class Array {

    public static void main(String[] args)
    {
        String s="Suresh";
        int count=0;
        for(int i=0;;i++){
            try{

                char ch=s.charAt(i);
                count++;
            }catch (Exception e){

                System.out.println(count);break;
            }

        }
    }
}
