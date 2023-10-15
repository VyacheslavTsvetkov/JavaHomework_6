public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.addNumber("89523457623", "Valera");
        pb.addNumber("89504759345", "Vasya");
        pb.addNumber("89519472714", "Boris");
        pb.addNumber("89524511277", "Boris");
        pb.addNumber("+7539648388", "Kolyan");
        pb.addNumber("89503672299", "Ivan");
        pb.addNumber("89503672288", "Ivan");
        pb.addNumber("89503673476", "Ivan");

        System.out.println(pb.getAllBook());
        System.out.println("---------------");
        System.out.println(pb.getByName("Ivan"));

    }
}
