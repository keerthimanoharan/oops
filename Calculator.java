package org.college;

public class Calculator {
	static int x=10;
	static int y=30;
	public void add(int x, int y) {
		System.out.println("the addition of two numbers is:"+(x+y));
	}
	static float x1=2.3f;
	static float y1=5.66f;
	public void add(float x1, float y1) {
		System.out.println("the addition is:"+(x1+y1));
	}
	static long x2=2586445l;
	static long y2=157354l;
	public void add(long x2, long y2) {
		System.out.println("the addition is:"+(x2+y2));
		}
	static short c=525;
	static short d=200;
	public void add(short c, int d) {
		System.out.println("the addition is:"+(c+d));
	}
	public static void main(String[] args) {
		Calculator addition=new Calculator();
		addition.add(x, y);
		addition.add(x1, y1);
		addition.add(x2, y2);
		addition.add(c, d);
	}}
