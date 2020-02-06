package BankingProject;

public class Validation {

    /**
     * Used for Check validation in phone number, email and id proof
     * @param input data of phone number, email, idProof
     * @param type type for phone number, email, idProof
     * @return
     */
    public boolean checkValidation(String input,int type) {
        switch(type) {
            case Constants.PHONE_NUMBER:
                if (input.length()>=10 && input.length()<=14) return true;

            case Constants.EMAIL:

                String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
                java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
                java.util.regex.Matcher m = p.matcher(input);
                return m.matches();

            case Constants.ID_PROOF:

            default:return false;

        }
    }

//	public boolean checkValidation(String date, String month, String year) {
//		return false;
//	}
}
