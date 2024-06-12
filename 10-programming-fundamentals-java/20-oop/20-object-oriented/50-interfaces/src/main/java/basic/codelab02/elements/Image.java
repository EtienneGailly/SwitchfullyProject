package basic.codelab02.elements;

public class Image {

    private final String url;
    private final int heightInPixel;
    private final int widthInPixel;

    public Image(String url, int heightInPixel, int widthInPixel) {
        this.url = url;
        this.heightInPixel = heightInPixel;
        this.widthInPixel = widthInPixel;
    }

    public String getUrl() {
        return url;
    }

    public String getDimensions() {
        return widthInPixel + "x" + heightInPixel;
    }
}
