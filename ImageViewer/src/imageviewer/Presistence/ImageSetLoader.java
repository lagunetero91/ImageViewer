
package imageviewer.Presistence;

import imageviewer.Model.Image;
import imageviewer.Model.ProxyImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageSetLoader {
    private final String direction;

    public ImageSetLoader(String direction) {
        this.direction = direction;
    }
    
    public List<Image> load(){
        return linker(loadImages());
    }
    
    private List<Image> loadImages(){
        List<Image> images = new ArrayList<>();
        for (Object file : new File(direction).list()){
            images.add(new ProxyImage(new ImageLoader(direction+"/"+file)));
        }
        return images;
    }

    private List<Image> linker(List<Image> loadImages) {
        for (int i = 0; i < loadImages.size(); i++) {
            Image image = loadImages.get(i);
            image.setNext(loadImages.get((i+1)%loadImages.size()));
            image.setPrev(loadImages.get((i+loadImages.size()-1)% loadImages.size()));
        }
        return loadImages;
    }
    
    
}
