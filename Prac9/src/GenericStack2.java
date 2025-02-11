import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E> {

    public int getSize() {
        return size();
    }

    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return get(getSize() - 1);
    }

    public void push(E value) {
        add(value);
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return remove(getSize() - 1);
    }

    @Override
    public String toString() {
        return "стек: " + super.toString();
    }
}
