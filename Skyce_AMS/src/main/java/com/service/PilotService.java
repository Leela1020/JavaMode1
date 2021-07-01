package com.service;

import java.util.List;

import com.model.Pilot;

public interface PilotService {
	public List<Pilot> listPilots();
    public Pilot savePilot(Pilot pilot);
    public Pilot updatePilot(Pilot pilot);
    public Pilot getPilot(int pilotNo);
    public int deletePilot(int pilotNo);

}
