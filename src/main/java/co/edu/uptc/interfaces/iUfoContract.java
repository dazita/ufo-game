package co.edu.uptc.interfaces;

import java.util.ArrayList;

import co.edu.uptc.utilities.VehicleData;

public interface iEVDContract {

    public interface Model {
        public void loadData();
    }
    
    public interface View {
        public void setPresenter(Presenter presenter);
    }
    
    public interface Presenter {
        public void setView(View view);
        public void setModel(Model model);
    }
}