package eom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;


/**

 查找和排序
 题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
       都按先录入排列在前的规则处理。
    例示：
    jack      70
    peter     96
    Tom       70
    smith     67
    从高到低  成绩            
    peter     96    
    jack      70    
    Tom       70    
    smith     67    
    从低到高
    smith     67  
    Tom       70    
    jack      70    
    peter     96    
 输入描述:
 输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，以一个空格隔开

 输出描述:
 按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 **/



public class gradesort {

    void sort(String[] name ,int [] math ,int flagTrue ){
        //使用冒泡排序
        int temp;
        String string;
        for (int i=0;i<math.length-1;i++) {
            for (int j = 0; j < math.length - i - 1; j++) {
                if (flagTrue == 0) { //标志为0，则降序排列
                    if (math[j] < math[j + 1]) {
                        temp = math[j];
                        math[j] = math[j + 1];
                        math[j + 1] = temp;

                        string = name[j];
                        name[j] = name[j + 1];
                        name[j + 1] = string;
                    } else {
                        if (math[j] > math[j + 1]) {
                            temp = math[j];
                            math[j] = math[j + 1];
                            math[j + 1] = temp;

                            string = name[j];
                            name[j] = name[j + 1];
                            name[j + 1] = string;
                        }
                    }
                }
            }
        }
            for (int i=0;i<name.length;i++){
                System.out.println(name[i]+" "+math[i]);
        }
    }
    public void extuce() throws IOException {
        int num=0;
        int flag=0;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String string;

        while ((string=bufferedReader.readLine())!=null){
            num=Integer.valueOf(string);
            flag=Integer.valueOf(bufferedReader.readLine());

            String[] name =new String[num];
            int[] math=new int[num];

            for (int i=0;i<num;i++){
                String t=bufferedReader.readLine();
                String[] temp=t.split(" ");
                name[i]=temp[0];
                math[i]=Integer.valueOf(temp[1]);
            }
            sort(name,math,flag);
        }
    }
    public static void main(String[] args) throws IOException {
        gradesort gradesort=new gradesort();
        gradesort.extuce();

    }
}
