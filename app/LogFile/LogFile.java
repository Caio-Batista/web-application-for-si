package LogFile;

import java.io.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LogFile{

    public static void writeInLog(String log){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        FileWriter fstream;
        BufferedWriter bw;
        PrintWriter out;
        try{
            fstream = new FileWriter("logFile.txt", true);
            bw = new BufferedWriter(fstream);
            out = new PrintWriter(bw);
            out.println(log +"  -  "+ dateFormat.format(date));

            out.close();

        } catch (Exception e){}
    }


}