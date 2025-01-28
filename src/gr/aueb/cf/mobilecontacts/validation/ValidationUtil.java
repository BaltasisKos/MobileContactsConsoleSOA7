package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.model.MobileContact;

public class ValidationUtil {
    /**
     * No instances of this class should be available.
     */

    private ValidationUtil() {

    }

    public  static  String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";

        if (insertDTO.getPhoneNumber().length() <= 5 )
            errorResponse += "Ο Τηλ. Αριθμός πρέπει να έχει περισσότερα απο πέντε σύμβολα.\n";
        if (insertDTO.getFirstname().length() < 2)
            errorResponse += "Το όνομα πρεπει να περιέχει δύο οι περισσότερους χαρακτήρες.\n";

        if (insertDTO.getLastname().length() <2 )
            errorResponse += "Το επώνυμο πρεπει να περιέχει δύο οι περισσόιτερους χαρακτήρες.\n";

        return errorResponse;
    }

    public  static  String updateDTO(MobileContactInsertDTO updateDTO) {
        String errorResponse = "";

        if (updateDTO.getPhoneNumber().length() <= 5 )
            errorResponse += "Ο Τηλ. Αριθμός πρέπει να έχει περισσότερα απο πέντε σύμβολα.\n";
        if (updateDTO.getFirstname().length() < 2)
            errorResponse += "Το όνομα πρεπει να περιέχει δύο οι περισσότερους χαρακτήρες.\n";

        if (updateDTO.getLastname().length() <2 )
            errorResponse += "Το επώνυμο πρεπει να περιέχει δύο οι περισσόιτερους χαρακτήρες.\n";

        return errorResponse;
    }
}
