package advance.dev.model;

public class NhanVien extends CanBo {
	private String congViec;

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", " + super.toString() +
                '}';
    }
}

