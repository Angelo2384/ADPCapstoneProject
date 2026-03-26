package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Learner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LearnerFactoryTest {
    @Test
    @Order(1)
    public void testCreateLearner(){
        Learner learner = LearnerFactory.createLearner(
                "UT01",
                "ZA22145750",
                "Manual",
                LocalDate.of(2025,2,25),
                "U001"

        );
        assertNotNull(learner);

    }

    @Test
    @Order(2)
    public void testCreateLearnerWithEmptyLearnerNumber(){
        Learner learner= LearnerFactory.createLearner(
                "UT01",
                "",
                "Manual",
                LocalDate.of(2025,2,25),
                "U001"
                );
        assertNotNull(learner);
    }
}
