import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day1 {

    public static void main(String [ ] args){
        int count = 0;
        int num;
        ArrayList<Integer> cs= new ArrayList<Integer>();
        ArrayList<Integer> nums= new ArrayList<Integer>();
        cs.add(count);
        BufferedReader reader;
        int done = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\school\\IdeaProjects\\Advent of Code 2018\\src\\Day1info.txt"));
            String line = reader.readLine();

            while(line != null){
                num = Integer.parseInt(line);
                nums.add(num);
                line = reader.readLine();
            }

        } catch (IOException e){
            e.printStackTrace();
        }

        while (done == 0) {

            for(Integer n : nums){
                count += n;


                if (cs.contains(count)) {
                    System.out.println(count);
                    done = 1;
                    break;
                }
                else{
                    cs.add(count);
                }
            }

        }
    }

}
