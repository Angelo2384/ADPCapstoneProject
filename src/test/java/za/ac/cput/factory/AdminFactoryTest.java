package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Admin;

import static org.junit.jupiter.api.Assertions.assertNotNull;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminFactoryTest {
    @Test
    @Order(1)
    public void testCreateAdmin(){
        Admin admin = AdminFactory.createAdmin(
                "UA01",
                "Marketing Department",
                2,
                "U001"
        );
        assertNotNull(admin);
    }

    @Test
    @Order(2)
    public void testCreateAdminWithEmptyDepartment(){
     Admin admin = AdminFactory.createAdmin(
             "UA01",
             "",
             2,
             "U001"
     );
     assertNotNull(admin);

    }
}
