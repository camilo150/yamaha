package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variables
        String nombreCliente, tipoDocumento, documento,telefonoMovil, telefonoFijo, direccion, noimbreFiador, documentoFiador, tipoCompra;
        Integer idCliente, idFiador;
        double valorTotalMoto=0.0, valorButoMoto, procentajeFinaciado;
        boolean licenica;
        Scanner leerDato = new Scanner(System.in);
        int motoseleccionada;
        //pregunto por la licencia

        System.out.println("hola bienvenido a yamaha tiene licencia?");
        licenica = leerDato.nextBoolean();
        if (licenica) {
            leerDato.nextLine();
            System.out.println("ingrese su nombre");
            nombreCliente=leerDato.nextLine();
            System.out.println("ingrese su tipo de documento");
            tipoDocumento=leerDato.nextLine();
            System.out.println("ingrerse su numero de identificacion");
            documento=leerDato.nextLine();
            System.out.println("ingrese su telefono celular");
            telefonoMovil=leerDato.nextLine();
            System.out.println("ingrese su telefono");
            telefonoFijo=leerDato.nextLine();
            System.out.println("ingrese su direccon de recidencia");
            direccion= leerDato.nextLine();
            System.out.println("ingrese el nombre del fiador");
            noimbreFiador= leerDato.nextLine();
            System.out.println("ingrese el numero de identicicacion del fiador");
            documentoFiador=leerDato.nextLine();

            System.out.println("nuestras motos son:");
            System.out.println("1. YAMAHA SRZ 125--9M");
            System.out.println("2. YAMAHA CRYPTON F1--8M");
            System.out.println("3. YAMAHA XTZ125--10500M");
            System.out.println("4. YAMAHA MT10--72M");
            System.out.println("5 YAMAHA NMAX300--34M");

            System.out.println("digite la moto seleccionada con el numero que tiene al costado");
            motoseleccionada=leerDato.nextInt();
            if (motoseleccionada==1){
                valorButoMoto=9000000;
            }else if (motoseleccionada==2){
                valorButoMoto=8000000;
             }else if (motoseleccionada==3){
                valorButoMoto=10500000;
            }else if (motoseleccionada==4){
                valorButoMoto=72000000;
             }else if (motoseleccionada==5){
                valorButoMoto=34000000;
        }else if (motoseleccionada<1 || motoseleccionada>5){
                System.out.println("por favor ingrese un dato valido");
            }
            //tipo de pago
            System.out.println("usuario digite si quiere comprarla a credito o a contado");
            leerDato.nextLine();
            tipoCompra = leerDato.nextLine().toLowerCase();
            if (tipoCompra.equals("credito")) {
                System.out.println("que porcentaje desea financiar el 0, 30 o el 50?");
                procentajeFinaciado = leerDato.nextDouble();
                if (procentajeFinaciado == 1.0) {
                    System.out.println();
                } else if (procentajeFinaciado == 0.7) {
                    System.out.println();

                } else if (procentajeFinaciado == 0.5) {
                    System.out.println();

                } else if (procentajeFinaciado != 1.0 || procentajeFinaciado != 0.7 || procentajeFinaciado != 0.5) {
                    System.out.println("no podemos financiarte un valor distinto al que hay disponible");


                } else if (tipoCompra.equals("credito")) {
                    System.out.println("exlente, le daremos un descuento del 10%");

                } else
                    System.out.println("no no te entiendo indigena");
                {


                }
            } else {
                System.out.println("abrase para la gran re puta mierda pirobo");
            }
        }
    }
}
