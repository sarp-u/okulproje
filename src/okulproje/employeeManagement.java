
package okulproje;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class employeeManagement {
    private SimpleStringProperty name;
    private SimpleStringProperty surname;
    private SimpleStringProperty tcNo;
    private SimpleStringProperty phoneNo;
    private SimpleStringProperty mail;
    private SimpleStringProperty birthday;
    private SimpleStringProperty level;
    
    @SuppressWarnings("empty-statement")
    public employeeManagement(String name, String surname, String tcNo, String phoneNo, String mail, String birthday, String level){
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.tcNo = new SimpleStringProperty(tcNo);;
        this.phoneNo = new SimpleStringProperty(phoneNo);;
        this.mail = new SimpleStringProperty(mail);;
        this.birthday = new SimpleStringProperty(birthday);;
        this.level = new SimpleStringProperty(level);;
    }
    
    public String getName(){
        return name.get();
    }
    
    public void setName(String name){
        this.name = new SimpleStringProperty(name);
    }
    
    public String getSurname(){
        return surname.get();
    }
    
    public void setSurname(String surname){
        this.surname = new SimpleStringProperty(surname);
    }
    
    public String getTcNo(){
        return tcNo.get();
    }
    
    public void setTcNo(String tcNo){
        this.tcNo = new SimpleStringProperty(tcNo);
    }
    
    public String getPhoneNo(){
        return phoneNo.get();
    }
    
    public void setPhoneNo(String phoneNo){
        this.phoneNo = new SimpleStringProperty(phoneNo);
    }
    
    public String getMail(){
        return mail.get();
    }
    
    public void setMail(String mail){
        this.mail = new SimpleStringProperty(mail);
    }
    
    public String getBirthday(){
        return birthday.get();
    }
    
    public void setBirthday(String birthday){
        this.birthday = new SimpleStringProperty(birthday);
    }
    
    public String getLevel(){
        return level.get();
    }
    
    public void setLevel(String level){
        this.level = new SimpleStringProperty(level);
    }
    
    public StringProperty nameProperty(){
        return name;
    }
    
    public StringProperty surNameProperty(){
        return surname;
    }
    
    public StringProperty tcNoProperty(){
        return tcNo;
    }
    
    public StringProperty phoneNoProperty(){
        return phoneNo;
    }
    
    public StringProperty mailProperty(){
        return mail;
    }
    
    public StringProperty birthdayProperty(){
        return birthday;
    }
    
    public StringProperty levelProperty(){
        return level;
    }

}
