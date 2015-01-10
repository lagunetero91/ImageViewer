package imageviewer.Swing;

import imageviewer.Model.Image;
import imageviewer.UI.ImageDisplay;
import javax.swing.JPanel;

public class SwingImageDisplay extends JPanel implements ImageDisplay{
    private Image image;
    
    @Override
    public void setImage(Image image) {
        this.image=image;
    }

    @Override
    public Image getImage() {
        return image;
    }
    
}
