public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Капитанская дочка");
        Book b2 = new Book("Мертвые души");
        Magazine m1 = new Magazine("Forbes");
        Magazine m2 = new Magazine("Железный человек");

        Printable[] printables = {b1,b2,m1,m2};
        for(Printable printable: printables){
            printable.print();
        }
        System.out.println("\nНазвания только журналов");
        Magazine.printMagazines(printables);
        System.out.println("\nНазвание только книг");
        Book.printBooks(printables);
    }
}


