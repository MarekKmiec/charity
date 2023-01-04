package com.example.charityDonation.controller;

import com.example.charityDonation.repository.InstitutionRepository;
import com.example.charityDonation.service.DonationService;
import com.example.charityDonation.service.InstitutionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private final DonationService donationService;
    private final InstitutionService institutionService;


    public HomeController(DonationService donationService, InstitutionService institutionService) {
        this.donationService = donationService;
        this.institutionService = institutionService;
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("quantity",donationService.quantityOfAllBags());
        model.addAttribute("allDonations",donationService.sumOfAllDonations());
        model.addAttribute("institutions",institutionService.findAll());


        return "home";
    }
}
