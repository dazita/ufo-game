package co.edu.uptc.views;

import java.util.ArrayList;

import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.interfaces.iEVDContract.Presenter;
import co.edu.uptc.utilities.VehicleData;
import co.edu.uptc.views.MainFrame.MainFrame;

public class VehicleManagerView implements iEVDContract.View{
    private iEVDContract.Presenter presenter;
    private LoadingFrame loadingFrame;
    private MainFrame mainFrame;

    public VehicleManagerView(){
        mainFrame = new MainFrame(this);
        loadingFrame = new LoadingFrame();
    }

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter = presenter;
    }

    @Override
    public void begin() {
        loadingFrame.makeVisible();
        presenter.loadData();
    }

    @Override
    public void showMainFrame() {
        loadingFrame.setVisible(false);
        mainFrame.setVisible(true);
    }

    @Override
    public void putVehiclesOnScreen(ArrayList<VehicleData> vehiclesByName) {
        mainFrame.getBody().putVehiclesOnScreen(vehiclesByName);
    }

    @Override
    public void requestSearch(String request) {
        presenter.search(request);
    }

    @Override
    public void showNotFoundedMessage() {
        mainFrame.getBody().showNotFoundedMessage();
    }
}
