package gestioneauto_auto.g_auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import gestioneauto_auto.g_auto.entity.Proprietario;
import gestioneauto_auto.g_auto.service.ProprietarioService;

@RestController
public class ProprietarioController {
    @Autowired
    private ProprietarioService proprietarioService;

    @GetMapping("/getProprietari")
    public List<Proprietario> getProprietari() {
        return proprietarioService.getProprietari();
    }

    @GetMapping("/getProprietario/{id}")
    public Proprietario getProprietarioById(int id) {
        return proprietarioService.getProprietarioById(id);
    }

}
