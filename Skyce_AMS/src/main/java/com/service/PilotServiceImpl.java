package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PilotDAO;
import com.model.Pilot;

@Service
@Transactional
public class PilotServiceImpl implements PilotService{
	@Autowired
	PilotDAO dao;

	public List<Pilot> listPilots() {
		return dao.listPilots();
	}

	public Pilot savePilot(Pilot pilot) {
		return dao.savePilot(pilot);
	}

	public Pilot updatePilot(Pilot pilot) {
		return dao.updatePilot(pilot);
	}

	public Pilot getPilot(int pilotNo) {
		return dao.getPilot(pilotNo);
	}

	public int deletePilot(int pilotNo) {
		return dao.deletePilot(pilotNo);
	}
	
}
