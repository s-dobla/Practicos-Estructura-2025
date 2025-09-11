import java.util.List;
import java.util.ArrayList;

public class MedicionesTemperaturasTest
{
    private String fecha;
    private List<Integer> temperaturas;

    public MedicionesTemperaturasTest(String fecha)
    {
        this.fecha = fecha;
        this.temperaturas = new ArrayList<>();

    }

    public void agregarTemperatura(int temp)
    {
        temperaturas.add(temp);
    }

    public void verRegistro()
    {
        System.out.println("Fecha: " + fecha);
        System.out.println("Temperaturas: " + temperaturas);

    }

    public static void main(String[] args)
    {
        MedicionesTemperaturasTest registro = new MedicionesTemperaturasTest("1 de Febrero");

        int[] temps ={-1, 3, 8, 15, 12, 6, 6, 2};
        for(int t: temps)
        {
            registro.agregarTemperatura(t);
        }

        registro.verRegistro();
    }
}