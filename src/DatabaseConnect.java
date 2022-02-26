import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnect implements ManagingSMS {
    final private static Logger logger = Logger.getLogger(DatabaseConnect.class.getName());
    private static Connection con = null;

    public static void main(String[] args) throws FileNotFoundException {
        DatabaseConnect.connect();

        String[] names = new String[]{"Hendricks, Richard", "Dunn, Jared", "Stark, Tony", "Smith, Chris",
                "Waldorf, Blair", "Doe, Jane", "Doe, John", "Djarin, Din", "Diaz, Juan", "Winger, Jeff",
                "Hawthorne, Pierce", "Revan, Darth"};

        for (int i=0; i<8; i++){
            int min = 1000;
            int max = 9999;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            String randomMsisdn = "0917780"+ String.valueOf(random_int);
            String randomTransactionID = "000000"+ String.valueOf(random_int);
            String subscriber = names[i];

            SMS smsgenerator = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "REGISTER");
            DatabaseConnect.insertSMS(smsgenerator);
            SMS smsgenerator2 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "To complete the promo registration, please send Lastname, Firstname to 8888");
            DatabaseConnect.insertSMS(smsgenerator2);
            SMS smsgenerator3 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", subscriber);
            DatabaseConnect.insertSMS(smsgenerator3);
            SMS smsgenerator4 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "Registration complete! Send PROMO to 8888 to receive the voucher.");
            DatabaseConnect.insertSMS(smsgenerator4);
            SMS smsgenerator5 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "PROMO");
            DatabaseConnect.insertSMS(smsgenerator5);
        }

        for (int i=0; i<8; i++) {
            int min = 1000;
            int max = 9999;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            String randomMsisdn = "0917780" + String.valueOf(random_int);
            String randomTransactionID = "000000" + String.valueOf(random_int);
            String subscriber = names[i];

            SMS smsgenerator = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "REGISTER");
            DatabaseConnect.insertSMS(smsgenerator);
            SMS smsgenerator2 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "To complete the promo registration, please send Lastname, Firstname to 8888");
            DatabaseConnect.insertSMS(smsgenerator2);
            SMS smsgenerator3 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", subscriber);
            DatabaseConnect.insertSMS(smsgenerator3);
            SMS smsgenerator4 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "Registration complete! Send PROMO to 8888 to receive the voucher.");
            DatabaseConnect.insertSMS(smsgenerator4);
            SMS smsgenerator5 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Piso Pizza", "PROMO");
            DatabaseConnect.insertSMS(smsgenerator5);
        }

        for (int i=8; i<10; i++) {
            int min = 1000;
            int max = 9999;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            String randomMsisdn = "0917780" + String.valueOf(random_int);
            String randomTransactionID = "000000" + String.valueOf(random_int);
            String subscriber = names[i];

            SMS smsgenerator = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Data Bonus", "GETDATA");
            DatabaseConnect.insertSMS(smsgenerator);
            SMS smsgenerator2 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Data Bonus", "To complete the promo registration, please send Lastname, Firstname to 8888");
            DatabaseConnect.insertSMS(smsgenerator2);
            SMS smsgenerator3 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Data Bonus", subscriber);
            DatabaseConnect.insertSMS(smsgenerator3);
            SMS smsgenerator4 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Data Bonus", "Registration complete! Send START to 8888 to receive your data allocation.");
            DatabaseConnect.insertSMS(smsgenerator4);
            SMS smsgenerator5 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Data Bonus", "START");
            DatabaseConnect.insertSMS(smsgenerator5);
        }

        for (int i=10; i<12; i++) {
            int min = 1000;
            int max = 9999;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            String randomMsisdn = "0917780" + String.valueOf(random_int);
            String randomTransactionID = "000000" + String.valueOf(random_int);
            String subscriber = names[i];

            SMS smsgenerator = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Free Voucher", "REG");
            DatabaseConnect.insertSMS(smsgenerator);
            SMS smsgenerator2 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Free Voucher", "To complete the promo registration, please send Lastname, Firstname to 8888");
            DatabaseConnect.insertSMS(smsgenerator2);
            SMS smsgenerator3 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Free Voucher", subscriber);
            DatabaseConnect.insertSMS(smsgenerator3);
            SMS smsgenerator4 = new SMS(randomMsisdn, subscriber, "System", randomTransactionID, LocalDateTime.now(),
                    "Free Voucher", "Registration complete! Send GET to 8888 to receive your voucher.");
            DatabaseConnect.insertSMS(smsgenerator4);
            SMS smsgenerator5 = new SMS(randomMsisdn, "System", subscriber, "8888", randomTransactionID, LocalDateTime.now(),
                    "Free Voucher", "GET");
            DatabaseConnect.insertSMS(smsgenerator5);
        }



