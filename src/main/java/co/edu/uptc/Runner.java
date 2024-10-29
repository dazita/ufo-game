package co.edu.uptc;
import co.edu.uptc.interfaces.iEVDContract;
import co.edu.uptc.models.VehicleManagerModel;
import co.edu.uptc.presenters.Presenter;
import co.edu.uptc.views.*;;

public class Main {
    public static void main(String[] args) {
        iEVDContract.Presenter presenter = new Presenter();
        iEVDContract.Model model = new VehicleManagerModel();
        iEVDContract.View view = new VehicleManagerView();
        view.setPresenter(presenter);
        presenter.setModel(model);
        presenter.setView(view);
        view.begin();
    }
}