import java.util.Date;

/**
 * This is the credit card class
 */
 class CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private double balance;

    public CreditCard(String cardNumber, String expirationDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void makePurchase(double amount) {
        balance += amount;
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", balance=" + balance +
                '}';
    }
}

/**
 * This is the transaction class
 */
 class Transaction {
    private String transactionId;
    private String merchantName;
    private double amount;

    public Transaction(String transactionId, String merchantName, double amount) {
        this.transactionId = transactionId;
        this.merchantName = merchantName;
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", amount=" + amount +
                '}';
    }
}

/**
 * This is the customer class
 */
class Customer {
    private String customerId;
    private String firstName;
    private String lastName;

    public Customer(String customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}


/**
 * This is the merchant class
 */
class Merchant {
  private int merchantId;
  private String name;

  public Merchant(int merchantId, String name) {
      this.merchantId = merchantId;
      this.name = name;
  }

  public int getMerchantId() {
      return merchantId;
  }

  public void setMerchantId(int merchantId) {
      this.merchantId = merchantId;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  @Override
  public String toString() {
      return "Merchant{" +
              "merchantId=" + merchantId +
              ", name='" + name + '\'' +
              '}';
  }
}


/**This is the bank class */
class Bank {
  private int bankCode;
  private String bankName;

  public Bank(int bankCode, String bankName) {
      this.bankCode = bankCode;
      this.bankName = bankName;
  }

  public int getBankCode() {
      return bankCode;
  }

  public void setBankCode(int bankCode) {
      this.bankCode = bankCode;
  }

  public String getBankName() {
      return bankName;
  }

  public void setBankName(String bankName) {
      this.bankName = bankName;
  }

  @Override
  public String toString() {
      return "Bank{" +
              "bankCode=" + bankCode +
              ", bankName='" + bankName + '\'' +
              '}';
  }
}


public class VisaCard
{
    public static void main(String[] args)
    {
CreditCard myCard = new CreditCard("1234 5678 9012 3456", "12/24", "123", 1000.0);

Transaction myTransaction = new Transaction("123456", "Amazon", 50.0);

Customer myCustomer = new Customer("123", "John", "Doe");

Merchant myMerchant = new Merchant(1, "Amazon");

Bank myBank = new Bank(1, "Chase");

    }
}
