import java.io*
public class Main{

    public static Scanner teclado = new Scanner (System.in);
    public static int Menu(){
        int opción;
    
        System.out.println("Bienvenido al buscador de CP :)");    

        System.out.println("1)Busca tu dirección");
        System.out.println("2)¿Quieres realizar otra busqueda?");
        System.out.println("3)Exit");
        
        return opción;
    }
    
public static void main(Strings args[5]){

    Cadena cp[5];

    cp = new cp();
    int num;
    int opción;
    do{

        opción = Menu();

        switch(opción){
            case 1:
             System.out.println("Ingresa tu CP:");
             num = teclado.nextdouble();
             System.out.println("");

             case 2 :
             System.out.println("Ingresa el nuevo CP:");
             num = teclado.nextdouble();
             
             case 3:
             System.out.println("Gracias por utilizar nuestro servicio :D");
             break;
             default:
                 break;

        }
        while (opción!=3);
    }     
    

}
