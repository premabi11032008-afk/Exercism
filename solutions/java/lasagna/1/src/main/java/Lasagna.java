public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){return 40;}
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time) {return (40-time);}
    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int layers) {return (2*layers);}
    // TODO: define the 'totalTimeInMinutes()' method
public int totalTimeInMinutes(int layers, int time_taken) {return (time_taken+ Lasagna.preparationTimeInMinutes(layers));}
}
