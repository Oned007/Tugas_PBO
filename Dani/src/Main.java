import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public void refresh(){

    }
    public static void main(String[] args)throws IOException {

        BufferedReader reader;
        Scanner input = new Scanner(System.in);
        Node [] arr = new Node[100];
        int idx = 0;
        int pilih = 0;
        String lokasifile = "C:/Users/Dani/IdeaProjects/Dani/src/Data.txt";
        boolean terus = true;
//        File myFile = new File("C:/Users/Dani/IdeaProjects/Dani/src/Data.txt");
        try {
            reader = new BufferedReader(new FileReader("C:/Users/Dani/IdeaProjects/Dani/src/Data.txt"));
            String line = reader.readLine();


            while (line != null) {

                //                System.out.println(line);
                // read next line
                String[] parts = line.split(";");
                String nim = parts[0]; // 004
                String nama = parts[1]; // 034556
                String email = parts[2];
                String nohp = parts[3];
                arr[idx] = new Node(nim,nama,email,nohp);
                idx++;
//                System.out.println("NIM : "+nim);
//                System.out.println("Nama: "+nama);
//                System.out.println("Email: "+email);
//                System.out.println("No HP: "+nohp);
//                System.out.println();
                line = reader.readLine();
            }

            reader.close();
//            for (int i=0;i<idx;i++){
//                arr[i].printall();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (terus){
                System.out.println("1. Tambah data ");
                System.out.println("2. Lihat data");
                System.out.println("3. Edit data");
                System.out.println("4. Hapus data");
                System.out.println("5. Exit");
                System.out.println("6. Simpan");
            System.out.print("Masukkan Pilihan : ");
                pilih  = input.nextInt();

                if (pilih == 3){
                    System.out.println("Masukkan nim yang ingin diedit : ");

                }

                if (pilih == 4){
                    System.out.println("Masukkan nim yang ingin di hapus : ");
                    String in_nim = input.nextLine();
                    in_nim = input.nextLine();

                    File file = new File(lokasifile);
                    FileWriter fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);



                    for (int i =0; i < idx;i++){
                        if (arr[i].getNim().equals(in_nim)){
                            System.out.println("Data ditemukan");
                        }
                        else{
                            bw.write(arr[i].getNim()+";"+arr[i].getNama()+";"+arr[i].getEmail()+";"+arr[i].getNohp()+"\n");
                        }
                    }
                    bw.close();
                    idx=0;

                    try {
                        reader = new BufferedReader(new FileReader("C:/Users/Dani/IdeaProjects/Dani/src/Data.txt"));
                        String line = reader.readLine();


                        while (line != null) {


                            String[] parts = line.split(";");
                            String nim2 = parts[0]; // 004
                            String nama2 = parts[1]; // 034556
                            String email2 = parts[2];
                            String nohp2 = parts[3];
                            arr[idx] = new Node(nim2,nama2,email2,nohp2);
                            idx++;
//
                            line = reader.readLine();
                        }

                        reader.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                if (pilih == 5){
                    break;
                }
                if (pilih == 2){
                    for (int i=0;i<idx;i++){
                        arr[i].printall();
                    }
                    System.out.println();

                }
                if (pilih == 1){
                    System.out.print("Masukkan nama   : ");
                    String nama = input.nextLine();
                    nama = input.nextLine();
                    System.out.print("Masukkan nim    : ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan email  : ");
                    String email = input.nextLine();
                    System.out.print("Masukkan nomor HP :");
                    String noHP = input.nextLine();
                    File file = new File(lokasifile);
                    FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(nim+";"+nama+";"+email+";"+noHP+"\n");
                    bw.close();


                    try {
                        reader = new BufferedReader(new FileReader("C:/Users/Dani/IdeaProjects/Dani/src/Data.txt"));
                        String line = reader.readLine();


                        while (line != null) {


                            String[] parts = line.split(";");
                            String nim2 = parts[0]; // 004
                            String nama2 = parts[1]; // 034556
                            String email2 = parts[2];
                            String nohp2 = parts[3];
                            arr[idx] = new Node(nim2,nama2,email2,nohp2);
                            idx++;
//
                            line = reader.readLine();
                        }

                        reader.close();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

        }

    }
}