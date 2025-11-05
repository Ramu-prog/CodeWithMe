package BasicOops_ConceptofObject;

public class Bank {
    String country;
    String name;
    String accountType;
    int accountNum;

//Empty constructor is present if there is no constructor
    Bank(String country,String name,String accounttype,int accountnum){
        this.country=country;
        this. name=name;
        this. accountType=accounttype;
        this. accountNum=accountnum;
        //System.out.println("Well done enpty constructor");
    }
    public void getBankDetails(){
        System.out.println("Country of is bank is:"+ country);
        System.out.println("Name of bank is:"+name);
        System.out.println("User account type is:"+accountType);
        System.out.println("Name of bank is:"+accountNum);
    }

}
