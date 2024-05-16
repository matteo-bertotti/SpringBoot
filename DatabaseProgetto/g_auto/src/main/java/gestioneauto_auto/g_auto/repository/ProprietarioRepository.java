package gestioneauto_auto.g_auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestioneauto_auto.g_auto.entity.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Integer>{

}
