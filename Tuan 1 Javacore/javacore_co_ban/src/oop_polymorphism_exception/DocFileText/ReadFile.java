package oop_polymorphism_exception.DocFileText;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        String filename = "dssv.txt";
        try{
            readFile(filename);
        } catch (FileProcessingException e){
            System.err.println("Loi khi doc file: " + e.getMessage());
        } finally {
            System.out.println("Chuong trinh ket thuc !");
        }
    }
    public static void readFile(String filename) throws FileProcessingException{
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            throw new FileProcessingException("File khong ton tai "+filename);
        } catch (IOException e){
            throw new FileProcessingException("Khong the doc file"+filename);
        } catch (Exception e){
            throw new FileProcessingException("Loi khong xac dinh");
        }
    }
}
