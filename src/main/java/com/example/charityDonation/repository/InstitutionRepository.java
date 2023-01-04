package com.example.charityDonation.repository;

import com.example.charityDonation.domain.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution,Long> {

}
