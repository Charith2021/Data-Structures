package ds;

 class Queue {

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

    public void dequeue(){
        if (numbers == null){
            System.err.println("Can't pop from empty array");
            return;
        }else if (numbers.length == 1){
            numbers = null;
            return;
        }
        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i+1];
        }
        numbers = temp;
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


    public int peek(){
        if (empty()){
            System.err.println("Stack is empty");
        }
        return numbers[0];
    }

    public boolean contains(int number) {
        if (empty()) {
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;

    }

}

public class Deque extends Queue {


        enqueueRear(){


        }


    }


   }
}
