/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasproject1;

public class admin1 {
private final String Username;
private final String Password;

    public admin1 (java.lang.String Username, java.lang.String Password) {
        this.Username = Username;
        this.Password = Password;
    }    
    public String getRole () {
        return  "Administator";
    }

    boolean login(String inputUser, String inputPass) {
        return Username.equals(inputUser) && Password.equals(inputPass);
    }
}