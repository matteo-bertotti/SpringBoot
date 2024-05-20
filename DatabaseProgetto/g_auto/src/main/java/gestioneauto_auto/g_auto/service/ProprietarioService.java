package gestioneauto_auto.g_auto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneauto_auto.g_auto.entity.Proprietario;
import gestioneauto_auto.g_auto.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public List<Proprietario> getProprietari() {
        return proprietarioRepository.findAll();
    }

    public Proprietario getProprietarioById(int id) {
        return proprietarioRepository.findById(id).orElse(null);
    }

    public Proprietario getProprietarioByNome(String nome) {
        return proprietarioRepository.findByNome(nome);
    }

    public Proprietario getProprietarioByCognome(String cognome) {
        return proprietarioRepository.findByCognome(cognome);
    }

    public List<Proprietario> getProprietariByCognome(String cognome) {
        return proprietarioRepository.getproprietariByCognome(cognome);
    }

    public Proprietario saveProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public List<Proprietario> saveProprietari(List<Proprietario> proprietari) {
        return proprietarioRepository.saveAll(proprietari);
    }

    public Proprietario updateProprietario(Proprietario proprietario) {
        Proprietario ProprietarioMemorizzato = proprietarioRepository.findById(proprietario.getId()).orElse(null);
        ProprietarioMemorizzato.setNome(proprietario.getNome());
        ProprietarioMemorizzato.setCognome(proprietario.getCognome());
        ProprietarioMemorizzato.setTelefono(proprietario.getTelefono());
        return proprietarioRepository.save(ProprietarioMemorizzato);
    }

    public String deleteProprietario(int id) {
        proprietarioRepository.deleteById(id);
        return "Proprietario rimosso: " + id;
    }
}
