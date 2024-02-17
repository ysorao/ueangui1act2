import java.util.*;
public class Main{
    public static void main(String[] args) {

        System.out.println("\n\n***********************************************");
            System.out.println("********** Calcular Diversas areas  ***********");
            System.out.println("***********************************************"); 
        System.out.println("Este Programa calcula diversas areas Ingrese el numero del Menu del area que desea calcular:\n");

        System.out.println("1. Calcule el area de un Rectangulo");
        System.out.println("2. Halle la Hipotenusa de un triangulo rectangulo");
        System.out.println("3. Calcule el area de un triangulo");
        System.out.println("4. Calcule el perimetro de un cuadrilatero (se requiere medidas de 3 lados)");
        

        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese la opcion del Menú (solo numeros enteros sin punto) ");
        double menu = datos.nextInt();

        if(menu == 1){
        
            System.out.println("------------------------------------------------------------.\n ");
            System.out.println("De acuerdo, Calcularemos el area de un rectangulo.\n ");

            System.out.println("Ingrese la base: ");
            double base = datos.nextDouble();

            System.out.println("Ingrese la altura: ");
            double altura = datos.nextDouble();

            Rectangulo areaRec = new Rectangulo(base, altura);
            System.out.println("- El area del Rectangulo es : " + areaRec.calculaArea());

        }else if(menu == 2){

            System.out.println("------------------------------------------------------------.\n ");
            System.out.println("De acuerdo, Hallemos la Hipotenusa.\n ");

            System.out.println("Ingrese el cateto 1: ");
            double cateto1 = datos.nextDouble();

            System.out.println("Ingrese el cateto 2: ");
            double cateto2 = datos.nextDouble();

            Triangulo  hipTriangulo = new Triangulo(cateto1, cateto2);
            System.out.println("- La Hipotenusa es : " + hipTriangulo.calculaHipotenusa());
            
                    
        }else if(menu == 3){

            System.out.println("------------------------------------------------------------.\n ");
            System.out.println("De acuerdo, Calcularemos el area de un Triangulo.\n ");
            System.out.println("Ingrese la base: ");
            double base = datos.nextDouble();

            System.out.println("Ingrese la altura: ");
            double altura = datos.nextDouble();
            TrianguloArea areaTriangulo = new TrianguloArea(base, altura);
            System.out.println("- El area del triangulo es : " + areaTriangulo.calculaArea());
            
        }else if(menu == 4){
            System.out.println("------------------------------------------------------------.\n ");
            System.out.println("De acuerdo, Calcularemos el area de un cuadrilatero.\n ");

            System.out.println("Ingrese la Lado A: ");
            double ladoa = datos.nextDouble();

            System.out.println("Ingrese la Lado B: ");
            double ladob = datos.nextDouble();

            System.out.println("Ingrese la Lado C: ");
            double ladoc = datos.nextDouble();

            Irregular cuadrilatero = new Irregular(ladoa, ladob,ladoc);
            double cateto1 = cuadrilatero.calcularLadoD();
            Triangulo hipotenusa = new Triangulo(cateto1, ladob);
            double ladod= hipotenusa.calculaHipotenusa();
            double perimetro = ladoa+ladob+ladoc+ladod;
            System.out.println("- Con estos datos definimos que la medida del lado D es: " + ladod);
            System.out.println("- Port lo tanto el perimetro del terreno es " + perimetro);

        
        }



        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");



    }
}