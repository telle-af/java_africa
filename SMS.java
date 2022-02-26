import java.time.LocalDateTime;

public class SMS {

    private String msisdn;
    private String recipient;
    private String sender;
    private String shortCode;
    private String transactionID;
    private LocalDateTime timeStamp;
    private String promo;
    private String status;
    private String content;

    //SMS from subscriber to system
    public SMS(String msisdn, String recipient, String sender, String shortCode, String transactionID, LocalDateTime timeStamp, String promo, String content) {
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
        this.promo = promo;
        this.content = content;
    }

    //SMS from system to subscriber
    public SMS(String msisdn, String recipient, String sender, String transactionID, LocalDateTime timeStamp, String promo, String content) {
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
        this.promo = promo;
        this.content = content;
    }

    //for retrieval
    public SMS(String msisdn, String recipient, String sender, String shortCode, String transactionID, LocalDateTime timeStamp, String promo, String status, String content) {
        this.msisdn = msisdn;
        this.recipient = recipient;
        this.sender = sender;
        this.shortCode = shortCode;
        this.transactionID = transactionID;
        this.timeStamp = timeStamp;
        this.promo = promo;
        this.status = status;
        this.content = content;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
