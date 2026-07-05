package dev.vvr.astrosentinel.service;

import dev.vvr.astrosentinel.models.TLEData;
import jakarta.annotation.PostConstruct;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataLoaderService {
    @Autowired
    private ObjectMapper objectMapper;
    @Value("${app.data.gp-file}")
    private String filePath;

    private List<TLEData> tleData = new ArrayList<>();
    @PostConstruct
    public void loadData() throws IOException {

        ClassPathResource resource = new ClassPathResource(filePath);
        tleData = objectMapper.readValue(
                resource.getInputStream(),
                new TypeReference<List<TLEData>>() {});
    }

    public List<TLEData> getAll() {
        return Collections.unmodifiableList(tleData);
    }
}
