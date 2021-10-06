package com.softeng306.p2.Database;

import com.softeng306.p2.Listeners.OnGetTagListener;
import com.softeng306.p2.Listeners.OnGetVehicleListener;

public interface IVehicleDataAccess {
    void getAllTags(OnGetTagListener listener);
    void getAllVehicles(OnGetVehicleListener listener);
    void getElectricVehicles(OnGetVehicleListener listener);
    void getPetrolVehicles(OnGetVehicleListener listener);
    void getHybridVehicles(OnGetVehicleListener listener);
}
