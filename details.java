package assignment;

public class details {
	    private int No;
	    private String Holder;
	    private int Pin;
	    private int Balance;

	    public details(int accNo, String accountHolder, int pin, int accountBalance) {
	No = accNo;
	       Holder = accountHolder;
	        Pin = pin;
	       Balance = accountBalance;
	    }

	    public int getNo() {
	        return No;
	    }

	    public void setNo(int accNo) {
	        No = accNo;
	    }

	    public String getHolder() {
	        return Holder;
	    }

	    public void setHolder(String accountHolder) {
	       Holder = accountHolder;
	 }

	    public int getPin() {
	        return Pin;
	    }

	    public void setPin(int pin) {
	        Pin = pin;
	    }

	    public int getBalance() {
	        return Balance;
	    }

	    public void setBalance(int accountBalance) {
	       Balance = accountBalance;
	    }

	    @Override
	    public String toString() {
	  return "CustomerDetails"{ "AccNo=" +No +  ", AccountHolder='" + Holder + '\'' + ", Pin=" + Pin +  ", AccountBalance=" + Balance +
	      };
	    }
	}

