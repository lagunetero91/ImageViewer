package imageviewer;

import imageviewer.Model.Image;
import imageviewer.Presistence.ImageLoader;

public class ImageViewer {

    public static void main(String[] args) {
        new ImageViewer().execute(args[0]);
    }

    private void execute(String string) {
        Image image = new ImageLoader(string).load();
    }
    
}
