package basic.solutions.codelab02;

public class Browser {

    public void multiDownload(Downloadable[] elementsToDownload) {
        for(Downloadable downloadable: elementsToDownload) {
            System.out.println(downloadable.download());
        }
    }
}
