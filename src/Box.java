public class Box<T> {
    private T boxes;

    public Box() {
    }

    public Box(T boxes) {
        this.boxes = boxes;
    }

    public T getBoxes() {
        return boxes;
    }

    public void setBoxes(T boxes) {
        this.boxes = boxes;
    }

    @Override
    public String toString() {
        return "Box{" +
                "boxes=" + boxes +
                '}';
    }
}
