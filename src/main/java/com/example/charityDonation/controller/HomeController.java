package com.example.charityDonation.controller;

import com.example.charityDonation.service.DonationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private final DonationService donationService;

    public HomeController(DonationService donationService) {
        this.donationService = donationService;
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("quantity",donationService.quantityOfAllBags());
        model.addAttribute("allDonations",donationService.sumOfAllDonations());

        return "home";
    }
}
