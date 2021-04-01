import java.util.Scanner;

public class main {
     private static double a;
     private static double b;
    static Scanner input = new Scanner(System.in);
    static Calculadora calc1 = new Calculadora();

    public static void main(String[]args) {
        System.out.println("Bienvenido a la calculadora hecha por la Belén");
        cambiarValores();

        poto: //etiqueta, le da un nombre al while.
        while(true){
        System.out.println("a: " + a + " b:" + b + " ¿Qué operación desea realizar? \n");
        System.out.println("Las opciones son: ");
        System.out.println("1. Sumar a y b");
        System.out.println("2. restar a y b");
        System.out.println("3. multiplicar a y b");
        System.out.println("4. Dividir a y b");
        System.out.println("5. Cambiar los valores de a y b");
        System.out.println("0. salir");

        String opcion= input.nextLine();

        switch (opcion){
            case "1":
                hacerSuma();
            case "2":
                hacerResta();
            case "3":
                hacerMultiplicación();
            case "4":
                hacerDivision();
            case "5":
                cambiarValores();
            case "0":
                System.out.println("adiós uwu");
                break poto;
            default:
                break;
        }
    } }
    // validar el resultado correspondiente
    // usar el metodo sumar de cal1 pasando los valores a y b, y almacenar el resultado
    // mostrar en pantalla el resultado

    public static void hacerSuma(){
        double resultado = calc1.sumar(a,b);
        System.out.println(a+" + "+b+" = "+resultado);

    }
    public static void hacerResta(){
        double resultado = calc1.resta(a,b);
        System.out.println(a+" - "+b+" = "+ resultado);

    }
    public static void hacerMultiplicación(){
        double resultado= calc1.multiplicar(a,b);
        System.out.println(a+" * "+b+" = "+resultado);
    }
    public static void hacerDivision(){
        if (b==0){
            System.out.println("erro: b no puede ser 0, cambie los valores");
            return;
        }

        double resultado= calc1.dividir(a,b);
    }

    public static void cambiarValores (){
        System.out.println("ingrese los valores de a y b \n");

       try{ System.out.println("ingrese el valor de a");
        a= input.nextDouble();
        System.out.println("ingrese el valor de b");
        b= input.nextDouble();
            }catch (Exception e){
           System.out.println("Error: entrada no válida");
           if (input.hasNextLine()) input.nextLine();
           cambiarValores();
       }



    }
}