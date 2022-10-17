public class RightTriangle {
    double base;
    double height;

    public RightTriangle(double x, double y)
    {
        base = x;
        height = y;
    }

    public double Hypotenuse()
    {
        return Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
    }
}
