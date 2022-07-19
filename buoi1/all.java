/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn.java;

import java.util.Scanner;


public class BTVNJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 1");
        System.out.println("Nhap thang sinh: ");
        int thang = input.nextInt();
        while (thang> 12 || thang <1)
        {
            System.out.println("Nhap lai thang sinh: ");
            thang = input.nextInt();
        }
        System.out.print("Nhap ngay sinh: ");
        int ngaysinh = input.nextInt();
        switch(thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: while(ngaysinh<1 || ngaysinh>31)
            {
                System.out.print("Nhap lai ngay sinh: ");
                ngaysinh = input.nextInt();
            }break;
            case 2:
            case 4:
            case 6:
            case 9:
            case 11:while(ngaysinh<1 || ngaysinh>30)
            {
                System.out.print("Nhap lai ngay sinh: ");
                ngaysinh = input.nextInt();
            }break;
        }
        if(thang==1)
        {
            if(ngaysinh>=20) System.out.println("Bao Binh");
            else System.out.println("Ma Ket");
        }
        else if(thang==2)
        {
            if(ngaysinh<=18) System.out.println("Bao Binh");
            else System.out.println("Song Ngu");
        }
        else if(thang==3)
        {
            if(ngaysinh>=19) System.out.println("Bach Duong");
            else System.out.println("Song Ngu");
        }
        else if(thang ==4)
        {
            if(ngaysinh<=20) System.out.println("Bach Duong");
            else System.out.println("Kim Nguu");
        }
        else if(thang ==5)
        {
            if(ngaysinh<=20) System.out.println("Kim Nguu");
            else System.out.println("Song Tu");
        }
        else if(thang==6)
        {
            if(ngaysinh<=21) System.out.println("Song Tu");
            else System.out.println("Cu Giai");
        }
        else if(thang ==7)
        {
            if(ngaysinh<=22) System.out.println("Cu Giai");
            else System.out.println("Su Tu");
        }
        else if(thang ==8)
        {
            if(ngaysinh<=22) System.out.println("Su Tu");
            else System.out.println("Xu Nu");
        }
        else if(thang ==9)
        {
            if(ngaysinh<=22) System.out.println("Xu Nu");
            else System.out.println("Thien Binh");
        }
        else if(thang ==10)
        {
            if(ngaysinh<=23) System.out.println("Thien Binh");
            else System.out.println("Bo Cap");
        }
        else if(thang ==11)
        {
            if(ngaysinh<=22) System.out.println("Bo Cap");
            else System.out.println("Nhan Ma");
        }
        else if(thang ==12)
        {
            if(ngaysinh<=21) System.out.println("Nhan Ma");
            else System.out.println("Ma Ket");
        }
        System.out.println("Bai 2");
        int a,b,c;
        System.out.print("Nhap canh a = ");
        a = input.nextInt();
        System.out.print("Nhap canh b = ");
        b = input.nextInt();
        System.out.print("Nhap canh c = ");
        c = input.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a)
        {
            System.out.println("Day khong phai la mot tam giac");
        }
        else{
            if(a*a+b*b== c*c || c*c+b*b== a*a || a*a+c*c==b*b) System.out.println("Day la tam giac vuong");
            else if(a==b || b==c || a==c) System.out.println("Day la mot tam giac can");
            else if(a==b && a==c) System.out.println("Day la mot tam giac deu");
            else System.out.println("Day la mot tam giac thuong");
        } 
        System.out.println("Bai 3");
        System.out.println("Nhap N: ");
        int n = input.nextInt();
        int sum=0;
        for(int i=1 ; i<=n ;i++)
        {
            if(n % i==0) sum=sum+i;
        }
        System.out.println("Tong cac gia tri la uoc chung cua " + n + " la: "+sum);
        
    }
    
}
