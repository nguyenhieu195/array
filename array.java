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
class Arrayy {

    public Scanner sc = new Scanner(System.in);
    int[] a;

// Nhập mảng    
    public void nhap(int n) {
        System.out.println("---NHAP MANG---");
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
    }

//Xuất mảng    
    public void in() {
        System.out.println("---IN MANG---");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

//Chèn phần tử vào vị trí K của mảng    
    public void chenX(int x, int k) {
        int n = a.length;
        int[] b = new int[a.length + 1];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        for (int i = n; i > k; i--) {
            b[i] = a[i - 1];
        }
        b[k] = x;
        a = b;
    }

//Xoá phần tử ở vị trí K của mảng    
    public void xoa(int k) {
        int n = a.length;
        if (k < 0 || k > n - 1) {
            System.out.println("\n vi tri xoa khong hop le?");
        } else {
            int[] b = new int[n - 1];
            for (int i = 0; i < k; i++) {
                b[i] = a[i];
            }
            for (int i = k; i < a.length - 1; i++) {
                b[i] = a[i + 1];
            }
            a = b;
        }
    }
//Xoá các phần tử lẻ trong mảng 

    public void xoaPhanTuLe() {
        int dem = 0;
        // đếm số phần tử chẵn có trong mảng 
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                dem++;
            }
        }
        int[] b = new int[dem];
        int j = 0;
        // lấy các phần tử chẵn bỏ vào mảng B 
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j] = a[i];
                j++;
            }
        }
        // gán mảng A bằng mảng B 
        a = b;
    }
//Tìm phần tử lớn nhất trong mảng và vị trí của nó

    public void timMAX() {
        int max = 0;
        int Kmax = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
                Kmax = i;
            }
        }
        System.out.println("Phan tu lon nhat trong mang la: " + max + " va nam o vi tri " + Kmax);
    }
//Đếm số phần tử lẻ trong mảng 

    public void demPhanTuLe() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("so phan tu le co trong mang la: " + dem);
    }
//Xoá các số âm trong mảng 

    public void demSoAm() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                dem++;
            }
        }
        System.out.println("so phan tu am co trong mang la: " + dem);
    }
//Tìm phần tử có trong mảng 

    public void timX() {
        System.out.println("nhap phan tu can tim: ");
        int x = sc.nextInt();

        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                check = true;
            }
        }
        if (check) {
            System.out.println("phan tu " + x + " co trong mang");
        } else {
            System.out.println("khong co trong mang");
        }
    }
//Đếm số phần tử có từ ví trí a -> b    

    public void demPhanTuX1denX2() {
        System.out.println("nhap vi tri thu 1: ");
        int x1 = sc.nextInt();
        System.out.println("nhap vi tri thu 2: ");
        int x2 = sc.nextInt();
        int dem = 0;
        for (int i = x1; i <= x2; i++) {
            dem++;
        }
        System.out.println("so phan tu co tu " + x1 + " den " + x2 + " la: " + dem);
    }
//Đảo mảng từ vị trí A đến vị trí B 

    public void daoMangTu2ViTri(int n) {
        System.out.println("nhap vi tri thu 1: ");
        int x1 = sc.nextInt();
        System.out.println("nhap vi tri thu 2: ");
        int x2 = sc.nextInt();

        int i = x1;
        int j = x2;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        in();
    }
//Tích lớn nhất của 2 phân tử có trong mảng 

    public void tich2PhanTuCoTichLonNhat(int n) {
        int max = 0, max1 = 0;

        int min = 0, min1 = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max != a[i] && max1 < a[i]) {
                max1 = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (min != a[i] && min1 > a[i]) {
                min1 = a[i];
            }
        }

        if ((max * max1) > (min * min1)) {
            System.out.println("tich 2 phan tu lon nhat trong mang la: " + max + " * " + max1 + " = " + (max * max1));
        } else {
            System.out.println("tich 2 phan tu lon nhat trong mang la: " + min + " * " + min1 + " = " + (min * min1));
        }
    }

//Tích lớn nhất của 2 phân tử có trong mảng (Cách 2)
    public void tich2PhanTuCoTichLonNhat2() {
        int max = 0;
        int t1 = 0, t2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (max < (a[i] * a[j])) {
                    max = a[i] * a[j];
                    t1 = a[i];
                    t2 = a[j];
                }
            }
        }
        System.out.println("tich 2 phan tu lon nhat trong mang la: " + t1 + " * " + t2 + " = " + max);
    }
