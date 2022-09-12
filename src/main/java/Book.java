public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Название книги: "+getName());
    }
    static void printBooks(Printable[] printable) {
        for (Printable p1 : printable) {
            if (p1 instanceof Book) {
                p1.print();
            }
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

