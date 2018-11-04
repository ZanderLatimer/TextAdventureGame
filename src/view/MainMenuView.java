package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainMenuView extends View {

    private JPanel contentPanel;

    private JButton newGameButton;
    private JButton loadGameButton;

    public MainMenuView() {
        this.contentPanel = new JPanel();
        this.newGameButton = new JButton("Start New Game");
        this.loadGameButton = new JButton("Load Game");

        contentPanel.add(newGameButton);
        contentPanel.add(loadGameButton);
    }

    @Override
    public JPanel getContentPanel() {
        return this.contentPanel;
    }

    public void addNewGameButtonListener(ActionListener listener) {
        this.newGameButton.addActionListener(listener);
    }

    public void addLoadGameButtonListener(ActionListener listener) {
        this.loadGameButton.addActionListener(listener);
    }
}
