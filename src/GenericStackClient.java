public class GenericStackClient {
    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("There");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.println("1.2 Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s",stack.pop());
        }
        System.out.println(" \n1.3. Size of stack after pop operations: " + stack.size());
    }
    private static void strackInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        System.out.println("2.1 Size of stack before push operations: " + stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(0);
        stack.push(6);
        System.out.println("2.2 Size of stack after push operations: " + stack.size());
        System.out.println("2.3 Pop element from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d",stack.pop());
        }
    }
    public static void main(String[] args) {
        System.out.println("1. Stack of String");
        stackOfIString();
        System.out.println("2. Stack of Integer");
        strackInteger();

    }

}
