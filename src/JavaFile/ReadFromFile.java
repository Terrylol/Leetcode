package JavaFile;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogReader;

import javax.swing.text.Document;
import java.io.*;

/**
 * Created by 95232 on 2017/4/22.
 */
public class ReadFromFile {
    public static void ReadFileByBytes(String filename){
        File file = new File(filename);
        InputStream in = null ;
        try {
            System.out.println("yici duqu yige zijie");
            in = new FileInputStream(file);
            int tempbyte;
            while ((tempbyte = in.read()) != -1){
                System.out.println(tempbyte);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
    }
    //读文件
    public static String FileInputStreamDemo(String path)throws IOException{
        File file = new File(path);
        if(!file.exists()||file.isDirectory())throw new FileNotFoundException();
        FileInputStream fls = new FileInputStream(file);
        byte[] buf = new byte[1024];
        StringBuffer sb = new StringBuffer();
        while (fls.read(buf)!=-1){
            sb.append(new String(buf));
            buf = new byte[1024];
        }
        return sb.toString();
    }

    public static String BufferedReaderDemo(String path)throws IOException{
        File file =new File(path);
        if(!file.exists()||file.isDirectory())throw new FileNotFoundException();
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String temp = null;
        StringBuffer sb = new StringBuffer();
        temp = bf.readLine();
        while (temp!=null){
            sb.append(temp);
            temp = bf.readLine();
        }
        return sb.toString();
    }

    //利用dom4j读取xml文件

    //创建文件夹
    public static void CreateDir(String path){
        File file = new File(path);
        if(!file.exists()) file.mkdir();
    }
    public static void CreateFile(String path) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
    }
    //delete file
    public static void DelFile(String path){
        File file = new File(path);
        if(file.exists() &&file.isFile())file.delete();
    }
    //delete DIR
    public static void DelDir(String path){
        File dir = new File(path);
        if(dir.exists()){
            File[] tmp =dir.listFiles();
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].isDirectory()){
                    DelDir(path+"/"+tmp[i].getName());
                }
                else {
                    tmp[i].delete();
                }
            }
            dir.delete();
        }
    }

    //获得控制台用户输入的信息
    public static void getInputMessage()throws IOException{
        System.out.println("Input SomeThing");
        byte[] buf = new byte[1024];
        int count = System.in.read(buf);
        byte[] by = new byte[count];
        System.arraycopy(buf,0,by,0,count);
        String str = new String(by);
        System.out.println(str);
        return ;
    }

    //利用StringBuffer写文件
    public static void StringBufferDemo(){
        try {
            FileOutputStream out = new FileOutputStream("name.txt");
            File file = new File("name");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            getInputMessage();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
