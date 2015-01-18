package imageviewer.Model;

import imageviewer.Presistence.ImageLoader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProxyImage extends Image{
    private final ImageLoader loader;
    private Image next;
    private Image prev;
    private Image actualImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }
    

    @Override
    public BitMap getBitMap() {
        try{
            checkLoaded();
        } catch (IOException ex) {
            Logger.getLogger(ProxyImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return actualImage.getBitMap();
    }

    @Override
    public Image getNextImage() {
        return next;
    }

    @Override
    public Image getPrevImage() {
        return prev;
    }

    @Override
    public void setNext(Image image) {
        this.next=image;
    }

    @Override
    public void setPrev(Image image) {
        this.prev=image;
    }

    private void checkLoaded() throws IOException {
        if (actualImage != null) return;
        actualImage = loader.load();
    }
    
    
}
