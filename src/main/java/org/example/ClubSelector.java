package org.example;

public class ClubSelector {
    public String choose(String gender, int age, double height, double bmi) {
        String result = "";
        if (gender.equals("男") && age < 30 && bmi < 24) {
            result = "籃球社";
        } else if (gender.equals("女") && age < 30) {
            if (bmi > 24) {
                result = "健身社";
            } else if (height > 172) {
                result = "排球社";
            } else {
                if (age < 22 && bmi > 28) {
                    result = "減重社";
                } else {
                    result = "桌球社";
                }
            }
        }
        return result;
    }

}
