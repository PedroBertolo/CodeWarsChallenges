import kyu6.BreakCamelCase;
import kyu6.CreatePhoneNumber;
import kyu7.HighestAndLowest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testsKyu6 {

    @Test
    @DisplayName("CreatePhoneNumber - createPhoneNumber")
    public void createPhoneNumberTest() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    @DisplayName("BreakCamelCase - camelCase")
    public void tests() {
        assertEquals(  "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals( "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals(  "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }

}
