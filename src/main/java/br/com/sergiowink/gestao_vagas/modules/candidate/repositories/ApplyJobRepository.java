package br.com.sergiowink.gestao_vagas.modules.candidate.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sergiowink.gestao_vagas.modules.candidate.entity.ApplyJobEntity;



public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID> {

}