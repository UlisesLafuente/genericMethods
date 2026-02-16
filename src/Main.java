public class Main {
    public static <E> void main(String[] args) {
        System.out.println("Generics practice lvl1");

        NoGenericMethods ngm = new NoGenericMethods("One", "Two", "Three");
        System.out.println(ngm);

        Person paco = new Person("Paco", "Perez", 22);
        Person rodro = new Person("Rodro", "Rodriguez", 32);

        GenericMethods gm = new GenericMethods();

        try{
            gm.printElements(paco, "String de prueba", 14);
            gm.printElements(paco, rodro, new Person("Maria", "Garcia", 25));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}