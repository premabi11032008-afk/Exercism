import java.util.*;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder(identifier);
        int i =0;
        while (i<builder.length()){
        if (builder.charAt(i)==' ') builder.setCharAt(i,'_');
        else if (builder.charAt(i)=='-') {
                builder.setCharAt(i+1,Character.toUpperCase(builder.charAt(i+1)));
                builder.deleteCharAt(i);}
            
        else if (builder.charAt(i)=='3') builder.setCharAt(i,'e');
        else if (builder.charAt(i)=='4') builder.setCharAt(i,'a');
        else if (builder.charAt(i)=='0') builder.setCharAt(i,'o');
        else if (builder.charAt(i)=='1') builder.setCharAt(i,'l');
        else if (builder.charAt(i)=='7') builder.setCharAt(i,'t');

        else if (!Character.isLetter(builder.charAt(i))){builder.deleteCharAt(i);i--;}
        i++;
            
        }
        return builder.toString();
    }
}
