package dev.vvr.astrosentinel.service;

import dev.vvr.astrosentinel.models.TLEData;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
public class DataLoaderServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataLoaderServiceTest.class);

    @Autowired
    private DataLoaderService dataLoaderService;

    @Test
    public void testFileLoad() throws IOException {

        dataLoaderService.loadData();

        List<TLEData> tleData = dataLoaderService.getAll();

        for (TLEData data : tleData) {
            LOGGER.info(data.toString());
        }
    }
}
