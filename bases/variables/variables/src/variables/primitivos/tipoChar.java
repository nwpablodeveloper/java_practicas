package variables.primitivos;

public class tipoChar {

    public static void main(String[] args) {

        /*
            Las variables tipo char se usa para almacener 1 caracter y lo
            podremos realizar de las siguientes maneras:
            1. Por codigo Unicode
            2. Por carácter
            3. Por número Octal
         */
        System.out.println("Imprimiendo la letra S mayuscula \n");

        char conCodigoUnicode = '\u0053';
        System.out.println("conCodigoUnicode = " + conCodigoUnicode);

        char conCaracter = 'S';
        System.out.println("conCaracter = " + conCaracter);

        char conOctal = 0123;
        System.out.println("conOctal = " + conOctal);

        // Escribi tu nombre con Char
        System.out.println("\n Escribir tu nombre con char usando char");

        char letra1 = '\u0050';     // Unicode
        char letra2 = 'a';          // Carácter
        char letra3 = '\u0062';
        char letra4 = '\u006C'; 
        char letra5 = '\u006F';
        char espacio = '\u0020';
        char letra6 = 86;           // Decimal
        char letra7 = '\u0065';
        char letra8 = 0151;         // Octal
        char letra9 = '\u0067';
        char letra10 = letra2;

        System.out.println("nombre = "
                + letra1
                + letra2
                + letra3
                + letra4
                + letra5
                + espacio
                + letra6
                + letra7
                + letra8
                + letra9
                + letra10
                );
    }
}
