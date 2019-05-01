package com.moni.ms.CustomerMS.Service;

import com.moni.ms.CustomerMS.Model.Hotel;
import com.moni.ms.CustomerMS.Repository.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

        private static final Logger LOGGER = LoggerFactory.getLogger(HotelServiceImpl.class);
        private final HotelRepository hotelRepository;

        @Autowired
        public HotelServiceImpl(HotelRepository hotelRepository) {
            this.hotelRepository = hotelRepository;
        }

        @Override
        public List<Hotel> getHotels() {
            LOGGER.info("fetching from Hotel Repository");
            return hotelRepository.findAll();
        }

        @Override
        public void addHotel(Hotel hotel) {
            LOGGER.info("adding new hotel to Repository");
            hotelRepository.save(hotel);
            LOGGER.info("hotel saved successfully to Repository");
        }
    }


