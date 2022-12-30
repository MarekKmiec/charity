package com.example.charityDonation.repository;

import com.example.charityDonation.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
