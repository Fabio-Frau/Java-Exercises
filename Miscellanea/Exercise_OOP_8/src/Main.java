public class Main {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(TrafficLightColors.RED, 30);

        System.out.println("Is the light red? : " + light.isRed());
        System.out.println("Is the light green : " + light.isGreen());
        System.out.println("Is the light yellow? : " + light.isYellow());
        System.out.println("The light duration is : " + light.getDuration());

        light.changeColor(TrafficLightColors.GREEN);
        light.setDuration(20);

        System.out.println("Is the light red? : " + light.isRed());
        System.out.println("Is the light green : " + light.isGreen());
        System.out.println("Is the light yellow? : " + light.isYellow());
        System.out.println("The light duration is : " + light.getDuration());

    }

}
