
package imageviewer.UI;

import imageviewer.Control.NextImageOperation;
import imageviewer.Control.Operation;
import imageviewer.Control.PrevImageOperation;
import imageviewer.Swing.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AplicationFrame extends JFrame{
    private SwingImageDisplay display;
    public AplicationFrame(){
        this.setTitle("Image Viewer");
        this.setSize(800,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addWidget();
    }

    private void addWidget() {
        add(createDisplay());
        add(createPanelButton(), BorderLayout.SOUTH);
    }

    private JPanel createDisplay() {
        display = new SwingImageDisplay();
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
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                NextImageOperation next = new NextImageOperation(getDisplay());
                next.execute();
            }
        });
        return button;
    }

    private JButton nextButton(String next) {
        JButton button = new JButton(next);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PrevImageOperation prev = new PrevImageOperation(getDisplay());
                prev.execute();
            }
        });
        return button;
    }
}
