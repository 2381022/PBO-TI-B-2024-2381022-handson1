public class TipeDataString {
    public static void main(String[] args) {
        //Perbedaan primitive dan non primitive
        String firstName = "Paul";
        String lastName = "Andrew";
        String fullName = firstName + " " + lastName;
//       System.out.println(firstName + " " + lastName);
//       System.out.println(firstName.concat(lastName));
//       System.out.println(lastName.toLowerCase());
        System.out.println(fullName.toUpperCase());

//        System.out.println(fullName.charAt(6));
        System.out.println(fullName.contains("Andrew"));

    }
}
