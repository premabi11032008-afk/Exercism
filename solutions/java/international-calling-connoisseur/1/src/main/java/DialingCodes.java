import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer,String> phonebook =new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.phonebook;
    }

    public void setDialingCode(Integer code, String country) {
        this.phonebook.put(code,country);
    }

    public String getCountry(Integer code) {
        return this.phonebook.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.phonebook.containsKey(code)) return;
        if (this.phonebook.containsValue(country)) return;

        setDialingCode(code,country);
    }

    public Integer findDialingCode(String country) {
        if (!this.phonebook.containsValue(country)) return null;
        for (Integer code : phonebook.keySet()){if (this.phonebook.get(code).equals(country))return code;}
    
    return null;}

    public void updateCountryDialingCode(Integer code, String country) {
        Integer old_code=findDialingCode(country);
        
        this.phonebook.remove(old_code);
        setDialingCode(code,country);
    }
}
