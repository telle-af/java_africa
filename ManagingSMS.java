import java.util.ArrayList;

public interface ManagingSMS {
    static void insertSMS(SMS sms) {

    }

    static ArrayList<SMS> retrieveByDate(String startDate, String endDate) {
        return null;
    }

    static ArrayList<SMS> retrieveByCode(String promoCode) {
        return null;
    }

    static ArrayList<SMS> retrieveByMSISDN(String msisdn) {
        return null;
    }

    static ArrayList<SMS> retrieveSentSMS() {
        return null;
    }

    static ArrayList<SMS> retrieveReceivedSMS() {
        return null;
    }

    static ArrayList<SMS> retrieveMultiMSISDN(String[] listMsisdn) {
        return null;
    }
}
