/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandregister;

/**
 *
 * @author Claire
 */
public class UserAccount {
    private String username;
    private String password;
    private String employeeID;
    
    public UserAccount() {}
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public String getEmployeeID() {
        return this.employeeID;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String pw) {
        this.password = pw;
    }
    
    public void setEmployeeID(String id) {
        this.employeeID = id;
    }
    
}
