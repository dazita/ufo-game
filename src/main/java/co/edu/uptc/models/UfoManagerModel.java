package co.edu.uptc.models;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.uptc.interfaces.*;
import co.edu.uptc.interfaces.iUfoContract.Presenter;

public class VehicleManagerModel implements iUfoContract.Model {

    private iUfoContract.Presenter presenter;

    @Override
    public void setPresenter(Presenter presenter) {
       this.presenter =  presenter;
    }


  


}
