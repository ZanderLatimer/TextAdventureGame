package controller;

import view.*;
import model.*;

public class RootController {

    private RootView rootView;
    private Model model;

    private Controller currentController;
    private View currentView;

    public RootController(RootView view, Model model) {
        this.rootView = view;
        this.model = model;

        MainMenuView mainMenuView = new MainMenuView();
        MainMenuController mainMenuController = new MainMenuController(this, mainMenuView);
        rootView.setWindowContentPanel(mainMenuView.getContentPanel());
    }

    public void setCurrentController(Controller controller) {
        this.currentController = controller;
    }

    public void setCurrentView(View view) {
        this.currentView = view;
        rootView.setWindowContentPanel(currentView.getContentPanel());
    }

    public Model getCurrentModel() {
        return this.model;
    }

    public Controller getCurrentController() {
        return this.currentController;
    }

    public View getCurrentView() {
        return this.currentView;
    }
}
