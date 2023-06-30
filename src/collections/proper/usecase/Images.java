package collections.proper.usecase;

import java.util.Date;

public class Images {
    String name;
    int size;
    String pixels;
    Date date;

    public Images(String name, int size, String pixels, Date date) {
        this.name = name;
        this.size = size;
        this.pixels = pixels;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Images : " +
                "name='" + name  +
                ", size=" + size +
                ", pixels='" + pixels  +
                ", date= " + date;
    }
}
