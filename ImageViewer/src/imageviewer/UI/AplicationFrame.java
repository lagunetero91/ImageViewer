
package imageviewer.UI;

import imageviewer.Swing.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplicationFrame extends JFrame{
    private SwingImageDisplay display;
    public AplicationFrame(){
        setTitle("Image Viewer");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWidget();
    }

    private void addWidget() {
        add(createDisplay());
        add(createPanelButton(), BorderLayout.SOUTH);
    }

    private JPanel createDisplay() {
        display = new SwingImageDisplay();
        display.setSize(new Dimension(1000,1000));
        return display;
    }

    public SwingImageDisplay getDisplay() {
        return display;
    }
    
    public void visible(){
        setVisible(true);
    }

    private JPanel createPanelButton() {
        JPanel panel = new JPanel();
        panel.add(prevButton("PREV"));
        panel.add(nextButton("NEXT"));
        return panel;
        
    }

    private JButton prevButton(String prev) {
        JButton button= new JButton(prev);
        return button;
    }

    private JButton nextButton(String next) {
        JButton button = new JButton(next);
        return button;
    }
}
