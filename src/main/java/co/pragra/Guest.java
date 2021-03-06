package co.pragra;

public class Guest {
    private int guestId;
    private String name;
    private String address;

    public Guest() {
    }

    public Guest(int guestId, String name, String address) {
        this.guestId = guestId;
        this.name = name;
        this.address = address;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
