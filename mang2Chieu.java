/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

import java.util.Scanner;

/**
 *
 * @author hieuvannguyen
 */
class mang {

    Scanner sc = new Scanner(System.in);
    int[][] a;

    public void nhapMang(int m, int n) {
        System.out.println("---NHAP MANG---");
        a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phần tử a[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void xuatMang(int m, int n) {
        System.out.println("---XUAT MANG---");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
//Trung bình cộng các số lẻ trong mỗi cột

    public void tbCongCuaCot(int m, int n) {
        //duyệt qua từng dòng của mảng 
        for (int i = 0; i < m; i++) {
            int dem = 0;
            int tong = 0;
            //duyệt qua từng cột của mảng 
            for (int j = 0; j < n; j++) {
                //nếu phần tử thứ i của cột không chia hết cho 2 thì...
                if (a[j][i] % 2 != 0) {
                    System.out.println("---" + a[j][i]);
                    dem++;
                    tong += a[j][i];
                }
            }
            float tbc = tong / dem;
            System.out.println("TBC của cột " + i + " la: " + tbc);
        }

    }
//Tìm phần tử lớn nhất của mỗi dòng     

    public void timPhanTuLonNhatCuaDong(int m, int n) {
        for (int i = 0; i < m; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
            System.out.println("phần tử lớn nhất của dòng " + (i + 1) + " la: " + max);
        }
    }
    //Xoay mảng theo chiều ngang 

    public void xoayMangTheoChieuNgang(int m, int n) {
        for (int i = 0; i < m; i++) {
            int left = 0; // phần tử đầu tiên của mảng
            int right = n - 1; // phần tử cuối cùng của mảng 
            while (left < right) {
                // đổi phần tử đầu và phần tử cuối
                int temp = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    //Xoay mảng theo chiều dọc 
    public void xoayMangTheoChieuDoc(int m, int n) {
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;
            while (left < right) {
                int temp = a[left][i];
                a[left][i] = a[right][i];
                a[right][i] = temp;

                left++;
                right--;
            }
        }
    }
    //Xoay mảng theo chiều kim đồng hồ 90 độ 

    public void xoayMang90Do(int m, int n) {
        //Vì ma trận xoay 90 độ nên hàng trở thành cột, cột trở thành hàng
        int[][] b = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                //b[j][i] = a[i][j] là đổi biến hàng thành cột 
                //m - 1 - j là phần tử cuối của cột
                b[j][m - 1 - i] = a[i][j];
            }
        }
        a = b;

        //sau khi xoay mảng cột sẽ thành hàng,hàng sẽ thành cột nên phải đổi m và n 
        xuatMang(n, m);
    }
    //Xoay mảng ngược chiều kim đồng hồ 

    public void XoayNguoc90Do(int m, int n) {
        int[][] b = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                //b[j][i] = a[i][j] là đổi biến hàng thành cột
                //n - 1 - j là phần tử cuối của cột 
                b[n - 1 - j][i] = a[i][j];
            }
        }
        a = b;
        xuatMang(n, m);
    }
    //Xoay mảng ngược chiều kim đồng hồ cách 2

    public void XoayNguoc90Do2(int m, int n) {
        xoayMang90Do(m, n);
        xoayMangTheoChieuNgang(m, n);
        xoayMangTheoChieuDoc(m, n);
        xuatMang(m, n);
    }
}

public class mang2Chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mang a = new mang();

        System.out.print("nhập số lượng hàng: ");
        int m = sc.nextInt();
        System.out.print("nhập số lượng cột: ");
        int n = sc.nextInt();
        a.nhapMang(m, n);
        a.xuatMang(m, n);
//        a.timPhanTuLonNhatCuaDong(m, n);
//        a.tbCongCuaCot(m, n);
//        System.out.println("Mảng sau khi xoay ngang ");
//        a.xoayMangTheoChieuNgang(m, n);
//        System.out.println("Mảng sau khi xoay dọc ");
//        a.xoayMangTheoChieuDoc(m, n);
//        System.out.println("mảng sau khi xoay theo chiều kim đồng hồ: ");
//        a.xoayMang90Do(m, n);
//        System.out.println("mảng sau khi xoay ngược chiều kim đồng hồ: ");
//        a.XoayNguoc90Do(m, n);
        System.out.println("mảng sau khi xoay ngược chiều kim đồng hồ cách 2: ");
        a.XoayNguoc90Do2(m, n);

    }
}
