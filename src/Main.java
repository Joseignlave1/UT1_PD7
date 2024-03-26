public class Main {
    public static void main(String[] args) {
        String s = "1";
        while (s != "1000") {
            s += "0";
        }

    }
    /*
        a) la diferencia radica en qué solo los primitive types en java se pueden comparar con el operador ==, en este caso al comparar
        dos Strings, java compara la dirección en memoria del String s con la dirección en memoría del String "1000", para comparar el contenido
        de los Strings debemos utilizar el método equals()
     */
}