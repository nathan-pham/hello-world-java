public class DayChallenge {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek(2));
        System.out.println(getDayOfWeek(9));
    }

    private static String getDayOfWeek(int day) {
        switch(day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thurday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Invalid day of the week";
        }
    }
}
