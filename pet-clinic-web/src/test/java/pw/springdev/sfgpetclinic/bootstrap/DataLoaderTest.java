package pw.springdev.sfgpetclinic.bootstrap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pw.springdev.sfgpetclinic.service.PetService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DataLoaderTest {

    @Autowired
    DataLoader dataLoader;

    @BeforeEach
    void setUp() {
        dataLoader.loadData();
    }

    @Test
    void loadData() {
        assertNotNull(new Object());
    }
}