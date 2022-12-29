package hw4.main.java.services;

public static int[] multiplyArrays(int[] a, int[] b){
    //turns arrays into integers
    String num1 = "";
    for (int i = a.length - 1; i > -1; i--){
        num1 += a[i];
    }

    String num2 = "";
    for (int i = b.length - 1; i > -1; i--){
        num2 += b[i];
    }

    //does calculation
    char[] answer = Integer.toString(Integer.parseInt(num1) * Integer.parseInt(num2)).toCharArray();

    //converts char array into int array
    int[] answer2 = new int[answer.length];

    for (int i = 0; i < answer.length; i++){
        answer2[answer.length - i - 1] = Integer.parseInt(String.valueOf(answer[i]));
    }

    return answer2;
}
