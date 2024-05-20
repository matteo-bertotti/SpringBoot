package gestioneauto_auto.g_auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import gestioneauto_auto.g_auto.entity.Proprietario;
import gestioneauto_auto.g_auto.service.ProprietarioService;
import jakarta.transaction.Transactional;

@RestController
public class ProprietarioController {
    @Autowired
    private ProprietarioService proprietarioService;

    @GetMapping("/")
    public String home() {
        return "Benvenuto in gestione auto";
    }

    @GetMapping("/getProprietari")
    public List<Proprietario> getProprietari() {
        return proprietarioService.getProprietari();
    }

    @GetMapping("/getProprietario/{id}")
    public Proprietario getProprietarioById(@PathVariable int id) {
        return proprietarioService.getProprietarioById(id);
    }

    @GetMapping("/getProprietarioByNome/{nome}")
    public Proprietario getProprietarioByNome(@PathVariable String nome) {
        return proprietarioService.getProprietarioByNome(nome);
    }

    @GetMapping("/getProprietarioByCognome/{cognome}")
    public Proprietario getProprietarioByCognome(@PathVariable String cognome) {
        return proprietarioService.getProprietarioByCognome(cognome);
    } 

    @GetMapping("/getProprietariByCognome/{cognome}")
    public List<Proprietario> getProprietariByCognome(@PathVariable String cognome) {
        return proprietarioService.getProprietariByCognome(cognome);
    }

    @Transactional
    @PostMapping("/addProprietario")
    public Proprietario addProprietario(@RequestBody Proprietario proprietario){
        return proprietarioService.saveProprietario(proprietario);
    }

    @Transactional
    @PostMapping("/addProprietari")
    public List<Proprietario> addProprietari(@RequestBody List<Proprietario> proprietari){
        return proprietarioService.saveProprietari(proprietari);
    }

    @Transactional
    @PutMapping("/updateProprietario")
    public Proprietario updateProprietario(@RequestBody Proprietario proprietario){
        return proprietarioService.updateProprietario(proprietario);
    }

    @Transactional
    @DeleteMapping("/deleteProprietario/{id}")
    public String deleteProprietario(@PathVariable int id){
        return proprietarioService.deleteProprietario(id);
    }
}
