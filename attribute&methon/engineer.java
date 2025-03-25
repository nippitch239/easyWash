
public class engineer {
    private int engineerId;
    private String engname;
    private String engphonenum;
    public engineer(String engname,String engphonenum){
        this.engname = engname;
        this.engphonenum = engphonenum;
        engineerId++;
    }

    public int getEngineerId() {
        return engineerId;
    }

    public void setEngineerId(int engineerId) {
        this.engineerId = engineerId;
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname;
    }

    public String getEngphonenum() {
        return engphonenum;
    }

    public void setEngphonenum(String engphonenum) {
        this.engphonenum = engphonenum;
    }
    
}
