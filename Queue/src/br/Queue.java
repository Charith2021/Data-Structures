package br;

public class Queue {

    int[] numbers;

    public void enqueue(int number) {
        if (numbers == null) {
            numbers = new int[1];
            numbers[0] = number;
        } else {
            int[] temp = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length - 1] = number;
            numbers = temp;
        }
    }





    public boolean empty() {
        return numbers == null;
    }


    public void print() {
        if (empty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println("\b\b]");
    }

}
