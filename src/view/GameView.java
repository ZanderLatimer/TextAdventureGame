package view;

import model.Model;

import javax.swing.*;

public class GameView extends View {

    private JPanel contentPanel;

    public GameView(Model model) {
        contentPanel = new JPanel();
        contentPanel.add(new JLabel("<html>Game Panel<br/><br/>Name: " + model.getPlayer().getName() +"<html><br/>Resilience: " + model.getPlayer().getResilience() + "</html>"));
    }

    @Override
    public JPanel getContentPanel() {
        return this.contentPanel;
    }
}
