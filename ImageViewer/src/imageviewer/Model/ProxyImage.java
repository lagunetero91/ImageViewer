package imageviewer.Model;

import imageviewer.Presistence.ImageLoader;

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
    
}
