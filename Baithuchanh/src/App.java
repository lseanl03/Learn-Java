// import java.util.ArrayList;

// public class SinhVien {
//     private String ten;
//     private double diem;

//     public SinhVien(String ten, double diem) {
//         this.ten = ten;
//         this.diem = diem;
//     }

//     public String getTen() {
//         return ten;
//     }

//     public double getDiem() {
//         return diem;
//     }

//     public void setTen(String ten) {
//         this.ten = ten;
//     }

//     public void setDiem(double diem) {
//         this.diem = diem;
//     }

//     public static void main(String[] args) {
//         ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

//         // Phương thức để nhập thông tin sinh viên
//         enter(danhSachSinhVien, "John Doe", 8.5);
//         enter(danhSachSinhVien, "Jane Smith", 7.2);

//         // Hiển thị danh sách sinh viên
//         display(danhSachSinhVien);

//         // Cập nhật điểm của sinh viên
//         update(danhSachSinhVien, "John Doe", 9.0);

//         // Hiển thị danh sách sinh viên sau khi cập nhật
//         display(danhSachSinhVien);

//         // Xóa sinh viên
//         delete(danhSachSinhVien, "Jane Smith");

//         // Hiển thị danh sách sinh viên sau khi xóa
//         display(danhSachSinhVien);
//     }

//     public static void enter(ArrayList<SinhVien> danhSachSinhVien, String ten, double diem) {
//         SinhVien sv = new SinhVien(ten, diem);
//         danhSachSinhVien.add(sv);
//     }

//     public static void insert(ArrayList<SinhVien> danhSachSinhVien, int index, String ten, double diem) {
//         SinhVien sv = new SinhVien(ten, diem);
//         danhSachSinhVien.add(index, sv);
//     }

//     public static void update(ArrayList<SinhVien> danhSachSinhVien, String ten, double diem) {
//         for (SinhVien sv : danhSachSinhVien) {
//             if (sv.getTen().equals(ten)) {
//                 sv.setDiem(diem);
//                 break;
//             }
//         }
//     }

//     public static void delete(ArrayList<SinhVien> danhSachSinhVien, String ten) {
//         for (int i = 0; i < danhSachSinhVien.size(); i++) {
//             if (danhSachSinhVien.get(i).getTen().equals(ten)) {
//                 danhSachSinhVien.remove(i);
//                 break;
//             }
//         }
//     }

//     public static void display(ArrayList<SinhVien> danhSachSinhVien) {
//         System.out.println("Danh sách sinh viên:");
//         for (SinhVien sv : danhSachSinhVien) {
//             System.out.println("Tên: " + sv.getTen() + ", Điểm: " + sv.getDiem());
//         }
//         System.out.println();
//     }
// }
