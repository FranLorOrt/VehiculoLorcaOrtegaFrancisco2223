
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoLorcaOrtegaFrancisco2223 miVehiculoLorcaOrtegaFrancisco2223;
        int stockActual;
        
        operativaVehiculosLorcaOrtegaFrancisco2223(50);
    }

    private static void operativaVehiculosLorcaOrtegaFrancisco2223(int cantidad) {
        VehiculoLorcaOrtegaFrancisco2223 miVehiculoLorcaOrtegaFrancisco2223;
        int stockActual;
        miVehiculoLorcaOrtegaFrancisco2223 = new VehiculoLorcaOrtegaFrancisco2223("Seat",18000,100);
        try 
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLorcaOrtegaFrancisco2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLorcaOrtegaFrancisco2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoLorcaOrtegaFrancisco2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
