package main;

public class Main{

public static void main(String[] args){

int[] numbers = new int[11];

System.out.print("{");

for(int i = 1; i < numbers.length; i++) {
	
	if (i < numbers.length - 1) {
        System.out.print(i + ", ");
    } else {
        System.out.print(i);
    }
}

System.out.print("}");
}}
