import java.io.*;

public class Ventas {
    static InputStreamReader entrada = new InputStreamReader(System.in);
    static BufferedReader flujoEntrada = new BufferedReader(entrada);
    static String datoEntrada;
    public static void main(String[] args) throws IOException {
    
        int costo;
        int cantidad_pedida;
        int precio_unitario;
         int descuento;
   
          System.out.println("Ingrese el valor de la cantidad pedida");
            datoEntrada = flujoEntrada.readLine();
            cantidad_pedida = Integer.parseInt(datoEntrada);
              
          System.out.println("Ingrese el valor de precio unitario");
          datoEntrada = flujoEntrada.readLine();
          precio_unitario = Integer.parseInt(datoEntrada);
    
    
           costo= cantidad_pedida*precio_unitario;
           
           if(cantidad_pedida>50)
               descuento=15;
           else
               descuento=0;
           costo=costo-costo*descuento/100;
           System.out.println("Valor de costo: " + costo);
           System.out.println("Valor de descuento: " + descuento);
    }
    

}
