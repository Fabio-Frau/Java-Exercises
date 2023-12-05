public class TrafficLight {

    private TrafficLightColors color;
    private int duration;

    public TrafficLight(TrafficLightColors color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(TrafficLightColors newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return this.color.equals(TrafficLightColors.RED);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
