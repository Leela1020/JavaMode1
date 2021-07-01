package com.service;

import java.util.List;

import com.model.Hangar;

public interface HangarService {
	public Hangar addHangar(Hangar hangar);
	public Hangar getHangar(int hangarNo);
	public List<Hangar> listHangars();
	public Hangar updateHangar(Hangar hangar);
	public int deleteHangar(int hangarNo);
	public int setAvailability(Hangar hangar,int status);
	public List<Hangar> getAvailableHangars();
}
