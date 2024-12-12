package ua.edu.chmnu.ce.c2.jid;
// Enum to represent days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Method to check if the day is a weekend
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }

    // Method to get a description of the day
    public String getDescription() {
        switch(this) {
            case MONDAY: return "Start of the workweek!";
            case FRIDAY: return "Almost weekend!";
            case SATURDAY: return "Weekend! Relax!";
            case SUNDAY: return "Weekend! Get ready for the week!";
            default: return "Midweek! Keep going!";
        }
    }
}

public class enums {
    public static void main(String[] args) {
        // Using enum in a switch statement
        Day today = Day.MONDAY;

        // Outputting description of the day
        System.out.println("Today is: " + today);
        System.out.println("Description: " + today.getDescription());

        // Checking if today is a weekend
        if (today.isWeekend()) {
            System.out.println(today + " is a weekend!");
        } else {
            System.out.println(today + " is a workday.");
        }

        // Looping through all days in the enum
        System.out.println("\nAll days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
        }
    }
}
