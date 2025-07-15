/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasproject1;

/**
 *
 * @author LENOVO
 */
public class Userreg {
     private String Username;
    private String Password;
    
    public Userreg (String username, String password) {
        this.Username = username;
        this.Password = password;
    }
    
    public boolean login (String inputUser, String inputPass) {
        return this.Username.equals(inputUser) && this.Password.equals(inputPass);
        
    }
            public String getUsername() {
                return Username;
            }
            public String getPassword() {
                return Password;
            }      
    
}

