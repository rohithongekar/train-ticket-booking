package com.rohit.service;

import java.util.List;

import com.rohit.beans.HistoryBean;
import com.rohit.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
