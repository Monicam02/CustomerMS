package com.moni.ms.CustomerMS.rest;

import com.moni.ms.CustomerMS.Model.Hotel;
import com.moni.ms.CustomerMS.Service.HotelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @GetMapping("/hello")
    public String HelloCustomer(){
        return "Hello Customer";
    }

        private static final Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

        @Autowired
        private HotelService hotelService;

        @GetMapping("/hotels")
        public List<Hotel> getHotels() {
            LOGGER.info("Rest call received to fetch all hotels");
            List<Hotel> hotelList = hotelService.getHotels();
            return hotelList;
        }


        @PostMapping("/hotel")
        public void addHotel(@RequestBody Hotel hotel) {
            LOGGER.info("Rest call received to add a new hotel, {}", hotel.getName());
            hotelService.addHotel(hotel);
            LOGGER.info("hotel added successfully");
        }

    }



