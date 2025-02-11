import java.util.ArrayList;

public class MyStack implements Cloneable{
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack пуст");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack пуст");
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "MyStack: " + list.toString();
    }

    @Override
    public MyStack clone() {
        MyStack clonedStack = new MyStack();
        for (Object item : this.list) {
            if (item instanceof Cloneable) {
                try {
                    clonedStack.push(item.getClass().getMethod("clone").invoke(item));
                } catch (Exception e) {
                    clonedStack.push(item);
                }
            } else {
                clonedStack.push(item);
            }
        }
        return clonedStack;
    }
}
