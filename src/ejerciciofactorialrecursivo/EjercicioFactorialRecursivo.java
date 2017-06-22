package ejerciciofactorialrecursivo;

/**
 *
 * @author JUAN
 */
public class EjercicioFactorialRecursivo {

    static int factorial(int n) {
        if(n == 0)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println("El factorial es: "+factorial(10) );
        
    }
    
}
