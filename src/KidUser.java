public class KidUser implements LibraryUser{

    private int age;
    private String bookType;

    public KidUser() {
    }

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    @Override
    public void registerAccount() {
        if(age>12)
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        else
            System.out.println("You have successfully registered under a Kids Account");
    }

    @Override
    public void requestBook() {
        if(bookType.equals("Kids"))
            System.out.println("Book Issued successfully, please return the book within 10 days");
        else
            System.out.println("Oops, you are allowed to take only kids books");

    }
}
