
import java.util.ArrayList;

public class list_Service {
    private ArrayList list_service;
    public list_Service(){
        list_service = new ArrayList<Service>();
        Service service = new Service();
        service.setName("");
        service.setPrice(0.0);
        service.setTime(0);
        list_service.add(service);
    }
    public void AddService(Service service){
        list_service.add(service);  
    }
    public int getNumItem(){
        return list_service.size();
    }
    public Service getInfoService(int index){
        return (Service) list_service.get(index);
    }
    public void DeleteService(Service i){
        list_service.remove(i);
    }
    public ArrayList<Service> getService() {
        return list_service;
    }   
}
