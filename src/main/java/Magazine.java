public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static void printMagazines(Printable[] printable) {
        for (Printable p1 : printable) {
            if (p1 instanceof Magazine) {
                p1.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println("Название журнала: "+getName());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
