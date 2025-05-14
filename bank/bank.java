package bank;


class Account{
    public String name;
    private String email;
    public String getemail(){
        return this.email;

    }
    public void  setemail(String em){
        this.email=em;
    }

}



public class bank {
    public static void main(String[] args) {
        Account account= new Account();
        account.name="Hrishabh";
        account.setemail("abc@gmail.com");
        System.out.println(account.getemail());
    }
    
}
