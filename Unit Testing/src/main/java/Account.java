public class Account {
    private String name,password;

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int setName(String name) {
        if(name == ""){
            return 0;
        }
        else {
            this.name = name;
            return 1;
        }
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        if(password.length() < 6)
        {
            throw  new  IllegalArgumentException(" Must be 6 characters. ");
        }
        else {
            this.password = password;
        }
    }
}
