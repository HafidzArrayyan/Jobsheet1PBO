/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Lenovo
 */
public class PerulanganHuruf {
    public static void main(String[] args) {
        H();
        System.out.println("");
        segitiga();
        Z();
    }
    public static void H(){
int x,y;
for(x=1;x<=4;x++){

for(y=1;y<=4;y++){
if(x==1||y==1||y==4||x==4){
System.out.print("@");
}
else
System.out.print(" ");
}
System.out.println(" ");
}
}
    public static void segitiga(){
int r1,j;
for (r1 = 0; r1 < 4; r1++) {
System.out.print("@");

int ar;
for (ar = 0; ar < r1; ar++) { System.out.print("@"); }
System.out.println(" "); }//d atas for (int j = 1; j > 0; j--) {
System.out.print(" ");
for (int j2 = 1; j2 > 0; j2--) {
System.out.print(" ");
}
System.out.println(" ");
for (int d = 0; d < 4; d++) {
System.out.print(" ");
}//d bawah
System.out.println(" ");
    }
    public static void Z(){
     
int zx = 4;
for (int z = 0; z < 5; z++) {
System.out.print("@");
}
System.out.println("");
System.out.println("   @");
System.out.println("  @");
System.out.println(" @");
for (int z = 0; z < 5; z++) {
System.out.print("@");
}
System.out.println("");
    }
}
