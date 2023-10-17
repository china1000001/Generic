import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box<>("12345"+67890));
        System.out.println(boxes);
    }
}
