class X {
    X() {
        System.out.println("X");
    }
}

class Y extends X {
    Y() {
        super();
        System.out.println("Y");
    }
}

public class Main {
    public static void main(String[] args) {
        new Y();
    }
}