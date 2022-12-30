package com.example.charityDonation.repository;

import com.example.charityDonation.domain.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface  DonationRepository extends JpaRepository<Donation,Long> {
    @Query("SELECT sum (d.quantity)from Donation d")
    Integer quantityOfAllBags();
    @Query("Select count(*) from Donation")
    Integer sumOfAllDonations();


}
