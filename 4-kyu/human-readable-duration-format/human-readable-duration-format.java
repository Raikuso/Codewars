public class TimeFormatter {
​
    final static int minute = 60;
    final static int hour = 60 * minute;
    final static int day = 24 * hour;
    final static int year = 365 * day;
​
    public static String formatDuration(int seconds) {
        if (seconds == 0) return "now";
​
        StringBuilder duration = new StringBuilder();
​
        int years = seconds / year;
        seconds -= years * year;
        int days = seconds / day;
        seconds -= days * day;
        int hours = seconds / hour;
        seconds -= hours * hour;
        int minutes = seconds / minute;
        seconds -= minutes * minute;
​
        if (years > 0) duration.append(years).append(" year").append(years > 1 ? "s" : "").append(", ");
        if (days > 0) duration.append(days).append(" day").append(days > 1 ? "s" : "").append(", ");
        if (hours > 0) duration.append(hours).append(" hour").append(hours > 1 ? "s" : "").append(", ");
        if (minutes > 0) duration.append(minutes).append(" minute").append(minutes > 1 ? "s" : "").append(", ");
        if (seconds > 0) duration.append(seconds).append(" second").append(seconds > 1 ? "s" : "").append(", ");
​
        duration.setLength(duration.length() - 2);
        String strDuration = duration.toString();
        int lastIndex = strDuration.lastIndexOf(", ");
        if (lastIndex != -1)
            strDuration = strDuration.substring(0, lastIndex) + " and " + strDuration.substring(lastIndex + 2);
        return strDuration;
    }
}