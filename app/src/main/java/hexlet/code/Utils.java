package hexlet.code;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        maxValue = maxValue + 1;
        return (int) (Math.random() * (maxValue - minValue) + minValue);
    }
}
