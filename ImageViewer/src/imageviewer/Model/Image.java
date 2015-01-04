
package imageviewer.Model;

public abstract class Image {
    
    public abstract BitMap getBitMap();
    public abstract Image getNextImage();
    public abstract Image getPrevImage();
    
    public abstract void setNext(Image image);
    public abstract void setPrev(Image image);
    
}
