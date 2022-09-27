package Ejercicio8_POO;

import java.util.Scanner;

/** @author galvi
 * Ejercicio 8: Una empresa de envío de paquetes tiene varias sucursales en todo el país. Cada sucursal está definida por su
 * número de sucursal, dirección y ciudad. Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en
 * cuenta el precio del paquete y la prioridad, sabiendo que se cobra un dólar por kilo, 10 dólares más si la prioridad es
 * alta y 20 si es express. Cada paquete enviado tendrá un número de referencia y el DNI de la persona que lo envía.
 *** Objeto --> Dos instancias (Sucursal y Paquete). Constructor Sucursal - 3 parámetros, Constructor Paquete - 4 params
 *** Atr Sucursal --> (número de sucursal (int), dirección y ciudad(String))
 *** Atr Paquete --> (númeroPaquete (int), DNI (String), peso (double) y prioridad (int)).
 *** Métodos Sucursal: Constructor, getNumeroSucursal(): int, getDireccion(): String, getCiudad(): String,
 *** mostrarDatosSucrusal(): String y calcular_precio(Paquete t): double
 *** Métodos Paquete: Constructor, getNumeroPaquete(): int, getDni(): String, getPeso(): double, getPrioridad(): int, y
 *** mostrarDatosPaquete(): String
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSucursal, numeroPaquete, prioridad, opcion, indiceSucursal, indicePaquete;
        int contadorSucursal = 0, contadorPaquete= 0;
        String direccion, ciudad, dni;
        double peso, precioPaquete;

        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

        do{
            System.out.println("\t\n.:MENU:.");
            System.out.println("1. Crear una nueva sucursal");
            System.out.println("2. Enviar paquete");
            System.out.println("3. Consultar sucursal");
            System.out.println("4. Consultar paquete");
            System.out.println("5. Mostrar todas las sucursales");
            System.out.println("6. Mostrar todos los paquetes");
            System.out.println("7. Salir");
            System.out.print("Digite la opción del menú: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("\nDigite la dirección: ");
                    direccion = entrada.nextLine();
                    System.out.print("\nDigite la ciudad: ");
                    ciudad = entrada.nextLine();

                    sucursal[contadorSucursal] = new Sucursal(numeroSucursal, direccion, ciudad);
                    contadorSucursal++;
                    break;
                case 2:
                    System.out.print("\nDigite el número de sucursal: ");
                    numeroSucursal = entrada.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1){
                        System.out.println("La sucursal no existe!");
                    }
                    else{
                        System.out.print("\nDigite el número del paquete: ");
                        numeroPaquete = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("\nDigite el dni de la persona: ");
                        dni = entrada.nextLine();
                        System.out.print("\nDigite el peso del paquete: ");
                        peso = entrada.nextDouble();
                        System.out.print("\nDigite la prioridad (0 = normal, 1 = alta, 2 = express): ");
                        prioridad = entrada.nextInt();

                        paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);

                        precioPaquete = sucursal[indiceSucursal].calcular_precio(paquete[contadorPaquete]);

                        System.out.println("\nEl precio es: $"+precioPaquete);
                        contadorPaquete++;
                    }
                    break;
                case 3:
                    System.out.print("\nDigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();

                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    if (indiceSucursal == -1){
                        System.out.println("La sucursal no existe!");
                    }
                    else {
                        System.out.println("\nLos datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
                    }
                    break;
                case 4:
                    System.out.print("\nDigite el numero de paquete: ");
                    numeroPaquete = entrada.nextInt();

                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                    if (indicePaquete == -1){
                        System.out.println("El paquete no existe!");
                    }
                    else {
                        System.out.println("\nLos datos del paquete son: ");
                        System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
                    }
                    break;
                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {
                        System.out.println("\nDatos de la Sucursal N°"+(i+1)+":");
                        System.out.println(sucursal[i].mostrarDatosSucursal());
                    }
                    break;
                case 6:
                    for (int i = 0; i < contadorPaquete; i++) {
                        System.out.println("\nDatos del Paquete N°"+(i+1)+":");
                        System.out.println(paquete[i].mostrarDatosPaquete());
                    }
                    break;
                case 7: break;
                default:
                    System.out.println("Error, opcion de menú!");
                    break;
            }
        }
        while(opcion != 7);
        System.out.println("\nFin del programa!");
    }

    public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal){
        int indice = 0;
        boolean encontrado = false;

        for(int i = 0; i < contadorSucursal; i++){
            if(t[i].getNumeroSucursal() == numeroSucursal){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }

    public static int buscarPaquete(Paquete p[], int numeroPaquete, int contadorPaquete){
        int indice = 0;
        boolean encontrado = false;

        for(int i = 0; i < contadorPaquete; i++){
            if(p[i].getNumeroPaquete() == numeroPaquete){
                encontrado = true;
                indice = i;
            }
        }
        if(encontrado == false){
            indice = -1;
        }
        return indice;
    }
}
