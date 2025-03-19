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
class Node {

    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    Node(int x, Node t) {
        data = x;
        next = t;
    }

    public String toString() {
        String t = " " + data + "->";
        return t;
    }
}

public class mySingleLinkedList {

    Node head;

    public void add(int x) {
        head = new Node(x, head);
    }

    public void inDS() {
        System.out.println("Noi dung danh sach:\n====>");
        Node p = head;
        while (p != null) {
            System.out.print(p);
            p = p.next;
        }
        System.out.println(" null\n");
    }
//Có thể áp dụng thuật toán duyệt để in danh sách, đếm số phần tử trong danh sách, tìm kiếm…   

    public int dem() {
        int temp = 0;
        Node p = head;
        while (p != null) {
            temp++;
            p = p.next;
        }
        return temp;
    }

    public int tong() {
        int sum = 0;
        Node p = head;
        while (p != null) {
            sum += p.data;
            p = p.next;
        }
        return sum;
    }

    public int demLe() {
        int temp = 0;
        Node p = head;
        while (p != null) {
            if (p.data % 2 != 0) {
                temp++;
            }
            p = p.next;
        }
        return temp;
    }

    public int soLonNhat() {
        Node p = head;
        int max = 0;

        // nếu hàm rỗng trả về 0
        if (head == null) {
            return 0;
        }
        while (p != null) {
            if (p.data > max) {
                max = p.data;
            }
            p = p.next;
        }
        return max;
    }

    public boolean timX(int x) {
        Node p = head;
        while (p != null) {
            if (p.data == x) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public int inPhanTuCuoi() {
        Node p = head;
        while (p != null) {
            //p.next == null : p
            if (p.next == null) {
                return p.data;
            }
            p = p.next;
        }
        return 0;
    }

    public void nhapDS() {
        head = null;
        int x;
        Node cuoi = null;
        while (true) {
            System.out.println("Nhap phan tu: (Nhap 0 de dung lai)");
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            Node t = new Node(x);
            if (head == null) {
                head = cuoi = t;
            } else {
                cuoi.next = t;
                cuoi = t;
            }
        }
    }

    // Thêm X vào cuối danh sách 
    public void themCuoi(int x) {
        Node t = new Node(x);
        Node p = head;
        if (head == null) {
            head = t;
        } else {
            while (p.next != null) {
                p = p.next;

            }
            p.next = t;
        }

    }

    //Chèn 
    public void chen(int x, int k) {
        Node p = head;
        if (k < 1) {
            System.out.println("Vi tri chen khong hop le!");
        } else {
            if (k == 1) {
                head = new Node(x, head); //chèn vào đầu danh sách 
            } else {
                int vitri = 1;
                while (p != null && vitri < k - 1) {
                    p = p.next;
                    vitri++;
                }
                if (p == null) {
                    System.out.println("vi tri chen khong hop le!");
                } else {
                    Node t = new Node(x, p.next);
                    p.next = t;
                }
            }
        }
    }

    public void xoaDau() {
        if (head == null) {
            return;
        } else {
            head = head.next;
        }
    }

    public void xoaCuoi() {
        Node p = head;
        while (p != null) {
            if (p.next.next == null) {
                p.next = null;
            }
            p = p.next;
        }
    }

    public void xoaPhanTu(int k) {
        if (head == null || k <= 0) {
            return;
        }
        //nếu k = 1 thì xoa phần tử đầu 
        if (k == 1) {
            head = head.next;
            return;
        }
        Node p = head;
        //duyệt mảng đến vị trí k - 1
        for (int i = 1; p != null && i < (k - 1); i++) {
            p = p.next;
        }
        //mảng đang ở vị trí k - 1
        //nếu phần tử hiện tại khác null hoặc phần tử tiếp theo khác null 
        if (p != null || p.next != null) {
            //thì phần tử tiếp theo sẽ bằng phần tử tiếp theo + 1
            p.next = p.next.next;
        }
    }

    public void daoDS() {
        Node p = head;
        //cho biến tạm bằng null
        Node temp = null;
        
        while (p != null) {
            //lưu phần tử tiếp theo
            Node saveNext = p.next;
            
            //Đảo chiều liên kết, trỏ về node trước đó
            p.next = temp;
            
            //Di chuyển temp lên node hiện tại
            temp = p;
            
            //Di chuyển p lên node tiếp theo
            p = saveNext;
        }
        //Cập nhật lại head, vì temp chính là node cuối cùng sau khi đảo ngược

        head = temp;
    }
    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mySingleLinkedList l = new mySingleLinkedList();
//        System.out.println("XONG");
//        l.add(3);
//        l.add(2);
//        l.add(7);
//        l.add(6);
//        l.add(9);
//        l.add(8);
//        l.show();
//        System.out.println("So phan tu: " + l.dem());
//        System.out.println("Tong cac phan tu : " + l.tong());
//        System.out.println("So phan tu le: " + l.demLe());
//        System.out.println("Phan tu lon nhat: " + l.soLonNhat());
//        System.out.println("Nhap phan tu muon tim: ");
//        int x = sc.nextInt();
//        System.out.println("Phan tu co trong mang: " + l.timX(x));
//        System.out.println("Phan tu cuoi cung: " + l.inPhanTuCuoi());
        l.nhapDS();
//        l.themCuoi(100);
//        l.chen(100, 3);
//        l.xoaDau();
//        l.xoaCuoi();
//        System.out.print("nhap vi tri muon xoa: ");
//        int k = sc.nextInt();
//        l.xoaPhanTu(k);
        l.daoDS();
        l.inDS();
    }
}
