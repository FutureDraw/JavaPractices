public class Main {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(102);
        stack.push(30);
        stack.push(1);
        stack.push(21);

        System.out.println("\nВерхний элемент: " + stack.top());
        System.out.println("Удалённый верхний элемент: " + stack.pop());
        System.out.println("Stack пуст? " + stack.empty());
        System.out.println(stack);
    }
}