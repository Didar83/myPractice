import java.io.*;

public class SumTwoNums {
    public static void main(String[] args) throws IOException {
        FileReader fileReader1 = new FileReader("nums1.txt");
        FileReader fileReader2 = new FileReader("nums2.txt");
        FileWriter fileWriter = new FileWriter("result.txt");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int num1;
        int num2;
        String currStr1;
        String currStr2;
        int result = 0;

        while ((currStr1 = bufferedReader1.readLine()) != null | (currStr2 = bufferedReader2.readLine()) != null) {
            if ((currStr1 != null && !currStr1.matches("\\d*")) || (currStr2 != null && !currStr2.matches("\\d*"))) {
                bufferedWriter.write("error\n");
                continue;
            }
            if (currStr1 == null || currStr1.isEmpty()) {
                num1 = 0;
            } else {
                num1 = Integer.parseInt(currStr1);
            }
            if (currStr2 == null || currStr2.isEmpty()) {
                num2 = 0;
            } else {
                num2 = Integer.parseInt(currStr2);
            }
            result = num1 + num2;
            System.out.println(result);
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.close();

    }
}
