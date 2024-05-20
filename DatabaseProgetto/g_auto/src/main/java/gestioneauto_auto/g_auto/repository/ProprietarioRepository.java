package gestioneauto_auto.g_auto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gestioneauto_auto.g_auto.entity.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer>{

    // Metodi gia presenti in JpaRepository
    public Proprietario findByNome(String nome);

    public Proprietario findByCognome(String cognome);

    // Query personalizzate
    @Query(value = "SELECT * FROM Proprietario p WHERE p.cognome = :cognome", nativeQuery = true)   // :cognome è unparametro e viene letto con @Param("cognome")
    public List<Proprietario> getproprietariByCognome(@Param("cognome")String cognome);

    
}
