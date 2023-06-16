/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */

public class Validator {

    // checking name when user input
    public static void checkName(JTextField field, StringBuilder stringBuilder) {
        // create variable validate for update status
        boolean isValidate = true;
        if (!checkEmpty(field, stringBuilder, "Name is not empty!")) {
            return;
        }
        try {
            String name = field.getText();
            Pattern pattern = Pattern.compile("[/\\\\.!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher matcher = pattern.matcher(name);
            boolean isSpecial = matcher.find();
            // for special characters
            if (isSpecial) {
                stringBuilder.append("Name does not contain special characters!\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            isValidate = false;
        }
        if (isValidate) {
            field.setBackground(Color.white);
        }
    }

    public static boolean checkId(JTextField field, StringBuilder stringBuilder) {
        // create variable validate for update status
        boolean isValidate = true;
        if (!checkEmpty(field, stringBuilder, "Id is not empty!")) {
            return false;
        }
        try {
            String id = field.getText();
            Pattern pattern = Pattern.compile("[/\\\\.!@#$%&*()_+=|<>?{}\\[\\]~-]");
            Matcher matcher = pattern.matcher(id);
            boolean isSpecial = matcher.find();
            // for special characters
            if (isSpecial) {
                stringBuilder.append("Id does not contain special characters!\n");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            isValidate = false;
        }
        if(isValidate){
            field.setBackground(Color.white);
        }
        return isValidate;
    }
    
    public static boolean checkPrice(JTextField field, StringBuilder stringBuilder) {
        // create variable validate for update status
        boolean isValidate = true;
        if (!checkEmpty(field, stringBuilder, "Price is not empty!")) {
            return false;
        }
        return isValidate;
    }
    
        public static boolean checkEmpty(JTextField field, StringBuilder stringBuilder, String message) {
        boolean isValidate = true;
        if (field.getText().equals("")) {
            stringBuilder.append(message).append("\n");
            field.setBackground(Color.pink);
            isValidate = false;
        } else {
            field.setBackground(Color.white);
        }
        return isValidate;
    }
}