//IGNORE THIS SECTION
        // ===========================================================================================================
/*        SMS sms1 = new SMS("639999999999", "System", "Subscriber1", "8888",
                "0000001010", LocalDateTime.now(), "Piso Pizza", "Piso Pizza Register");

        DatabaseConnect.insertSMS(sms1);
        SMS sms2 = new SMS("63980765980", "System", "Subscriber2", "8888",
                "0000001014", LocalDateTime.of(2022, 1, 5, 7, 55, 00, 12), "Piso Pizza", "Piso Pizza Register");

        DatabaseConnect.insertSMS(sms2);

        SMS sms3 = new SMS("639999268999", "System", "Subscriber3", "8888",
                "000006510", LocalDateTime.of(2022, 1, 10, 11,11,11,11), "Data Bonus", "DB Register");

        DatabaseConnect.insertSMS(sms3);

        SMS sms4 = new SMS("639999268999", "Subscriber3", "System", "000006510",
                LocalDateTime.of(2022, 1, 10, 11, 12, 0, 44), "Data Bonus", "Reply Yes To Avail");

        DatabaseConnect.insertSMS(sms4);

        SMS sms5 = new SMS("639999991129", "System", "Subscriber1", "8888",
                "00097801010", LocalDateTime.now(), "Free Voucher", "Get Free Voucher");

        DatabaseConnect.insertSMS(sms5);

        SMS sms6 = new SMS("639999991129", "Subscriber1", "System", "00097801010",
                LocalDateTime.now(), "Free Voucher", "Type Your Name To Avail");

        DatabaseConnect.insertSMS(sms6);*/
        // ===========================================================================================================

        Promo promo2 = new Promo("Data Bonus", "Get 1GB Data Free Every 1st of the month!", "8888",
                LocalDateTime.of(2021, Month.JUNE, 1, 00, 00), LocalDateTime.of(2022,
                Month.JUNE, 30, 23, 59));

        DatabaseConnect.insertPromo(promo2);

        Promo promo3 = new Promo("Free Voucher", "Get free Shopee shipping vouchers", "8888",
                LocalDateTime.of(2021, Month.NOVEMBER, 11, 01, 00), LocalDateTime.of(2022,
                Month.NOVEMBER, 11, 23, 59));

        DatabaseConnect.insertPromo(promo3);

        Promo promo1 = new Promo("Piso Pizza", "Get a 16-inch pizza for 1 peso!", "8888",
                LocalDateTime.of(2021, Month.FEBRUARY, 1, 10, 00), LocalDateTime.of(2021,
                Month.JUNE, 30, 23, 59));

        DatabaseConnect.insertPromo(promo1);

        // Testing the methods
        DatabaseConnect.retrieveByDate("2022-01-01 00:01:01", "2022-02-02 23:59:59");
        DatabaseConnect.retrieveByCode("Data Bonus");
        DatabaseConnect.retrieveSentSMS();
        DatabaseConnect.retrieveReceivedSMS();
        String[] array1 = new String[]{"639999991129", "'639999268999'"};
        DatabaseConnect.retrieveMultiMSISDN(array1);

