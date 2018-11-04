import controller.RootController;
import model.Model;
import view.RootView;

import javax.swing.*;

public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //TODO: Grab screen size to pass through to view
                Model model = new Model();
                RootView window = new RootView(600, 800, model);
                RootController RootController = new RootController(window, model);

                window.setVisible(true);
            }
        });
    }
}
