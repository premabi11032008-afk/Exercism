class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    public int battery;
    public int distance;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed=speed;this.batteryDrain=batteryDrain;
        this.battery=100;this.distance=0;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery>=this.batteryDrain){this.distance=this.distance+this.speed;
        this.battery=this.battery-this.batteryDrain;}
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int max_distance_fuel=car.battery/car.batteryDrain;
        return this.distance<=(max_distance_fuel*car.speed);
        
    }
}
