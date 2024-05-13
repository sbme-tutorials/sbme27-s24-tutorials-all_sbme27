package enum_example;

class Main {

    public static void main(String[] args) {

        // Day today = Day.MONDAY;

        // switch (today) {
        //     case MONDAY:
        //         System.out.println("It's Monday!");
        //         break;
        //     case TUESDAY:
        //         System.out.println("It's Tuesday!");
        //         break;
        //     // Handle other days...
        //     default:
        //         break;
        // }

// ====================================================
// Loop on enums:
    // for (Day day : Day.values()) {
    //         System.out.println(day);
    //     }
    // }
// ====================================================

        // TODO: comapre enums
        // System.out.println(today > Day.FRIDAY);
        // System.out.println(today > 5);

        // Color c = Color.BLUE;

        Day today = Day.MONDAY;
        Day anotherDay = Day.TUESDAY;

        if (today.compareTo(anotherDay) < 0) {
            System.out.println("Today comes before another day.");
        } else if (today.compareTo(anotherDay) > 0) {
            System.out.println("Today comes after another day.");
        } else {
            System.out.println("They are the same day.");
        }
                
    }
    
}
