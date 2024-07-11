package com.freeMarker.Cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class QueryService {

    @Autowired
    private ResourceLoader resourceLoader;

    public String loadQuery(String queryFile) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:sql/" + queryFile);
        return new String(Files.readAllBytes(Paths.get(resource.getURI())));
    }
}
