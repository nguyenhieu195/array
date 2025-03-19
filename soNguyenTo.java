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
class KTsoNguyenTo {

    public void soNguyenTo(int n) {
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                boolean check = false;
                if (i == 2) {
                    System.out.println(i + " la SNT nha!");
                }
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    } else {
                        check = true;
                    }
                }
                if (check) {
                    System.out.println(i + " la SNT");
                }
            }
        } else {
            System.out.println("K co SNT!");
        }
    }
}

class mang {

    Scanner sc = new Scanner(System.in);
    int[] a;

    public void nhapMang(int n) {
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();

        }
    }

    public void xuat() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void sapXepTangDan(int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Mang sau Sx");
        xuat();
    }
}

public class soNguyenTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KTsoNguyenTo s = new KTsoNguyenTo();
        System.out.println("Nhap n:");
        int n = Integer.parseInt(sc.nextLine());
//        s.soNguyenTo(n);
        mang m = new mang();
        m.nhapMang(n);
        m.xuat();
        m.sapXepTangDan(n);
    }
}
