public class GenericMethods {

    public <E> void printElements(E element1, E element2, E element3) {
        System.out.println(element1.toString());
        System.out.println(element2.toString());
        System.out.println(element3.toString());
    }
}
