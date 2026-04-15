public enum LogLevel {
TRACE("TRC",1),DEBUG("DBG",2),INFO("INF",4),WARNING("WRN",5),ERROR("ERR",6),FATAL("FTL",42),UNKNOWN("",0);

    private final String code;
    private final int num;
    
    LogLevel(String code,int num){
        this.code=code;
        this.num=num;
    }

    public int getnum(){return num;}

    public static LogLevel returncode(String code){
        for (LogLevel level:values()){
            if (level.code.equals(code))return level;
        }
    return UNKNOWN;
    }
}

