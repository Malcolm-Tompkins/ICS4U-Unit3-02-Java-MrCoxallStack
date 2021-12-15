// Mr Coxall Stack main class.
// Created Dec 8th, 2021

/**
* Main class. 
*/
final class Main {
    /**
    * Constant for number 10.
    */
    public static final int MAGIC_10 = 10;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Main() function.
    *
    * @param args unused argument
    */
    public static void main(String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        System.out.println("Push 10: ");
        aStack.push(MAGIC_10);
        aStack.showStack();
        final int popedNumber = aStack.pop();
        System.out.println("The popped number is: " + popedNumber);
        aStack.showStack();
    }
}

