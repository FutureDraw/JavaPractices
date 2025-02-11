public class GenericStack<E> {
    private E[] elements;
    private int size = 0;


    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return elements[size - 1];
    }

    public void push(E value) {
        if (size == elements.length) {
            expandCapacity();
        }
        elements[size++] = value;
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        E value = elements[--size];
        elements[size] = null;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        E[] newArray = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
