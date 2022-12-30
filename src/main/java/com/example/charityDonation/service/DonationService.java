package com.example.charityDonation.service;

import com.example.charityDonation.repository.DonationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DonationService {

    private final DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Integer quantityOfAllBags() {
        try {
            return donationRepository.quantityOfAllBags();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public Integer sumOfAllDonations() {
        try {
            return donationRepository.sumOfAllDonations();
        } catch (NullPointerException e) {
            return 0;
        }
    }
}