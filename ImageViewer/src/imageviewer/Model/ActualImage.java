package imageviewer.Model;

public class ActualImage extends Image{
    private final BitMap bitMap;

    public ActualImage(BitMap bitMap) {
        this.bitMap = bitMap;
    }
    
    
    @Override
    public BitMap getBitMap() {
        return bitMap;
    }

    @Override
    public Image getNextImage() {
        return null;
    }

    @Override
    public Image getPrevImage() {
        return null;
    }

    @Override
    public void setNext(Image image) {
    }

    @Override
    public void setPrev(Image image) {
    }
    
}
