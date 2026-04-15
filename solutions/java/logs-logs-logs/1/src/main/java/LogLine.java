public class LogLine {
    private String string;
    
    public LogLine(String logLine) {
        
        this.string=logLine;
    }

    public LogLevel getLogLevel() {
        String level = this.string.substring(1,4);
        return LogLevel.returncode(level);}

    public String getOutputForShortLog() {
        int num=getLogLevel().getnum();
        return num+":"+this.string.substring(7,this.string.length());
    }
}
