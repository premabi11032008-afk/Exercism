public class CarsAssemble {

    public static double productionRatePerHour(int speed) {
        if(speed<=4)return speed*221.0;
        else if(speed<=8) return speed*221*0.9;
        else if(speed<=9) return speed*221*0.8;
        else  return speed*221*0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(CarsAssemble.productionRatePerHour(speed)/60);
    }
}
