public class moreAboutStrings {
    public static void main(String[] args) {
        String name = "name";

        boolean result = name.equalsIgnoreCase("bro");
        int stringLength = name.length();
        char charMethod = name.charAt(0);
        int indexMethod = name.indexOf("B");
        boolean resultado = name.isEmpty(); // true or false if have something writed in the string above.
        String upperCase = name.toUpperCase();
        String lowerCase = name.toLowerCase();
        String trimming = name.trim();
        String replacing = name.replace("a", "o");


        System.out.println(result);
        System.out.println(stringLength);
        System.out.println(charMethod);
        System.out.println(indexMethod);
        System.out.println(replacing);
    }
}
