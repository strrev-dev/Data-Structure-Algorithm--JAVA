public class MultipleInterfacesInheritance {
    public static void main(String[] args) {
        MediaFile movie = new MediaFile("Sci-Fi Movie");
        movie.streamContent();
        movie.downloadfile();
    }
}
//Interface 1

interface Streamable {
    void streamContent();
}
//INterface 2

interface Downloadable {
    void downloadfile();
}

//single class implementing multiple interfaces
class MediaFile implements Streamable, Downloadable {
    String Title;

    public MediaFile(String Title) {
        this.Title = Title;
    }

    @Override
    public void streamContent() {
        System.out.println("Streaming content for: " + Title);
    }

    @Override
    public void downloadfile() {
        System.out.println("Downloading file to local storage: " + Title);
    }
}
