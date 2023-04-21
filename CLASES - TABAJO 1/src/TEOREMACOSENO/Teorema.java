package TEOREMACOSENO;
import static java.lang.Math.sqrt;
import static java.lang.Math.cos;


public class Teorema
{
    public double a;
    public float b;
    public float c;
    public float alfa;

    public double teo()
    {
        return a=sqrt(b*b+c*c-2*b*cos(alfa));
    }

    public void mostrarTeorema()
    {
        return;
    }
}
