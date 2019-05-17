public static String weekday(int d) {
        if (d == 1) {
            return "Monday";
        } else if (d == 2) {
            return "Tuesday";
        } else if (d == 3) {
            return "Wednesday";
        } else if (d == 4) {
            return "Thursday";
        } else if (d == 5) {
            return "Friday";
        } else if (d == 6) {
            return "Saturday";
        } else if (d == 7) {
            return "Sunday";
        } else {
            return "You have to enter a number between 1 - 7";
        }
    }
