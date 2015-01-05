
package imageviewer.Control;

import imageviewer.UI.ImageDisplay;

public class PrevImageOperation implements Operation{
    private final ImageDisplay imageDisplay;

    public PrevImageOperation(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        this.imageDisplay.setImage(this.imageDisplay.getImage().getPrevImage());
        
    }
    
}
