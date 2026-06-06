public class problem1 {
    public static void main(String[] args) {

        System.out.println("--- Test Case #1 (Kid User) ---");
        KidUsers kid1 = new KidUsers(10, "Kids");
        kid1.registerAccount();
        kid1.requestBook();

        System.out.println();

        KidUsers kid2 = new KidUsers(18, "Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        System.out.println("\n--- Test Case #2 (Adult User) ---");
        AdultUser adult1 = new AdultUser(5, "Kids");
        adult1.registerAccount();
        adult1.requestBook();

        System.out.println();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        adult2.registerAccount();
        adult2.requestBook();

    }
}

interface LibraryUser {

    void registerAccount();

    void requestBook();

}

class KidUsers implements LibraryUser {
    int age;
    String bookType;

    KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registerd under kids Account");
        } else {
            System.out.println("Sorry age must be  less than 12 ");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equals(bookType)) {
            System.out.println("Book issued successfully! Please return within 10 days");
        } else {
            System.out.println("OOPS! You are allowed to take only kids book");
        }
    }

}

class AdultUser implements LibraryUser {
    int age;
    String bookType;

    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registerd under Adult Account");
        } else {
            System.out.println("Sorry age must be  greater  than 12 ");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equals(bookType)) {
            System.out.println("Book issued successfully! Please return within 7 days");
        } else {
            System.out.println("OOPS! You are allowed to take only Adult fiction book");
        }
    }

}