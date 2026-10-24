package Hibernate;
import jakarta.persistence.*;

@Entity
@Table(name="banking")
public class Bank {
@Column(name= "name of the bank")
	    private String bankName;
@Id
	    private int accountno;
@Column(name="AccountHolder Name")
	    private String accountname;

	  
	     Bank(String a, int b, String c){
	        this.bankName = a;
	        this.accountno = b;
	        this.accountname = c;
	    }
	     public void setbankname(String a) {
	    	 this.bankName=a;
	     }
	
	     public void setaccountno(int b) {
	    	 this.accountno=b;
	     }
	     public void setaccountname(String c) {
	    	 this.accountname=c;
	     }
	     public String getbankname() {
	    	 return bankName;
	     }
	     public int getaccountno() {
	    	 return accountno;
	     }
	     public String getaccountname() {
	    	 return accountname;
	     }
	
	// 3 fileds
	// bankname-string
	//accountno-int
	//accountname-String
	//setters methods-3
	//getter-3
	//constructors-parameterized
//	Bank(String a, int b, String c){
		
	}