package imageviewer.Swing;

import imageviewer.Model.Image;
import imageviewer.UI.ImageDisplay;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class SwingImageDisplay extends JPanel implements ImageDisplay{
    private Image image;
    private int offset;
    
    @Override
    public void setImage(Image image) {
        this.image=image;
       repaint();
    }

    @Override
    public Image getImage() {
        return image;
    }
    
    public BufferedImage getBitmap(){
        if(image.getBitMap() instanceof SwingBitMap)
            return getBufferedImage((SwingBitMap) image.getBitMap());
        return null;
    }

    private BufferedImage getBufferedImage(SwingBitMap swingBitMap) {
        return swingBitMap.getBufferdedImage();
    }

    public void paint (Graphics g){
        super.paint(g);
        g.drawImage(getBitmap(), 0, 0,getWidth(),getHeight(), null);
        
    }
}

