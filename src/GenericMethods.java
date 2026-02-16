public class GenericMethods {

    public static <E> void printElements(E element1, E element2, E element3) {
        System.out.println(element1.toString());
        System.out.println(element2.toString());
        System.out.println(element3.toString());
    }

    public static <E> void printElementsWithsString(E element1, E element2, String string){
        System.out.println(element1.toString());
        System.out.println(element2.toString());
        System.out.println(string);
    }

    @SafeVarargs
    public static <E> void printall(E... elements){
        for (E element : elements){
            System.out.println(element.toString());
        }
    }
    //*
    // (Dejo estas anotaciones aquí para consultas futuras)
    //
    // Generics: Generics provide type safety by allowing you to write code that works with different types without sacrificing type checking.  They use type parameters (like <T>) to define the type of the generic collection or object.
    // The Conflict: The core issue arises when you use varargs with a generic type parameter.  The compiler cannot reliably determine the specific type of the last argument in the varargs list, because it's potentially of any type. This leads to the unchecked warnings.
    // Why the Unchecked Warnings?
    // The compiler issues these warnings because it cannot guarantee that the type of the last argument passed to a varargs method will be compatible with the generic type parameter.  It's essentially saying, "I don't know what type you're going to put in here, and that's a problem."
    // How This Affects Type Security?
    // Here's how unchecked warnings related to varargs and generics erode type security:
    //1. Potential for Runtime Type Errors: The warnings are a sign that a type mismatch could occur at runtime.  The compiler can't prevent the error, but it alerts you to the potential.  If you ignore the warning and the code compiles, you could end up with a ClassCastException or similar runtime error when you try to use the varargs parameter.
    //2. Loss of Compile-Time Type Checking: Generics are valuable because they allow the compiler to catch type errors before your code runs.  The unchecked warnings related to varargs effectively disable this benefit.
    //3. Difficult Debugging:  When a ClassCastException occurs, it can be challenging to trace back to the origin of the type mismatch, especially if you've used varargs and generics.
}
