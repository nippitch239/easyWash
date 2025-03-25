
public class Service {
    private String name;
    private Double price;
    private int time;
    public Service(){
        this("", 0.0, 0);
    }
    public Service(String name, Double price,int time){
        this.name = name;
        this.price = price;
        this.time = time;
                
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
}
