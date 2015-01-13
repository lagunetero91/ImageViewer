
package imageviewer.Presistence;

import imageviewer.Model.ActualImage;
import imageviewer.Model.BitMap;
import imageviewer.Model.Image;
import imageviewer.Swing.SwingBitMap;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ImageLoader {
    private String name;
    public ImageLoader(String name) {
        this.name = name;
    }
    
    public Image load(){
        return new ActualImage(loadBitMap());
    }

    private BitMap loadBitMap() {
        return new SwingBitMap(loadBufferedImage());
    }

    private BufferedImage loadBufferedImage() {
        try {
            return ImageIO.read(new File(name));
        } catch (IOException ex) {
            Logger.getLogger(ImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
}
