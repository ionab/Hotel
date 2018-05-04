public enum BedroomTypes {
    DOUBLE(2),
    TWIN(2),
    SINGLE(1),
    DELUXE(2),
    FAMILY(4),
    ;

    private int capacity;
    BedroomTypes(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
