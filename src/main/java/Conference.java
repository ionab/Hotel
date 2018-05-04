public class Conference extends Room {
    private double dailyRate;

    public Conference(int capacity, double dailyRate) {
        super(capacity);
        this.dailyRate = dailyRate;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int new_capacity){
        capacity = new_capacity;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }


}
