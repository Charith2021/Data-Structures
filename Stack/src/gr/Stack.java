package gr;

public class Stack {

       private  int[] numbers;
    public void push(int number) {
        if(numbers==null){
           numbers=new int[1];
           numbers[0]=number;
        }else {
            int[] temp=new int[numbers.length+1];
            for(int i=0;i<numbers.length;i++){
                temp[i]=numbers[i];
            }
            temp[temp.length-1]=number;
            numbers=temp;
        }
    }


    public void print() {
    }
}



