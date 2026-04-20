package thigk2.nguyengiakhanh.thigk2_nguyengiakhanh;

public class Data {
    private String name;
    private String price;
    private int avatar;

    public Data(int avatar, String name, String price) {
        this.avatar = avatar;
        this.name = name;
        this.price = price;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }


    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
