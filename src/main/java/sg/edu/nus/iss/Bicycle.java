package sg.edu.nus.iss;

public class Bicycle implements Startable {

    private int gear;
    private int speed;
    public Bicycle(){
        
    }
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void setGear(int gear){
        this.gear=gear;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    // public void applyBrake(int decreaseValue){
    //     speed= speed - decreaseValue;
    //     // speed -=decreaseValue;
    // }
    // public void speedUp(int increaseValue){
    //     speed += increaseValue;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + gear;
        result = prime * result + speed;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bicycle other = (Bicycle) obj;
        if (gear != other.gear)
            return false;
        if (speed != other.speed)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
    }
    @Override
    public void applyBrake(int decreaseValue) {
        speed= speed - decreaseValue;
    }
    @Override
    public void speedUp(int increaseValue) {
        speed += increaseValue;
    }
    
}
