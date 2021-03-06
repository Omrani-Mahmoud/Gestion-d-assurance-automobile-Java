package Courtier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohamed
 */
public class ValidateFields {

    //Validation du mail
    public static boolean validateEmail(String email) {
        boolean status = false;
        String EMAIL_PATTERN
                = "^[_A-za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    //validation du tel et du CIN

    public static boolean validateCin(String tel) {
        boolean status = false;
        if ((tel.length() == 8)) {
            status = true;
        } else {
            status = false;
            JOptionPane.showMessageDialog(null, "Vérifier le longeur de votre CIN");
        }

        try {
            Integer.parseInt(tel);
            status = true;
        } catch (NumberFormatException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Vérifier votre CIN");
        }

        return status;
    }

    public static boolean validateTel(String tel) {
        boolean status = false;
        if ((tel.length() == 8)) {
            status = true;
        } else {
            status = false;
            JOptionPane.showMessageDialog(null, "Vérifier le longeur de votre numero du telephone");
        }

        try {
            Integer.parseInt(tel);
            status = true;
        } catch (NumberFormatException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Vérifier votre numéro!");
        }

        return status;
    }
    
    public static boolean validateNumber(String number){
        boolean status = false;
        try {
            Integer.parseInt(number);
            status = true;
        } catch (NumberFormatException e) {
            status = false;
            JOptionPane.showMessageDialog(null, "Entrer un nombre!");
        }

        return status;
    }
}
