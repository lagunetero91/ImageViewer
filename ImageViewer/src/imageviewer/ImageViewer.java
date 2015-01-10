package imageviewer;

import imageviewer.Model.Image;
import imageviewer.Presistence.ImageLoader;
import imageviewer.UI.AplicationFrame;

public class ImageViewer {

    public static void main(String[] args) {
        new ImageViewer().execute(args[0]);
    }

    private void execute(String string) {
        Image image = new ImageLoader("C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg").load();
        AplicationFrame frame = new AplicationFrame();
        frame.getDisplay().setImage(image);
        frame.visible();
    }
}
