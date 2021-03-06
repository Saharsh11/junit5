package co.pragra;

import java.util.function.Supplier;

public class GuestSupplier {
    private static Supplier<Guest> guestSupplier;

    public static Supplier<Guest> getGuestSupplier() {
        Guest guest = new Guest(1,"Atin","Mississauga");
        return ()->guest;
    }
}
