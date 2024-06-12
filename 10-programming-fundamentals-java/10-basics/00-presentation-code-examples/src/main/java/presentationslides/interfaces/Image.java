package presentationslides.interfaces;

public class Image implements Clickable, Downloadable {

    private String srcPath;

    public Image(String srcPath) {
        this.srcPath = srcPath;
    }

    @Override
    public boolean click() {
        return ImageLoader.load(srcPath)
                .clickOnImage();
    }

    @Override
    public byte[] download() {
        return ImageLoader.load(srcPath)
                .toBytes();
    }

    private static class ImageLoader {
        public static ImageCl load(String srcPath) {
            return null;
        }

        private static class ImageCl {
            public boolean clickOnImage() {
                return false;
            }

            public byte[] toBytes() {
                return new byte[0];
            }
        }
    }
}
