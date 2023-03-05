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
        String firstChar = String.valueOf(name.charAt(0));
        String lastChar = String.valueOf(name.charAt(name.length() - 1));
        return firstChar.toUpperCase() + lastChar.toUpperCase();
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
    }
}
