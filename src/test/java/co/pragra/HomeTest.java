package co.pragra;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class HomeTest {

    @BeforeAll
    public static void setup(){
        System.out.println("Setting up application");
    }

    @Test
    @DisplayName("Checking Equality")
    public void tc1() {
       assertEquals("1","1");
    }

    @Nested
    @DisplayName("When someone logins")
    class Login {
        Guest guest = GuestSupplier.getGuestSupplier().get();
        @Test
        @DisplayName("then user should be able to login")
        public void tc1() {
            System.out.println("TC1");
        }
        @Test
        @DisplayName("And Should be able to click the dashboard home")
        public void tc2() {
            System.out.println("TC2");
        }

        @Test
        @DisplayName("Compare guest")
        public void tc3() {
            assertAll("guest",
                    ()->assertEquals("Atin", guest.getName()),
                    ()->assertEquals("Mississauga", guest.getAddress()),
                    ()->assertEquals(1, guest.getGuestId())
            );

        }
    }
}
