public class Ejercicio2 {
    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        if ( s1.equals(s2)) {
            System.out.println( "True" );
        } else {
            System.out.println( "False" );
        }

        //1
        /*
            String s1 = "Hola";
            String s2 = "Hola";
            if ( s1 == s2 ) {
                System.out.println( "True" );
            } else {
                System.out.println( "False" );
            }
         */
        //2
        /*
            String s1 = new String("Hola");
            String s2 = "Hola";
            if ( s1 == s2 ) {
                System.out.println( "True" );
            } else {
                System.out.println( "False" );
            }
         */

    }
    /*
      1) En el primer caso la sentencia que se ejecuta es la sentencia  System.out.println( "False" ); , imprimiendo en pantalla "false",
         esto es debido a qué la dirección de memoria de s1 no es igual que la dirección de memoria de s2, ya qué al crear las variables, java las guarda
         en direcciónes de memoría distintas

         2)En java cuándo creas un objeto de tipo String utilizando el operador new, estás creando una nueva instancia de String en memoria,
         independientemente de si ya existe otra instancia que posea los mismos caractéres(otro Objeto de tipo String que posea los mismos caractéres)
         después en relación a la comparación en el if, esta posee el mismo problema que en el código número 1.


         Referencias:
         ".equals() vs. == in Java - The Real Difference"
         https://www.youtube.com/watch?v=AoUVdLWLFQw&ab_channel=CodingwithJohn

         método intern() de la clase String:

         El método intern se asegura si el String está presente en el String Pool(Área especial de la memoria donde se almacenan los Strings)
         si está presente, devuelve una referencia a ese String, si el String no está presente, entonces se agrega y posteriormente devuelve una
         referencia al String agregado.

         Ejemplo:
         String s1 = new String("Hola").intern(); // s1 apunta a la cadena "Hola" en el String Pool, debido a qué usamos el método intern();
         String s2 = "Hola"; // s2 apunta a la misma cadena "Hola" en el String Pool

         System.out.println(s1 == s2); // por lo tanto esto devolverá true, ya qué apuntan a la misma dirección de memoria.

         heap: región de memoria en la cuál se almacenan los objetos creados durante la ejecución de un programa.
     */

}
