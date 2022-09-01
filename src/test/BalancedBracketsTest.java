package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
       // "[LaunchCode", "Launch]Code[", "[", "]["
    @Test
        public void onlyOpeningBracketReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
        public void backwardBracketPairsReturnsFalse() {
            assertFalse(BalancedBrackets.hasBalancedBrackets("]["));

    }

    @Test
        public void multiBracketPairsReturnsTrue() {

    }

    @Test
        public void oddNumberOfBrackets() {

    }

}
