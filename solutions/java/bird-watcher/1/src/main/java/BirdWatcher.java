
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length -1]++;}

    public boolean hasDayWithoutBirds() {
        for( int day=0;day<this.birdsPerDay.length;day++){
            if (this.birdsPerDay[day]==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        if  (numberOfDays>this.birdsPerDay.length)numberOfDays=this.birdsPerDay.length;
        
        for (int day=0;day<numberOfDays;day++){
            sum=sum+this.birdsPerDay[day];
        }
        return sum;
    }

    public int getBusyDays() {
        int count=0;
        for (int day=0;day<this.birdsPerDay.length;day++){
            if (this.birdsPerDay[day]>=5)count++;
        }
        return count;
    }
}
