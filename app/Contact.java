package contact.app;

public class Contact{
    String name;
    long phone_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }


    public Contact(String name, long phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }



}
