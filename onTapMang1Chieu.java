package vidu;

import java.util.Scanner;

class mang1Chieu {

    public static Scanner sc = new Scanner(System.in);
    int[] a;

    public void nhapMang(int n) {
        a = new int[n];
        System.out.println("---NHAP MANG---");
        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
    }

    public void xuatMang() {
        System.out.println("---XUAT MANG---");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void chen(int x, int k) {
        int[] b = new int[a.length + 1];
        if (k > a.length || k < 0) {
            System.out.println("vi tri chen k hop le!");
        } else {

            for (int i = 0; i < k; i++) {
                b[i] = a[i];
            }
            for (int i = a.length; i > k; i--) {
                b[i] = a[i - 1];
            }
            b[k] = x;
            a = b;
        }
    }

    public void xoaPhanTu(int x) {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                dem++;
            }
        }
        int[] b = new int[dem];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                b[index] = a[i];
                index++;
            }
        }
        a = b;
    }

    public void xoaPhanTuTaiViTri(int k) {
        if (k >= a.length || k < 0) {
            System.out.println("Vi tri can xoa khong hop le!");
        } else {
            int[] b = new int[a.length - 1];
            int index = 0;

            for (int i = 0; i < a.length; i++) {
                if (i != k) {
                    b[index] = a[i];
                    index++;
                }
            }
            a = b;
        }
    }

    public void max() {
        int soLonNhat = 0;
        for (int i = 0; i < a.length; i++) {
            if (soLonNhat < a[i]) {
                soLonNhat = a[i];
            }
        }
        System.out.println("so lon nhat la: " + soLonNhat);
    }

    public void demPhanTuLe() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                dem++;
            }
        }
        System.out.println("so phan tu le: " + dem);
    }

    public void xoaPhanTuLe() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                dem++;
            }
        }
        int[] b = new int[dem];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[index] = a[i];
                index++;
            }
        }
        a = b;
    }

    public void daoMang() {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

    public void daoMang2() {
        int[] b = new int[a.length];
        int index = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            b[index] = a[i];

            index++;
        }
        a = b;
    }

    public void sapXepGiamDan() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void sapXepTangDan() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void demSoAm() {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                dem++;
            }
        }
        System.out.println("so phan tu am la: " + dem);
    }

    public void timX() {
        System.out.println("nhap phan tu can tim: ");
        int x = sc.nextInt();

        boolean find = false;
        for (int i : a) {
            if (i == x) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("Phan tu co trong mang");
        } else {
            System.out.println("NO");
        }
    }

    public void demPhanTu2ViTri() {
        int dem = 0;
        System.out.println("nhap vi tri 1: ");
        int k1 = sc.nextInt();
        System.out.println("nhap vi tri 2: ");
        int k2 = sc.nextInt();
        if (k1 < 0 || k1 > a.length || k2 < 0 || k2 > a.length) {
            System.out.println("vi tri khong hop le!");
            return;
        }
        if (k1 < k2) {
            for (int i = k1; i <= k2; i++) {
                dem++;
            }
        } else if (k1 > k2) {
            for (int i = k2; i <= k1; i++) {
                dem++;
            }
        }
        System.out.println("so phan tu co la: " + dem);
    }

    public void daoMangTu2ViTri() {
        System.out.println("nhap vi tri 1: ");
        int k1 = sc.nextInt();
        System.out.println("nhap vi tri 2: ");
        int k2 = sc.nextInt();
        while (k1 < k2) {
            int temp = a[k1];
            a[k1] = a[k2];
            a[k2] = temp;
            k1++;
            k2--;
        }
    }

    public void tichLonNhat() {
        int max = 0;
        for (int i : a) {
            for (int j : a) {
                if (i != j && max < i * j) {
                    max = i * j;
                }
            }
        }
        System.out.println("tich lon nhat la: " + max);
    }
// 1 2 3 4 5  

    public void xoayMang_K_Lan() {
        System.out.println("nhap so lan can xoay: ");
        int k = sc.nextInt();
        int temp = 1;
        while (temp <= k) {
            int dau = 0;
            int cuoi = a.length - 1;
            int t = a[dau];
            while (dau < cuoi) {
                a[dau] = a[dau+1];
                dau++;
            }
            a[cuoi] = t;
            temp++;

        }
    }
}

public class onTapMang1Chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mang1Chieu m1 = new mang1Chieu();
        System.out.print("nhap so phan tu co trong mang: ");
        int n = sc.nextInt();

        m1.nhapMang(n);
        m1.xuatMang();

//        System.out.println("--Chen phan tu--");
//        System.out.println("nhap phan tu muon chen: ");
//        int x = sc.nextInt();
//        System.out.println("nhap vi tri muon chen: ");
//        int k = sc.nextInt();
//        m1.chen(x, k);
//        System.out.println("nhap phan tu muon xoa: ");
//        int x = sc.nextInt();
//        m1.xoaPhanTu(x);
//        System.out.println("nhap vi tri muon xoa: ");
//        int k = sc.nextInt();
//        m1.xoaPhanTuTaiViTri(k);
//        m1.max();
//        m1.demPhanTuLe();
//        m1.xoaPhanTuLe();
//        m1.daoMang();
//        m1.daoMang2();
//        m1.sapXepGiamDan();
//        m1.sapXepTangDan();
//        m1.demSoAm();
//        m1.timX();
//        m1.demPhanTu2ViTri();
//        m1.daoMangTu2ViTri();
//        m1.tichLonNhat();
        m1.xoayMang_K_Lan();
        m1.xuatMang();
    }
}
