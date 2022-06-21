package src;

public class TwelveHrToTwentyFourHr {
    public static void main(String[] args) {
        String time = "03:45:55PM";
        String _24HourTime = timeConverter(time);
        System.out.println(_24HourTime);
    }

    private static String timeConverter(String time) {
        String[] components = time.split(":");
        String hourComponent = components[0];
        String minuteComponent = components[1];
        String secondsMeridianComponent = components[2];
        String secondsComponent = secondsMeridianComponent.substring(0, 2);
        String meridianComponent = secondsMeridianComponent.substring(2);

        if (meridianComponent.equalsIgnoreCase("AM")) {
            if (hourComponent.equals("12")) {
                hourComponent = "00";
            }
        } else if (meridianComponent.equalsIgnoreCase("PM")) {
            int hourComponentInt = Integer.parseInt(hourComponent);
            if (hourComponentInt < 12) {
                hourComponentInt = hourComponentInt + 12;
            }
                hourComponent = String.valueOf(hourComponentInt);
        }
        return hourComponent + ":" + minuteComponent + ":" + secondsComponent;
    }

}
