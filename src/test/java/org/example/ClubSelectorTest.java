package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClubSelectorTest {

    private ClubSelector clubSelector;

    @BeforeEach
    void setUp() {
        clubSelector = new ClubSelector();
    }

    @Test
    void testMaleBasketballCase() {
        String result = clubSelector.choose("男", 29, 190, 23);
        assertEquals("籃球社", result);
    }

    @Test
    void testFemaleFitnessCase() {
        String result = clubSelector.choose("女", 29, 172, 25);
        assertEquals("健身社", result);
    }

}
