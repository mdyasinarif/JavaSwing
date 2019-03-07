/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.pojo;

/**
 *
 * @author User
 */
public class User {
    private int id;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String modile;
    private Role role;

    public User() {
    }

    public User(String name, String userName, String password, String email, String modile, Role role) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.modile = modile;
        this.role = role;
    }

    public User(int id, String name, String userName, String password, String email, String modile, Role role) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.modile = modile;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModile() {
        return modile;
    }

    public void setModile(String modile) {
        this.modile = modile;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
    
    
}
