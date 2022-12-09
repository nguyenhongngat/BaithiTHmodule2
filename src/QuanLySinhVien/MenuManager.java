package QuanLySinhVien;

import QuanLySinhVien.Manager;

public class MenuManager {
    Manager manager = new Manager();

    public void menu() {
        int choice;
        do {
            String menu = """
                    ______________________________________________
                    ---- CHUONG TRINH QUAN LY SINH VIEN ----
                    Chon chuc nang theo so (de tiep tuc)
                    1. Xem danh sach sinh vien
                    2. Them moi
                    3. Cap nhat
                    4. Xoa
                    5. Sap xep
                    6. Doc tu file
                    7. Ghi vao file
                    8. Thoat    
                    Chon chuc nang:
                    """;
            System.out.println(menu);

            choice = manager.checkLoiNhap();

            switch (choice) {
                case 1 -> manager.show();
                case 2 -> manager.add();
                case 3 -> manager.update();
                case 4 -> manager.delete();
                case 5 -> manager.sort();
                case 6 -> manager.ReadFromFile();
                case 7 -> manager.WriteToFile();
                case 8 -> System.exit(0);
                default -> System.out.println("Chon lai!");
            }
        } while (true);
    }

}
