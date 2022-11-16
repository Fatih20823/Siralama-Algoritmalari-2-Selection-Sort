package com.main;

public class Application {

	public static void main(String[] args) {
//		int [] dizi = new int[1000];
//		int counter=0;
//		int change;
//		for (int i = 0; i < dizi.length; i++) {
//			dizi[i] =(int) (Math.random()*21);
//		}
//		for (int j = 0; j < dizi.length; j++) {
//			for (int k = 0; k < dizi.length; k++) {
//				if(dizi[j]<dizi[k]) {                NOT: 1.000.000 KEZ YER DEGISTIRME YAPILIYOR EN KUCUGU BULMAK ICIN 
//					change = dizi[k];
//					dizi[k]=dizi[j];
//					dizi[j]=change;
//				}
//				counter++;
//			}		
//		}
////		for (int e = 0; e < dizi.length; e++) {
////			System.out.printf("%3d",dizi[e]);
////		}
//		System.out.printf("%,d",counter);
		int counter = 0;
		int[] dizi = new int[1000];
		for (int i = 0; i < dizi.length; i++) dizi[i] = (int) (Math.random()*21);
		
		for (int i = 0; i < dizi.length;i++) {           // NOT :499.500 KEZ YER DEGISTIRME YAPILMISTIR EN KUCUGU BULMAK ICIN 
			int enKucuk=dizi[i],enKucukyeri=i;
			for(int j = i+1; j < dizi.length;j++) {
				if(dizi[j]<enKucuk) {
					enKucuk = dizi[j];
					enKucukyeri = j;							
				}
				counter++;
			}
			int temp = dizi[i];
			dizi[i] = dizi[enKucukyeri];
			dizi[enKucukyeri] = temp;									
		}
		System.out.printf("%,d",counter);
	}
}
