package Casting;

public class GrandChild extends Child {
    @Override
    void speak() {
        System.out.println("Speaking GrandChild");
    }
    void crawl(){
        System.out.println("Crawling");
    }
}
