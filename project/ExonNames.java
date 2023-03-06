package project;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        return (name.contains("A") ^ name.contains("a")) ^
                (name.contains("O") ^ name.contains("o"));
    }

    public String getNameCode(String name) {
        if (name.length() == 1) {
            String firstChar = String.valueOf(name.charAt(0));
            return firstChar.toUpperCase();
        } else {
            String firstChar = String.valueOf(name.charAt(0));
            String lastChar = String.valueOf(name.charAt(name.length() - 1));
            return firstChar.toUpperCase() + lastChar.toUpperCase();
        }
    }

    public boolean isMoneyName(String name) {
        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        boolean isFirstCharDigit = Character.isDigit(firstChar);
        boolean isLastCharDigit = Character.isDigit(lastChar);

//        boolean firstLetterOk = firstLetter >= '0' && firstLetter <= '9';
//        boolean lastLetterOk = lastLetter >= '0' && lastLetter <= '9';
//        return firstLetterOk && lastLetterOk;

        return isFirstCharDigit == isLastCharDigit;
//        char = '5';
//        boolean isDigit = symbol >= '0' && symbol <= '9';
    }

    public boolean isInvisibleName(String name) {
        return name.isBlank();
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        boolean isNameLucky = names.isNameLucky("Igun");
        System.out.println("names.isNameLucky(\"Igun\") = " + isNameLucky);

        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        String nameCode2 = names.getNameCode("x");
        System.out.println("names.getNameCode(\"x\") = " + nameCode2);

        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);

        boolean isInvisible = names.isInvisibleName(" ");
        System.out.println("names.isInvisibleName(\" \") = " + isInvisible);
    }
}
