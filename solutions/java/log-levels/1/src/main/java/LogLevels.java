public class LogLevels {
    static int find_break_point(String message){
        for(int i=0;i<message.length();i++){
            if (message.charAt(i)==':')return i;
        }return message.length();
    }
    
    public static String message(String logLine) {
        int index=LogLevels.find_break_point(logLine);
        return logLine.substring(index+1).strip();
    }

    public static String logLevel(String logLine) {
        int index= LogLevels.find_break_point(logLine);
        return logLine.substring(1,index-1).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine)+" ("+LogLevels.logLevel(logLine)+")";
    }
}
