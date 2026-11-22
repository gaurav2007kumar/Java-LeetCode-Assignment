class ParkingSystem {
    int a;
    int b;
    int c;

    public ParkingSystem(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean addCar(int x) {
        if (x == 1) {
            return a-- > 0;
        }
        if (x == 2) {
            return b-- > 0;
        }
        return c-- > 0;
    }
}
