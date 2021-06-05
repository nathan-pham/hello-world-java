public class Switch {
    public static void main(String[] args) {
        String exampleString = "Hello World";

        switch(exampleString) {
            case "Hello World":
                System.out.println("exampleString is Hello World");
                break;

            case "Bob":
            case "Joe":
            case "Nic":
                System.out.println("exampleString was Bob, Joe, or Nic");
                break;

            default:
                System.out.println("exampleString does not fit the cases, it is " + exampleString);
                break;
        }
    }
}
