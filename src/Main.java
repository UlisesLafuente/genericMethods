public class Main {
    public static <E> void main(String[] args) {
        System.out.println("Generics practice lvl1");

        NoGenericMethods ngm = new NoGenericMethods("One", "Two", "Three");
        System.out.println(ngm);

        Person paco = new Person("Paco", "Perez", 22);
        Person rodro = new Person("Rodro", "Rodriguez", 32);

        try{
            GenericMethods.printElements(paco, "String de prueba", 14);
            GenericMethods.printElements(paco, rodro, new Person("Maria", "Garcia", 25));
            GenericMethods.printElementsWithsString(paco,rodro," : Estos son personas");
            GenericMethods.printall(paco,rodro,paco,rodro,"Yeeee",paco);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}