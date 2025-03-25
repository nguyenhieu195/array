/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author hieuvannguyen
 */
//hieu dep trai
class Mang {

    public static Scanner sc = new Scanner(System.in);

    public static void Add(ArrayList<Integer> list) {
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = i + 1;
            list.add(x);
        }
    }

    public static void Show(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void kiemTraSoNguyenTo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            boolean check = num > 1; //mặc định true nếu num > 1; false nếu num <= 1
            if (num > 2 && num % 2 == 0) {
                check = false;
            } else {
                for (int j = 2; j < num && check; j++) { //bỏ qua các số false 
                    if (num % j == 0) {
                        check = false;
                    }
                }
                if (check) {
                    System.out.print(num + " ");
                }
            }
        }
    }

    public boolean SNT(int x) {
        if (x < 2) {
            return false;
        }
        if (x > 2 && x % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i < x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void sangEratosthenes(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        // Tìm số lớn nhất trong danh sách để làm giới hạn cho sàng nguyên tố
        int max = Collections.max(list);
        if (max < 2) {
            System.out.println("Khong co so nguyen to trong danh sach.");
            return;
        }

        // Tạo mảng Boolean đánh dấu số nguyên tố
        boolean[] isPrime = new boolean[max + 1];

        // Mặc định tất cả số từ 2 đến max là nguyên tố
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        // Sàng Eratosthenes
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // In các số nguyên tố có trong danh sách
        System.out.print("Cac so nguyen to trong danh sach: ");
        boolean hasPrime = false;
        for (int num : list) {
            if (num >= 2 && isPrime[num]) {
                System.out.print(num + " ");
                hasPrime = true;
            }
        }
        if (!hasPrime) {
            System.out.println("Khong co so nguyen to.");
        } else {
            System.out.println();
        }
    }

    // BÀI 2: Đọc file, sắp xếp từ theo thứ tự từ điển và ghi ra file
    public void processFile(String inputFile, String outputFile) {
        ArrayList<String> words = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(inputFile))) {
            while (fileScanner.hasNext()) {
                words.add(fileScanner.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Loi: Khong tim thay file " + inputFile);
            return;
        }

        // Sắp xếp từ theo thứ tự từ điển
        Collections.sort(words);

        // Ghi danh sách đã sắp xếp vào file F_out.txt
        try (PrintWriter writer = new PrintWriter(new File(outputFile))) {
            for (String word : words) {
                writer.println(word);
            }
        } catch (IOException e) {
            System.out.println("Loi: Khong the ghi file " + outputFile);
        }

        System.out.println("Da sap xep va ghi ket qua vao " + outputFile);
    }
}

class docFile {

}

public class araylist {

    public static void main(String[] args) {
        Mang m = new Mang();

        ArrayList<Integer> list = new ArrayList<>();
//        m.Add(list);
//        m.Show(list);
//        m.kiemTraSoNguyenTo(list);
//        m.lietKeSoNguyenTo(list);
//        m.sangEratosthenes(list);
        m.processFile("f_in.txt", "f_out.txt");
    }
}
