package zipcode;

public class Hamming {
    String str1 = "";
    String str2 = "";

    public Hamming(String s, String s1) {
        this.str1 = s;
        this.str2 = s1;
    }

    public int getHammingDistance() {
        int counter = 0;
        while (true) {
            try {
            if (this.str1.length() == this.str2.length()) {
                for (int i = 0; i < this.str1.length(); i++) {
                    if (this.str1.charAt(i) != this.str2.charAt(i)) {
                        counter++
                    }
                }
            } catch (IllegalArgumentException e) {

                }
            }
        }
        return counter;
    }
}
