class StringMani {

    private String mainString = new String(), insertionString = new String();

    public StringMani(String mainString, String insertionString) {
        this.mainString = mainString;
        this.insertionString = insertionString;
    }

    public String concatStrings() {
        int index;
        for (index = 0; index < mainString.length(); index++) {
            if (Character.isDigit(mainString.charAt(index))) {
                break;
            }
        }

        return mainString.substring(0, index) + insertionString + mainString.substring(index);
    }

}

public class StringMan {
    public static void main(String[] args) {
        StringMani strman = new StringMani("REY4", "@#");
        System.out.println("Result " + strman.concatStrings());
    }
}