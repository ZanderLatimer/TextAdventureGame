package controller;

import model.Player;
import model.Model;
import view.GameView;
import view.MainMenuView;
import view.NewGameSetupView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameSetupController extends Controller {

    private RootController rootController;
    private NewGameSetupView view;

    public NewGameSetupController(RootController controller, NewGameSetupView view) {
        this.rootController = controller;
        this.view = view;

        this.view.addStartGameButtonListener(new StartGameButton());
        this.view.addMainMenuButtonListener(new MainMenuButton());
    }

    private class StartGameButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Start game command selected");

            Player player = new Player(view.getCharacterName(), view.getResilience());
            Model model = rootController.getCurrentModel();
            model.setPlayer(player);

            GameView gameView = new GameView(model);
            GameController gameController = new GameController(model);

            rootController.setCurrentView(gameView);
            rootController.setCurrentController(gameController);
        }
    }

    private class MainMenuButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Main menu command selected");

            MainMenuView mainMenuView = new MainMenuView();
            MainMenuController mainMenuController = new MainMenuController(rootController, mainMenuView);
            rootController.setCurrentView(mainMenuView);
            rootController.setCurrentController(mainMenuController);
        }
    }
}
