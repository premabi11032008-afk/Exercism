public class ExperimentalRemoteControlCar implements RemoteControlCar , Cloneable{
    public int distance;
    public void drive() {
        this.distance=this.distance+20;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }
}
