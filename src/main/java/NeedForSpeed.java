class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    public int distance = 0;
    public int battery = 100;
    
    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int speed,int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        if(this.battery >0){
            return false;
        }
        return true;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!this.batteryDrained()){
        this.distance += this.speed;
        this.battery -= this.batteryDrain;
            }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    
    private int distance;
    
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        if(car.distance >= this.distance){
            return true;
        }
        return false;
    }
}
