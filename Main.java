package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<DaftarMusik> listPlayer = new LinkedList<>();
        Scanner input = new Scanner(System.in);

        String musik;
        String vokalis;
        int pilih = 0;

        while(pilih != 4){
            System.out.println("1. Input Music");
            System.out.println("2. Remove Music");
            System.out.println("3. Play Music");
            System.out.println("4. Exit");
            ListIterator<DaftarMusik> iterator = listPlayer.listIterator();
            pilih = input.nextInt();
            if(pilih == 1){
                System.out.println("Input Music and Vokalis :");
                musik = input.next();
                vokalis = input.next();
                listPlayer.add(new DaftarMusik(musik, vokalis));
            }
            else if(pilih == 2){
                System.out.println("Input Option Remove");
                System.out.println("1. Remove Last Added Music");
                System.out.println("2. Remove Music By Name");
                int opsi = input.nextInt();
                if(opsi == 2){
                    ListIterator<DaftarMusik> iter = listPlayer.listIterator();
                    System.out.println("Input Music");
                    String nama = input.next();
                    while (iter.hasNext()) {
                        DaftarMusik ob = iter.next();
                        if(ob.nama().equals(nama)) {
                            iter.remove();
                        }
                    }
                }
                else if(opsi == 1){
                    listPlayer.removeLast();
                }
            }
            else if(pilih == 3){
                System.out.println("List lagu");
                while (iterator.hasNext()){
                    System.out.println(iterator.next());
                }
                while (iterator.hasPrevious()){
                    System.out.println(iterator.previous());
                }
            }
        }
    }
}