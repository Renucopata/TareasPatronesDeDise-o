package PracticaTercerParcial.Proxy;

public class User {
    private String name;
    private String pwd;

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public void showInfoUser(){
        System.out.println("Usuario: " + getName());
        System.out.println("Password: " + getPwd());
    }
}
