public class Test extends SuperClass {

    public void printMe() {
        System.out.print("sub context ups henten");
    }

    /**
     * main class
     *
     * @param argv
     */
    public static void main(String argv[]) {
        SuperClass sc = new Test();
        sc.printMe();
    }

}

class SuperClass {
    void printMe() {
        System.out.print("super context first commit second third");
    }
}