//IGNORE
 /*                     for(String record: data){
            logger.info("Record : " + record);
        }*/

        DatabaseConnect.disconnect();
    }

    public static void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sms_db2?useTimezone=true&serverTimezone=UTC", "root", ""
            );
            logger.info("Database Connected");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Database Not Connected", e);
        }
    }

    public static void disconnect() {
        try {
            if (con != null) {
                con.close();
                logger.info("Database Disconnected");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Database Not Connected", e);
        }
    }



    public static void insertSMS(SMS sms) {
        String insertSMS = "INSERT INTO sms_db2.smstable " + "(msisdn, recipient, sender, shortCode, transactionID, " +
                "timeStamp, promo, status)  values ( '" + sms.getMsisdn() + "', '" + sms.getRecipient() + "', '" + sms.getSender() +
                "', '" + sms.getShortCode() + "', '" + sms.getTransactionID() + "', '" + sms.getTimeStamp() + "', '" + sms.getPromo() +
                "', '" + sms.getStatus() + "')";

        Statement statement = null;
        int result = 0;


        try {
            statement = con.createStatement();
            result = statement.executeUpdate(insertSMS);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "SQLException", e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "ERROR IN CLOSING", e);
            }
        }

        logger.log(Level.INFO, "Inserted : {0}", result);
    }


    public static ArrayList<SMS> retrieveByDate(String startDate, String endDate) {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT * FROM sms_db2.smstable WHERE timeStamp BETWEEN '" + startDate + "' AND '" + endDate + "' ";

        return filterSMS(filteredList, selectQuery);

    }

    //retriever
    private static ArrayList<SMS> filterSMS(ArrayList<SMS> filteredList, String selectQuery) {

        Statement statement = null;
        ResultSet resultSet = null; //where we will store the data
        SMS entry;

        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                entry = new SMS(
                        resultSet.getString("msisdn"),
                        resultSet.getString("recipient"),
                        resultSet.getString("sender"),
                        resultSet.getString("shortCode"),
                        resultSet.getString("transactionID"),
                        LocalDateTime.parse(resultSet.getString("timeStamp"), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                        resultSet.getString("promo"),
                        resultSet.getString("status"),
                        resultSet.getString("content")
                );
                filteredList.add(entry);

                logger.log(Level.INFO, entry.toString());
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "SQLException: ", e);

        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (Exception e) {
                logger.log(Level.SEVERE, "ERROR IN CLOSING: ", e);
            }
        }
        logger.log(Level.INFO, "Retrieved : {0}", filteredList);


        return filteredList;
    }


    public static ArrayList<SMS> retrieveByCode(String promo) {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT * FROM sms_db2.smstable WHERE promo = '" + promo + "'";

        return filterSMS(filteredList, selectQuery);
    }


    public static ArrayList<SMS> retrieveByMSISDN(String msisdn) {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT * FROM sms_db2.smstable " +
                "WHERE msisdn = '" + msisdn + "' ";

        return filterSMS(filteredList, selectQuery);
    }


    public static ArrayList<SMS> retrieveSentSMS() {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT * FROM sms_db2.smstable WHERE sender = 'System'";

        return filterSMS(filteredList, selectQuery);
    }


    public static ArrayList<SMS> retrieveReceivedSMS() {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT * FROM sms_db2.smstable WHERE recipient = 'System'";

        return filterSMS(filteredList, selectQuery);

    }

    public static ArrayList<SMS> retrieveJoiners() {
        ArrayList<SMS> filteredList = new ArrayList<>();

        String selectQuery = "SELECT sender FROM sms_db2.smstable WHERE promo = 'Piso Pizza'";

        return filterSMS(filteredList, selectQuery);

    }


    public static ArrayList<SMS> retrieveMultiMSISDN(String[] listMsisdn) {
        ArrayList<SMS> filteredList = new ArrayList<>();

        for (String msisdn : listMsisdn) {
            String selectQuery = "SELECT * FROM sms_db2.smstable WHERE msisdn = '" + msisdn + "'";
            return filterSMS(filteredList, selectQuery);

        }
        return filteredList;
    }


        public static void insertPromo(Promo promo) {
            String insertPromoQuery = "INSERT INTO sms_db2.promotable " + "(promoCode, details, shortCode, startDate, endDate)" +
                    "  values ( '" + promo.getPromoCode() + "', '" + promo.getDetails() + "', '" + promo.getShortCode() +
                    "', '" + promo.getStartDate() + "', '" + promo.getEndDate() + "' )";

            Statement statement = null;
            int result = 0;

            try {
                statement = con.createStatement();
                result = statement.executeUpdate(insertPromoQuery);
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "SQLException", e);
            } finally {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "ERROR IN CLOSING", e);
                }
            }

            logger.log(Level.INFO, "Inserted : {0}", result);
        }


}
