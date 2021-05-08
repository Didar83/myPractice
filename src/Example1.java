import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) throws IOException {
        int[] nums = {-1, 2, 3, -4, 5, 6, -7, 8};
        // i++
        // i += 2
        // i = i + 1
        /*
        List<Integer> list = new ArrayList<>();
        list.add(77);
        list.add(779);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(95);
        list.add(0);
        list.add(22);


        for(int i = 0; i < list.size(); i++){
            if (list.get(i) == 0) {
                list.remove(i--);
            }
        }
        System.out.println(list);


        String text = "application split text template";
        int i = 0;
        for(; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                break;
            }
        }
        String result = text.substring(0, i);
        System.out.println(result);

        int j = text.length()-1;
        for(; j > 0; j--){
            if(text.charAt(j) == ' '){
                break;
            }
        }
        String result2 = text.substring(j+1);
        System.out.println(result2);


        text = "application split application text template";
        String word = "application";

        int result3 = 0;
        int pos = text.indexOf(word);
        while (pos != -1){
            pos = text.indexOf(word, pos+1);
            result3++;
        }
        System.out.println(result3);
        */

//        int[] n1 = {
//                1, 2, 3, 77, 66, 55
//        };
//        int[] n2 = {
//                33, 22, 4, 5
//        };
        // Создать новый массив (n3) из первой половины первого (n1) и второй половины второго (n2)
        // int[] n3 = ?;


//        FileWriter fileWriter = new FileWriter("testText.txt");
//        String text3 = "dfdfg";
//        fileWriter.write(text3);
//        FileReader fileReader = new FileReader("testText.txt");

        String str = "77 5 3 -9 40 -28";

//        String[] strArray = str.split("\\s");
//        int result = 0;
//        for (String s : strArray) {
//            result += Integer.parseInt(s);
//        }
//        System.out.println(result);
        /*
        int result = 0;
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            result += Integer.parseInt(matcher.group());
        }
        System.out.println(result);
        */
        /*
        String phone = "+7 (707) 282-86-89";
        boolean result = phone.matches("\\+\\d\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}");
        System.out.println(result);
        */
        /*
        String date1 = "15/1/2017 13:17:";
        String date2 = "15/1/2017 13:17:55";
        boolean result = date1.matches("\\d{2}/\\d/\\d{4}\\s\\d{2}:\\d{2}(:\\d{2})?");
        System.out.println(result);
        */
        /*
        String login = "zzzzz";
        boolean result = login.matches("^[a-zA-Z_][a-zA-Z_\\d]{4,}");
        System.out.println(result);
        */
        /*
        String code = "Z789321UA";
        Pattern pattern = Pattern.compile("^Z(\\d{6})([A-Z]{2})$");
        Matcher matcher = pattern.matcher(code);
        if (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        */

        /*
        String path = "https://vk.com/ylix9g/messages";
        ParseUrl parser = new ParseUrl(path);
        String protocol = parser.getProtocol(); // https
        String host = parser.getHost(); // vk.com
        String uri = parser.getUri(); // ylix9g/messages
        System.out.println(protocol);
        System.out.println(host);
        System.out.println(uri);
        */

        /*
        boolean result = FileUtil.contains("file.txt", "file with");
        System.out.println(result);
        */
    }
}
