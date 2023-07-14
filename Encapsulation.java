package oopsdemo;

public class Encapsulation {
    private String accName;
    private String email;
    private String address;
    private long accnumber;
    private float amount;
    public String getAccName(){
    return accName;
    }
    public void setAccName(String accName){
        this.accName = accName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public long getAccnumber(){
        return accnumber;
    }
    public void setAccnumber(long accnumber){
        this.accnumber = accnumber;
    }
    public float getAmount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }

    public static void main(String[] args) {
        Encapsulation object = new Encapsulation();
        object.setAccName("Seema");
        object.setEmail("&quot;abc@gmail.com");
        object.setAddress("Mumbai");
        object.setAccnumber(123456789l);
        object.setAmount(50000);
        System.out.println(object.getAccName()+" "+object.getAddress()+" "+object.getEmail()+" "+object.getAccnumber()+" "+object.getAmount());
    }
}
