
public abstract class Booking implements book_Interface{
    private static int bookingId = 1;
    private int serviceId;
    private String image;//i dont what is datatype should be
    private boolean status;
    private  user userId;
    private String date;//i dont what is datatype should be
    public Booking(user userId,String image,String date){
        this.userId = userId;
        this.image = image;
        this.date = date;
        bookingId ++;
    }

    public static int getBookingId() {
        return bookingId;
    }

    public static void setBookingId(int bookingId) {
        Booking.bookingId = bookingId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public user getUserId() {
        return userId;
    }

    public void setUserId(user userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
