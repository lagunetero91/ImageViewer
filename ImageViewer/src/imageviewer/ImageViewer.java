package imageviewer;

import imageviewer.Model.Image;
import imageviewer.Presistence.ImageSetLoader;
import imageviewer.UI.AplicationFrame;
import java.util.List;

public class ImageViewer {

    public static void main(String[] args) {
        new ImageViewer().execute(args[0]);
    }

    private void execute(String string) {
        List<Image> images = new ImageSetLoader(string).load();
        AplicationFrame frame = new AplicationFrame();
        frame.getDisplay().setImage(images.get(0));
        frame.visible();
    }
}
