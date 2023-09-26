package pkg9.numeros.almacenados.en.un.arreglo;
import java.util.Scanner;
public class NumerosAlmacenadosEnUnArreglo 
{
    public static void main(String[] args)
    {
        Scanner leer= new Scanner(System.in);
        int[]arreglo=new int[9];
        for(int cont=1; cont<=9; cont++)
        {
          System.out.print("Ingresa un numero: ");
          arreglo[cont]=leer.nextInt();
        }
    } 
}
