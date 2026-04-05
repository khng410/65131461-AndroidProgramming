package khanhnguyen.edu.baith9_recyclerview;

public class LandScape {
    private String imageFileName;
    private String landscapeCaption;

    public LandScape(String imageFileName, String landscapeCaption) {
        this.imageFileName = imageFileName;
        this.landscapeCaption = landscapeCaption;
    }

    public String getImageFileName() { return imageFileName; }
    public void setImageFileName(String imageFileName) { this.imageFileName = imageFileName; }

    public String getLandscapeCaption() { return landscapeCaption; }
    public void setLandscapeCaption(String landscapeCaption) { this.landscapeCaption = landscapeCaption; }
}
