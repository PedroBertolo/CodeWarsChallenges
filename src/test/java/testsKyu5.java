import kyu5.PigLatin;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testsKyu5 {

    @Test
    @DisplayName("PigLatin - pigIt")
    public void fixedTestsPigLatin() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }

    //    ----------------------- SEPARATOR -----------------------

}


