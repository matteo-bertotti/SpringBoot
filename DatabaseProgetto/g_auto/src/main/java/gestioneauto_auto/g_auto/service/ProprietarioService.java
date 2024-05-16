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
}
