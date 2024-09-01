public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataint = tipeDataShort;
        long tipeDataLong = tipeDataint;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        // Narrowing
        int tipeDataInteger = 128;
        byte tipeDataByte2 = (byte) tipeDataInteger;
        System.out.println(tipeDataByte2);

        String firstname, lastname;
        firstname = "Paul";
        lastname = "Andrew";

        System.out.printf("%s %s", firstname, lastname);
    }
}
