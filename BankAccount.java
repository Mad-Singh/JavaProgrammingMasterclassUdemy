public class BankAccount {
  
    private long accountNum;
    private int balance;
    private long phoneNum;
    private String name;
    private String email;
    
    
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public long getPhoneNum(){
        return this.phoneNum;
    }
    public int getBalance(){
        return this.balance;
    }
    public long getAccountNum(){
        return this.accountNum;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email =email;
    }
    public void setPhoneNum(long phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setAccountNum(long accountNum){
        this.accountNum = accountNum;
    }
    
    public int depositFunds(int fundsToDeposit){
        this.balance = this.balance + fundsToDeposit;
        return this.balance;
    }
    public int withdrawFunds(int fundsToWithdraw){
        if( fundsToWithdraw > this.balance){
            return 0;
        }
        else{
            this.balance = this.balance + fundsToWithdraw;
            return this.balance;
        }
    }
}
