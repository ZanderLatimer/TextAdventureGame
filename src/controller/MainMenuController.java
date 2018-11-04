package controller;

import view.MainMenuView;
import view.NewGameSetupView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController extends Controller {

    private RootController rootController;
    private MainMenuView view;

    public MainMenuController(RootController controller, MainMenuView view) {
        this.rootController = controller;
        this.view = view;

        this.view.addNewGameButtonListener(new NewGameButton());
        this.view.addLoadGameButtonListener(new LoadGameButton());
    }

    private class NewGameButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("New game command selected");

            NewGameSetupView newGameSetupView = new NewGameSetupView();
            rootController.setCurrentView(newGameSetupView);
            rootController.setCurrentController(new NewGameSetupController(rootController, newGameSetupView));
        }
    }

    private class LoadGameButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Load game command selected");
        }
    }
}
