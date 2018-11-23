public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser kid = new KidUser(10,"Kids");
        kid.registerAccount();
        kid.requestBook();

        System.out.println();

        KidUser kid2 = new KidUser(18,"Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println();

        AdultUser adult = new AdultUser(5,"Kids");
        adult.registerAccount();
        adult.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser(23,"Fiction");
        adult.registerAccount();
        adult.requestBook();
    }
}
