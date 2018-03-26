package com.company;
import javax.swing.*;

public class BMIC {

    public static void main(String[] args) {

        String title = "Body Mass Index calculator";


        int errorMessage = JOptionPane.ERROR_MESSAGE;
        int warningMessage = JOptionPane.WARNING_MESSAGE;
        int informationMessage = JOptionPane.INFORMATION_MESSAGE;
        int okOption = JOptionPane.OK_OPTION;


        String Disclaimer = "BMI is in fact only a guide and if there is an opportunity to\n" +
                " conduct a Skinfold test or bio-electrical resistance analysis, then\n" +
                " BMI should not be used. These tests measure the total percentage\n" +
                " of fat content. BEAS is more precise and it can be held in most gyms.\n" +
                " Some of the BEAS tests can be carried out using the home weight measuring it.\n" +
                " There are other ways that give a more accurate result,\n" +
                " but they are expensive and more difficult to conduct.\n" +
                "    In recent studies, it has been found that the ratio of waist to hip size\n" +
                " determines whether or not fat is better than BMI. Usually, this ratio shouldn't\n" +
                " exceed 0.9 in men and 0.8 in women. The greater the ratio is the sign of a possible\n" +
                " heart attack, stroke or diabetes.\n" +
                "    BMI is a pretty good indicator for a normal person between the ages of 25 and 65.\n" +
                " However, he has his limitations. It does not take into account the muscle mass\n" +
                " or body type (\"apple-shaped\" and \"pear-shaped\" body types).";

        String disclaimerTitle = "Disclaimer";


        JOptionPane.showMessageDialog(null, Disclaimer, disclaimerTitle, okOption);


        float weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in pounds: "));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches: "));

        float BMI = ((weight / (height * height)) * 703);


        if (BMI <= 17.5) {
            JOptionPane.showMessageDialog(null, "You have critically low weight!\nTry to consult with doctor!\nYour BMI is " + BMI, title, errorMessage);
        }


        if (BMI <= 18.5) {
            JOptionPane.showMessageDialog(null, "You are underweight!\nYour BMI is " + BMI, title, warningMessage);
        }


        if (BMI >= 18.6 & BMI <= 24.9) {
            JOptionPane.showMessageDialog(null, "You are fully healthy!\nYour BMI is " + BMI, title, informationMessage);
        }

        if (BMI >= 25.0 & BMI <= 29.9) {
            JOptionPane.showMessageDialog(null, "You are overweight!\nYour BMI is " + BMI, title, warningMessage);
        }

        if (BMI >= 30.0) {
            JOptionPane.showMessageDialog(null, "You have obesity, in this case, consult a doctor or think about how to lose weight!\nYour BMI is " + BMI, title, errorMessage);
        }


    }
}