//Tích lớn nhất của 2 phân tử có trong mảng (Cách 3)

    public void tich2PhanTuCoTichLonNhat3() {
        int max1 = 0, min1 = 0;
        int max2 = 0, min2 = 0;
        // 2 1 5 3 
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
            
            if(a[i] < min1){
                min2 = min1;
                min1 = a[i];
            }else if(a[i] < min2){
                min2 = a[i];
            }
        }
        int tich1 = max1 * max2;
        int tich2 = min1 * min2;
        if(tich1 > tich2){
            System.out.println("tich 2 phan tu lon nhat trong mang la: " + tich1);
        }else{
            System.out.println("tich 2 phan tu lon nhat trong mang la: " + tich2);
        }
    }
//Đảo mảng    

    public void daoMang() {
        int[] b = new int[a.length];
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            b[j] = a[i];
            j--;
        }
        a = b;
    }
//Xoay mảng sang trái K lần 

    public void xoayMangSangTrai_K_lan(int k) {
        //xoay mảng k lần nên điều kiện là (từ 1 đến <= K hoặc từ 0 đến < K)
        for (int i = 0; i < k; i++) {
            int x = a[0]; // gắn phần tử đầu tiên cho x 
            xoa(0); // xoá phần tử đầu tiên đó 
            chenX(x, a.length); // gắn phần tử x vừa rồi vào vị trí cuối cùng 
        }
    }
//Kiểm tra mảng có tăng dần hay không 

    public void kiemTraTangDan() {
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            break;
        }
        if (check) {
            System.out.println("mang tang dan");
        } else {
            System.out.println("mang khong tang dan");
        }
    }
// Đếm số chấn động 
//---Người ta dùng máy để ghi lại các chấn động (rung lắc). 
//---Một cơn chấn động thường bắt đầu với các rung lắc lớn rồi giảm dần. 
//---Số liệu các chấn động được lưu trong mảng A. 
//---Hãy đếm xem có bao nhiêu chấn động xảy ra. 

    public void demsoChanDong() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {

            //nếu i bằng 0 hoặc a[i] lớn hơn phần tử trước đó thì thêm 1 chấn động mới 
            if (i == 0 || a[i] >= a[i - 1]) {
                dem++;
                System.out.print(a[i] + " ");
            }

            //nếu i < a.length - 1 và a[i] lớn hơn phần tử tiếp theo thì in ra các phần tử đó 
            while (i < a.length - 1 && a[i] > a[i + 1]) {
                i++;
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
        System.out.println("so chan dong la: " + dem);
    }
}

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrayy arr = new Arrayy();
        System.out.print("nhap so phan tu co trong mang: ");
        int n = Integer.parseInt(sc.nextLine());
        arr.nhap(n);
        arr.in();
//        arr.tich2PhanTuCoTichLonNhat();
//        arr.tich2PhanTuCoTichLonNhat2();
//
//        System.out.print("nhap phan tu muon chen: ");
//        int x = sc.nextInt();
//        System.out.print("nhap vi tri muon chen: ");
//        int k = sc.nextInt();
//        arr.chenX(x, k);
//        arr.in();
//
//        System.out.print("nhap vi tri muon xoa: ");
//        int k2 = sc.nextInt();
//        arr.xoa(k2);
//
//        arr.xoaPhanTuLe();
//        arr.in();
//
//        arr.timMAX();
//
//        arr.demPhanTuLe();
//
//        arr.demSoAm();
//
//        arr.timX();
//
//        arr.demPhanTuX1denX2();
//
//        arr.kiemTraTangDan();
//
//        arr.daoMang();
//        System.out.println("mang sau khi dao:");
//        arr.in();
//        arr.daoMangTu2ViTri(n);
//
//        System.out.println("nhap so lan muon xoay mang sang trai: ");
//        int k3 = sc.nextInt();
//        arr.xoayMangSangTrai_K_lan(k3);
//        System.out.println("Mang sau khi xoay sang trai " + k3 + " lan: ");
//        arr.in();
//        arr.demsoChanDong();
//        arr.tich2PhanTuCoTichLonNhat3();
    }
}
