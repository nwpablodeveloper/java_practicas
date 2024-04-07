package variables.primitivos;

public class tipoLong {

    public static void main(String[] args) {

        /*
            Las variables con datos de tipo LONG pueden almacenar datos desde:
            -9223372036854775808
            92233720368547758
         */
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);
    }
}
