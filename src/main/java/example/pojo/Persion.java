package example.pojo;

public class Persion {
    String name;
    String password;
    Persion(){
        this.name="小明";
        this.password="123";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
