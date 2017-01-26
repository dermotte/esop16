package at.aau.itec.esop16.lesson11;

/**
 * @author Dr. Mathias Lux, mlux@itec.aau.at, 26.01.2017 15:08.
 */
public class Circle {
    double centerX, centerY, radius;
    long circleNumber;
    private static long instanceCount = 0;

    public Circle(double centerX, double centerY, double radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        instanceCount++;
        circleNumber = instanceCount;
    }

    public Circle() {
        instanceCount++;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static long getNumberOfInstances() {
        return instanceCount;
    }
}
