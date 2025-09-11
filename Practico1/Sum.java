public class Sum{
    public static void main(String[] args) {
        if(args.length == 2)
        {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int resultado = num1 + num2;

            System.out.println("La suma es: " + resultado);
        }else{
            System.out.println("Por favor ingresa exactamente dos números.");
        }
    }
}