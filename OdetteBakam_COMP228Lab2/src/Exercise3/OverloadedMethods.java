package Exercise3;

public class OverloadedMethods {
    public static void main(String[] args) {

        //overloaded methods: share same name different parameters
        //calling the overload methods

        String plain = friedBeignet("plain");
        String flavor = friedBeignet("plain", "chocolate");
        String vanilla = friedBeignet("plain","chocolate","vanilla");
        String coconut = friedBeignet("plain","chocolate","vanilla","coconut");

        // Displaying result

        System.out.println(plain);
        System.out.println(flavor);
        System.out.println(vanilla);
        System.out.println(coconut);

    }

    static String friedBeignet(String plain ) {
        return plain + " beignet";
    }

    static String friedBeignet(String plain, String flavor) {
        return plain + " " + "beignet with " + flavor + " flavor ";

    }

    static String friedBeignet(String plain, String flavor, String vanilla) {
        return plain + " " + "beignet with " + flavor + " flavor and " + vanilla + " topping";

    }

    static String friedBeignet(String plain, String flavor, String vanilla, String coconut) {
        return plain + " " + "beignet with " + flavor + " flavor and " + vanilla + " topping " +  coconut;
    }
}

