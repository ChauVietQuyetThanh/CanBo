package advance.dev.model;

public class CongNhan extends CanBo {
	private int bac;

    public CongNhan(String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", " + super.toString() +
                '}';
    }
}


