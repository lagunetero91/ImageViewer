
package imageviewer.Presistence;

import imageviewer.Model.Image;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class ImageLoader {
    private final File file;
    private String name;
    public ImageLoader(String name) {
        this.name = name;
        this.file=new File(name);
    }
    
    public Image load(){
        ArrayList <File> imageSet = new ArrayList<>();
        imageSet=getImages(file.getParentFile());
        return;
    }

    private ArrayList<File> getImages(File file) {
        final String[] extensions ={".jpg",".png"};
        return file.listFiles(new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                for (int i = 0; i < extensions.length; i++) {
                    if (pathname.getName().endsWith(extensions[i])) return true;
                return false;
                    
                }
            }
        });
    }
}
