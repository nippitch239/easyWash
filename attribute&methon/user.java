
public class user implements ID{
    private int id = 0;
    private  String password;
    private String username;
    private String phonenum;
    private boolean is_Admin;
    public user(String username , String password,String phonenum){
        this.username = username;
        this.password = password;
        this.phonenum = phonenum;
        id ++;
    }
    @Override
    public void register(String username , String password,String phonenum){
        //_________add all attribute to database(MYSQL)_________
        //_________next to gui user__________
    }
    @Override
    public void login(String username , String password){
        //_________Search username and password in database(MYSQL)_________
        //_________check password or username == admin if true {
        //_________attribute is_admin == true and next to admin_gui
        //_________next to gui user__________
    }
    @Override
    public void logout(){
        //_________back to login gui__________
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public boolean isIs_Admin() {
        return is_Admin;
    }

    public void setIs_Admin(boolean is_Admin) {
        this.is_Admin = is_Admin;
    }
    
}
