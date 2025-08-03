public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.replaceAll("^\\[.*?\\]:\\s*", "");
        // Menghapus spasi di awal dan akhir
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String level = logLine.replaceAll("^\\[(.*?)\\]:.*", "$1");
        return level.toLowerCase().trim();
    }

    public static String reformat(String logLine) {
String msg = message(logLine);
        String level = logLevel(logLine);
            return msg + " ("+level+")";
    }
}
