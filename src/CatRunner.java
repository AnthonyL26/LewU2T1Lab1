public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Socks",5,10);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("cat",6,9);
        cat2.printCatInfo();
        cat2.introduce();

        cat2.ageCat(2);
    }
}
