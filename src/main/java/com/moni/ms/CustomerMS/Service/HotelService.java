package com.moni.ms.CustomerMS.Service;

import com.moni.ms.CustomerMS.Model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getHotels();
    void addHotel(Hotel hotel );
}
