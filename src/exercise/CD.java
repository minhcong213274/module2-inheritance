package exercise;

public class CD {
    private int idCD,numberOfSongs;
    private String nameCD,singer;
    private double price;

    public CD(int idCD, int numberOfSongs, String nameCD, String singer, double price) {
        this.idCD = idCD;
        this.numberOfSongs = numberOfSongs;
        this.nameCD = nameCD;
        this.singer = singer;
        this.price = price;
    }

    public CD() {
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public String getNameCD() {
        return nameCD;
    }

    public void setNameCD(String nameCD) {
        this.nameCD = nameCD;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CD{" +
                "idCD=" + idCD +
                ", numberOfSongs=" + numberOfSongs +
                ", nameCD='" + nameCD + '\'' +
                ", singer='" + singer + '\'' +
                ", price=" + price +
                '}';
    }
}
