package br.com.sergiowink.gestao_vagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sergiowink.gestao_vagas.exceptions.UserNotFoundException;
import br.com.sergiowink.gestao_vagas.modules.candidate.dto.ProfileCandidateResponseDTO;
import br.com.sergiowink.gestao_vagas.modules.candidate.repositories.CandidateRepository;

@Service
public class ProfileCandidateuseCase {
    
    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate){
        var candidate = this.candidateRepository.findById(idCandidate).orElseThrow(() -> {
            throw new UserNotFoundException();
        });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
        .description(candidate.getDescription())
        .email(candidate.getEmail())
        .id(candidate.getId())
        .username(candidate.getUsername())
        .name(candidate.getName())
        .build();

        return candidateDTO;
    }
}
