package co.edu.uptc.presenters;

import java.util.ArrayList;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Model;
import co.edu.uptc.interfaces.iEVDContract.View;
import co.edu.uptc.utilities.VehicleData;


public class Presenter implements iEVDContract.Presenter{

    private iEVDContract.View view;
    private iEVDContract.Model model;

    @Override
    public void setView(View view) {
        this.view = view;
    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public void loadData() {
        model.loadData();
        view.showMainFrame();
    }

    @Override
    public void vehiclesByName(String name) {
        view.putVehiclesOnScreen(model.vehiclesByName(name));
    }

    @Override
    public void search(String request) {
        ArrayList<VehicleData> vehicles = model.vehiclesByName(request);
        if (vehicles.isEmpty()) {
            System.out.println("did not found shi");
            view.showNotFoundedMessage();
        } else {    
            System.out.println("you the goat");
            view.putVehiclesOnScreen(model.vehiclesByName(request));
        }
    }
}
