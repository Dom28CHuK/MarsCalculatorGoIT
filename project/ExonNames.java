package project;

public class ExonNames {
    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }
    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("gork", "Maxon");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
    }
}
