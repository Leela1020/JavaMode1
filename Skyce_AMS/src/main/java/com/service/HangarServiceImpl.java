package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.HangarDAO;
import com.model.Hangar;

@Service
@Transactional
public class HangarServiceImpl implements HangarService{
	@Autowired
	HangarDAO dao;
	
	public List<Hangar> getAvailableHangars(){
		return dao.getAvailableHangars();
	}
	public Hangar addHangar(Hangar hangar) {
		return dao.addHangar(hangar);
	}
	public Hangar getHangar(int hangarNo) {
		return dao.getHangar(hangarNo);
	}
	public List<Hangar> listHangars(){
		return dao.listHangars();
	}
	public Hangar updateHangar(Hangar hangar) {
		return dao.updateHangar(hangar);
	}
	public int deleteHangar(int hangarNo) {
		return dao.deleteHangar(hangarNo);
	}
	public int setAvailability(Hangar hangar,int status) {
		return dao.setAvailability(hangar, status);
	}

}
