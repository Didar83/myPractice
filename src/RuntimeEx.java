import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RuntimeEx {
    public static void main(String[] args) throws IOException {
//        int[] n1 = {
//                1, 2, 3, 77, 66, 55
//        };
//
//        int[] n2 = {
//                33, 22, 4, 5
//        };
//
//        int[] n3 = new int[n1.length/2 + n2.length/2];
//
//        System.arraycopy(n1, 0, n3, 0, n1.length/2);
//        System.arraycopy(n2, n2.length/2, n3, n1.length/2, n2.length/2);
//        System.out.println(Arrays.toString(n3));

//        int j = 0;
//        for(int i = 0; i < n1.length/2; i++) {
//            n3[j] = n1[i];
//            j++;
//        }
//        for(int i = n2.length/2; i < n2.length; i++){
//            n3[j] = n2[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(n3));

//    String path = "https://vk.com/ylix9g/messages";
//    ParseUrl parser = new ParseUrl(path);
//
//    String protocol = parser.getProtocol(); //https
//    String host = parser.getHost(); //vk.com
//    String uri = parser.getUri(); // ylix9g/messages
//
//    System.out.println("Protocol = "+protocol+", Host = "+host+", Uri = "+uri);

        FileReader fileReader1 = new FileReader("nums1.txt");
        FileReader fileReader2 = new FileReader("nums2.txt");
        FileWriter fileWriter = new FileWriter("result.txt");
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int num1=0, num2=0, result = 0;
        String currStr1="", currStr2="";

        while ((currStr1 = bufferedReader1.readLine()) != null | (currStr2 = bufferedReader2.readLine()) != null) {
            if (currStr1 == null || currStr1.isEmpty()) {
                num1 = 0;
            } else {
                try{
                    num1 = Integer.parseInt(currStr1);
                } catch (NumberFormatException e){
                    System.out.println("error");
                    bufferedWriter.write( "error \n");
                    continue;
                }
            }
            if (currStr2 == null || currStr2.isEmpty()) {
                num2 = 0;
            } else {
                try{
                    num2 = Integer.parseInt(currStr2);
                } catch (NumberFormatException e){
                    System.out.println("error");
                    bufferedWriter.write( "error \n");
                    continue;
                }
            }
            result = num1 + num2;
            System.out.println(result);
            bufferedWriter.write(result + "\n");
        }
        bufferedWriter.close();
    }
}
