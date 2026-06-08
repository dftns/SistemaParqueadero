import presentacion.Menu;
import negocio.GestorParqueadero;

/**
 * Clase Main: Punto de entrada del aplicativo.
 * Inicializa el programa y muestra el menú principal.
 * 
 * Características implementadas:
 * - Capa de Presentación: Menu.java
 * - Capa de Negocio: GestorParqueadero, CalculadoraTarifa, ValidadorEntrada
 * - Capa de Datos: Repositorios y ArchivoManager
 * - Modelos: Usuario, Vehiculo, Registro, TarifaBase, TarifaEstandar
 * 
 * @author Sistema Parqueadero
 * @version 1.0
 */
public class Main {
    
    /**
     * Método principal que inicia la aplicación
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        try {
            // Crear el gestor del parqueadero
            GestorParqueadero gestor = new GestorParqueadero();
            
            // Crear el menú
            Menu menu = new Menu(gestor);
            
            // Mostrar menú principal
            menu.mostrarMenuPrincipal();
            
        } catch (Exception e) {
            System.err.println("❌ Error crítico: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
