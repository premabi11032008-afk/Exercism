class ProductionRemoteControlCar implements RemoteControlCar ,  Cloneable,Comparable<ProductionRemoteControlCar>{
    public int distance;
    public int victory;
    
    public void drive() {
        this.distance=this.distance+10;
    }

    public int getDistanceTravelled() {
        return this.distance;
    }

    public int getNumberOfVictories() {
        return this.victory;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victory=numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar other) {
    return Integer.compare(this.getNumberOfVictories(), other.getNumberOfVictories());
}
    
}
