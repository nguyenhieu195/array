package vidu;

import java.util.Scanner;

class matran01 {

    Scanner sc = new Scanner(System.in);

    ;

    public void nhapMang(int m, int n, int a[][]) {
        System.out.println("---NHAP MANG---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void xuatMang(int m, int n, int a[][]) {
        System.out.println("---XUAT MANG---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

//Nhân hai mảng 
    public void nhanMang(int m, int n, int[][] a, int u, int p, int[][] b) {
        // Kiểm tra điều kiện nhân ma trận: số cột của ma trận a (n) phải bằng số hàng của ma trận b (u)
        if (n == u) {
            // Khởi tạo ma trận kết quả c có kích thước m x p
            int[][] c = new int[m][p];

            // Duyệt từng hàng của ma trận kết quả c
            for (int i = 0; i < m; i++) {
                // Duyệt từng cột của ma trận kết quả c
                for (int j = 0; j < p; j++) {
                    // Khởi tạo phần tử c[i][j] = 0 để chuẩn bị tính tổng tích
                    c[i][j] = 0;

                    // Duyệt qua từng phần tử trong hàng i của a và cột j của b
                    for (int k = 0; k < n; k++) {
                        // Tính tổng các tích của phần tử a[i][k] * b[k][j]
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // In kết quả sau khi nhân hai ma trận
            System.out.println("---Mảng sau khi nhân----");
            for (int i = 0; i < m; i++) {  // Duyệt qua từng hàng của ma trận c
                for (int j = 0; j < p; j++) {  // Duyệt qua từng cột của ma trận c
                    System.out.print(c[i][j] + " ");  // In giá trị của phần tử c[i][j]
                }
                System.out.println();  // Xuống dòng sau khi in hết một hàng
            }
        } else {
            // Nếu điều kiện nhân không thỏa mãn, thông báo lỗi
            System.out.println("Không thể nhân hai mảng");
        }
    }
}

public class maTran {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matran01 matranA = new matran01();
        System.out.println("---Mảng A---");
        int[][] a;
        System.out.print("nhập số lượng hàng: ");
        int m = sc.nextInt();
        System.out.print("nhập số lượng cột: ");
        int n = sc.nextInt();
        a = new int[m][n];
        matranA.nhapMang(m, n, a);
        matranA.xuatMang(m, n, a);

        matran01 matranB = new matran01();
        System.out.println("---Mảng B---");
        int[][] b;
        System.out.print("nhập số lượng hàng: ");
        int u = sc.nextInt();
        System.out.print("nhập số lượng cột: ");
        int p = sc.nextInt();
        b = new int[u][p];
        matranB.nhapMang(u, p, b);
        matranB.xuatMang(u, p, b);

        matran01 c = new matran01();
        c.nhanMang(m, n, a, u, p, b);

    }
}
