public class Switch {
    public static void main(String[] args) {
        String exampleString = "Hello World";

        switch(exampleString.toLowerCase()) {
            case "hello world":
                System.out.println("exampleString is " + exampleString);
                break;

            case "bob":
            case "joe":
            case "git":
                System.out.println("exampleString was " + exampleString);
                break;

            default:
                System.out.println("exampleString does not fit the given cases");
                break;
        }
    }
}
