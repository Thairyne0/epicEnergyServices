package com.epicEnergyServices.service;

import com.epicEnergyServices.entity.Comune;
import com.epicEnergyServices.entity.Provincia;
import com.epicEnergyServices.repository.ComuneRepository;
import com.epicEnergyServices.repository.ProvinciaRepository;
import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.FileReader;
import java.util.Arrays;

@Service
public class ImportazioneService {

    @Autowired
    private ProvinciaRepository provinciaRepository;

    @Autowired
    private ComuneRepository comuneRepository;

    @Transactional
    public void importaProvince(String filePath) throws Exception {
        // Imposta il parser con il delimitatore corretto
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(';')
                .build();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(filePath))
                .withCSVParser(parser)
                .build()) {

            String[] line;
            reader.readNext(); // Salta l'intestazione
            while ((line = reader.readNext()) != null) {
                if (line.length < 3) {
                    System.err.println("Riga non valida nel file Province: " + Arrays.toString(line));
                    continue; // Salta questa riga
                }
                Provincia provincia = new Provincia(null, line[0], line[1], line[2]);
                provinciaRepository.save(provincia);
            }
        }
    }@Transactional
    public void importaComuni(String filePath) throws Exception {
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(';')
                .build();

        try (CSVReader reader = new CSVReaderBuilder(new FileReader(filePath))
                .withCSVParser(parser)
                .build()) {

            String[] line;
            reader.readNext(); // Salta l'intestazione
            while ((line = reader.readNext()) != null) {
                if (line.length < 4) {
                    System.err.println("Riga non valida nel file Comuni: " + Arrays.toString(line));
                    continue; // Salta questa riga
                }
                Comune comune = new Comune(null, line[0], line[1], line[2], line[3]);
                comuneRepository.save(comune);
            }
        }
    }
}