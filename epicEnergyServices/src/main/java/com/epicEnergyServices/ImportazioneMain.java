package com.epicEnergyServices;

import com.epicEnergyServices.service.ImportazioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ImportazioneMain implements CommandLineRunner {

    @Autowired
    private ImportazioneService importazioneService;

    @Override
    public void run(String... args) throws Exception {
        importazioneService.importaProvince("C:/csv/province-italiane.csv");
        importazioneService.importaComuni("C:/csv/comuni-italiani.csv");
        System.out.println("Importazione completata!");
    }
}