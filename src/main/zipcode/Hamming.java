package zipcode;

public class Hamming {
    String str1;
    String str2;


    public Hamming(String s, String s1) {
        this.str1 = s;
        this.str2 = s1;
    }

    public int getHammingDistance() throws IllegalArgumentException {
        int counter = 0;
        try {
            if (this.str1.length() == this.str2.length()) {
                for (int i = 0; i < this.str1.length(); i++) {
                    if (this.str1.charAt(i) != this.str2.charAt(i)) {
                        counter++;
                    }
                }
            }
            return counter;
        } catch (IllegalArgumentException e) {
            //if (this.str1.length() != this.str2.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
            //}
        }
    }

}
