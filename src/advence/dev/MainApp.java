package advence.dev;


import advance.dev.dao.Manager;
import advance.dev.model.CongNhan;
import advance.dev.model.IManager;
import advance.dev.model.KySu;
import advance.dev.model.NhanVien;

public class MainApp {
    public static void main(String[] args) {
        IManager manager = (IManager) new Manager();
        
        // Thêm các cán bộ
        manager.add(new CongNhan("Nguyen Van A", 30, "Nam", "Ha Noi", 5));
        manager.add(new KySu("Tran Thi B", 35, "Nu", "Ho Chi Minh", "Cong nghe thong tin"));
        manager.add(new NhanVien("Le Van C", 25, "Nam", "Da Nang", "Ban hang"));

        // In danh sách cán bộ
        manager.print();

        // Sắp xếp danh sách cán bộ theo tên tăng dần
        manager.sortByName(1);
        System.out.println("Danh sach can bo sau khi sap xep theo ten tang dan:");
        manager.print();

        // Sắp xếp danh sách cán bộ theo tên giảm dần
        manager.sortByName(-1);
        System.out.println("Danh sach can bo sau khi sap xep theo ten giam dan:");
        manager.print();
    }
}
	


