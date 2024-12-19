package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClubSelectorTest2 {

    private ClubSelector clubSelector;

    @BeforeEach
    void setUp() {
        clubSelector = new ClubSelector();
    }


//    String result = "";
//        if (gender.equals("男") && age < 30 && bmi < 24) {
//        result = "籃球社";
//    } else if (gender.equals("女") && age < 30) {
//        if (bmi > 24) {
//            result = "健身社";
//        } else if (height > 172) {
//            result = "排球社";
//        } else {
//            if (age < 22 && bmi > 28) {
//                result = "減重社";
//            } else {
//                result = "桌球社";
//            }
//bmi 24~28
// age 22~30
//身高 < 172 || 身高 > 172


    //#1 第一組測試案例 一般數值
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

    //#2 第二組測試案例 年齡邊界值測試 因為年紀22~30
    @Test
    void testMaleBasketballCase2() {
        String result = clubSelector.choose("男", 31, 190, 23);
        assertEquals("", result);
    }
    @Test
    void testFemaleFitnessCase2() {
        String result = clubSelector.choose("女",21 , 172, 25);
        assertEquals("", result);
    }

    //#3 第三組測試案例 BMI邊界值測試 因為BMI範圍24~28
    @Test
    void testMaleBasketballCase3() {
        String result = clubSelector.choose("男", 29, 190, 23);
        assertEquals("", result);
    }
    @Test
    void testFemaleVolleyballCase3() {
        String result = clubSelector.choose("女", 25, 173, 29);
        assertEquals("排球社", result);
    }

    //#4 第四組測試案例 身高邊界值測試 身高 > 172 || 身高 < 172
    @Test
    void testFemaleWeightLossCase4() {
        String result = clubSelector.choose("女", 21, 173, 29);
        assertEquals("減重社", result);
    }
    @Test
    void testFemaleTableTennisCase4() {
        String result = clubSelector.choose("女", 25, 171, 23);
        assertEquals("桌球社", result);
    }

    //#5 第五組測試案例 極端值測試
    @Test
    void testMaleBasketballCase5() {
        String result = clubSelector.choose("男", 18, 160, 20);
        assertEquals("籃球社", result);
    }
    @Test
    void testFemaleWeightLossCase5() {
        String result = clubSelector.choose("女", 21, 150, 30);
        assertEquals("減重社", result);
    }


}
