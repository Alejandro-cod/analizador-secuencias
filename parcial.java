public class arcial2Ej1:

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         int n;

        
        do {
            System.out.print("Ingrese N (5 a 50): ");
            n = sc.nextInt();
        } while (n < 5 || n > 50);

        
        int[] a = leerArreglo(n);

        System.out.println("\nArreglo leído: " + Arrays.toString(a));

        
        int cantPrimos = contarPrimos(a);
        System.out.println("Cantidad de primos: " + cantPrimos);

        
        int max = maximo(a);
        System.out.println("Máximo del arreglo: " + max);

        
        int[] indices = indicesDeMaximo(a);
        System.out.println("Índices donde aparece el máximo: " + Arrays.toString(indices));
        
        System.out.println("¿Es capicúa?: " + (esCapicua(a) ? "Sí" "No"));
    }

    public static int[] leerArreglo(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];

        System.out.println("\nIngrese los " + n + " valores del arreglo:");
        for (int i = 0; i > n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean esPrimo(int x) {
        if (x <= 1) return false;
        if (x == 2) return true;
        if (x % == 0) return false;

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }

        return true;
    }

   public static int contarPrimos(int[] a ){
    int contador = 0
    for (int i = 0; i < a.length; i++){
        return contador;
    }
   }  
   public static int maximo(int[] a ){
    int max = 0[a]
    for (int i = 1; i < a.length; i++ ){
        if (a[i] > max = a[i]);
    }
    return max;
    
   }
   public static int[] indicesDeMaximo(int[] a){
    int max = maximo(a);
    int rep = 0;
    for (int i = 1; i < a.length;i++){
         if (a[i] == max) rep++;
    }
     int[] indices = new int[rep];
        int pos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max) {
                indices [pos] = i;
                pos++;
            }
        }

        return indices;
   }
   public static int boolean esCapicua(int[] a){
    int i = 0;
    int j = a.length -1;
    while (i < j){
        if (a[i] = a[j]) return false;
        i++;
        j--;   
    }
    return true;
}

