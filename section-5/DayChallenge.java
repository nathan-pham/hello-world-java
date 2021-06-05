public class DayChallenge {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(1));
        System.out.println(getDayOfWeek(2));
        System.out.println(getDayOfWeek(9));

        System.out.println(getDayOfWeekArray(1));
        System.out.println(getDayOfWeekArray(2));
        System.out.println(getDayOfWeekArray(100));
    }
    
    private static String getDayOfWeekArray(int day) {
        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thurday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        return day > 0 && day < days.length
            ? days[day]
            : "Invalid day of the week";
    }

    private static String getDayOfWeek(int day) {
        switch(day) {
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thurday";
            case 4: return "Friday";
            case 5: return "Saturday";
            case 6: return "Sunday";
            default: return "Invalid day of the week";
        }
    }
}
