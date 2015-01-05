package imageviewer.Control;

import imageviewer.UI.ImageDisplay;

public class NextImageOperation implements Operation{
    private final ImageDisplay imageDisplay;

    public NextImageOperation(ImageDisplay image) {
        this.imageDisplay = image;
    }
    
    
    @Override
    public void execute() {
        this.imageDisplay.setImage(this.imageDisplay.getImage().getNextImage());
    }
    
}
