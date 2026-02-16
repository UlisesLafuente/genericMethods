# Level 1

At this level you will introduce yourself to the fundamental concepts of generics. You will learn how to create classes and methods that work with any type of data, and you will see how Java manages flexible but secure typing.

## Exercise 1 — Class without generics

Create a class called NoGenericMethods that stores three arguments of the same type, along with:

    a builder to initialize them,
    and methods getElement1(), getElement2(), getElement3()to access it.

Check that you can pass the arguments in any order to the constructor.

This exercise is used to later compare behavior with a generic version.

## Exercise 2 — Generic method with various parameters

Create a class Person with the attributes name, surname and age. Then, create a class called GenericMethods with a generic method called printElements() that accepts three generic arguments and prints them on the screen.

To the main()of the main class, calls this method with different types of parameters (e.g.: an object Person, a String and a primitive numerical value).

With this exercise you will verify that generic methods can accept any combination of type and in any order.