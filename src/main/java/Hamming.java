import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Hamming {

    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand == "" && rightStrand != "") {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if(rightStrand == "" && leftStrand != "") {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if(leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        int differences = 0;
        
        for(int count = 0; count < leftStrand.length(); count++) {
            if(leftStrand.charAt(count) != rightStrand.charAt(count)){
                differences++;
            }
        }
        
        return differences;
    }
}
