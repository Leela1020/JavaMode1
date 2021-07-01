package com.dao;

import java.util.List;

import com.model.Hangar;

public interface HangarDAO {
	public Hangar addHangar(Hangar hangar);
	public List<Hangar> listHangars();
	public Hangar getHangar(int hangarNo);
	public Hangar updateHangar(Hangar hangar);
	public int deleteHangar(int hangarNo);
	public int setAvailability(Hangar hangar,int status);
	public List<Hangar> getAvailableHangars();
}
