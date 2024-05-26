package enum_example;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
// ====================================================
// enum Color {
//     RED("FF0000"), GREEN("00FF00"), BLUE("0000FF");

//     private String hexCode;

//     // Constructor is always private
//     Color(String hexCode) {
//         this.hexCode = hexCode;
//     }

//     // Method to get hex code
//     public String getHexCode() {
//         return hexCode;
//     }
// }
// ====================================================
// enum Day implements Comparable<Day> {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

//     @Override
//     public int compareTo(Day other) {
//         return this.ordinal() - other.ordinal();
//     }
// }
// ====================================================
// Custom Order:
// enum Day {
//     MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

//     private int customOrdinal;

//     // Constructor
//     Day(int customOrdinal) {
//         this.customOrdinal = customOrdinal;
//     }

//     // Getter method
//     public int getCustomOrdinal() {
//         return customOrdinal;
//     }
// }