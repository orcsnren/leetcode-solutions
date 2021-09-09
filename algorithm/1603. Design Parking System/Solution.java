class ParkingSystem {
    public int bigSize;
    public int mediumSize;
    public int smallSize;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSize = big;
        this.mediumSize = medium;
        this.smallSize = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            return --bigSize >= 0;
        } else if (carType == 2)
            return --mediumSize >= 0;
        else
            return --smallSize >= 0;

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */