final class Base {

    void Display() {
        System.out.print("Method for Base class.");
    }
}

class Extended extends Base {

    void Display() {
        System.out.print("Method of Extended class.");
    }
}

class GFG {

    public static void main(String[] arg) {
        Extended d = new Extended();
        d.Display();
    }
}
