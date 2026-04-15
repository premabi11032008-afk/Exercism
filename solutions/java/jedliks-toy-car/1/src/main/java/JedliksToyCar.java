public class JedliksToyCar {
    private int distance;
    private int battery;

    public JedliksToyCar() {
        this.distance = 0;
        this.battery = 100;
    }
    
    public static JedliksToyCar buy() {
    return new JedliksToyCar();}

    public String distanceDisplay() {
        return "Driven "+this.distance+" meters";
    }

    public String batteryDisplay() {
        if (battery>0)return "Battery at "+this.battery+"%";
        return "Battery empty";
    }

    public void drive() {
        if (this.battery>0){
        this.distance=this.distance+20;
        this.battery--;}
    }
}
