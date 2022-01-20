package com.JavaAssignment.assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.Runtime;
import java.util.regex.*;

public class Ping {

    public final int no_of_packets = 4;
    public final int first_reply_index = 2;

    public void ping(String cmnd) throws IOException
    {
        ArrayList<String> output = new ArrayList<>();
        String line;
        Process p = Runtime.getRuntime().exec(cmnd);
        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while((line=input.readLine())!=null) {
            System.out.println(line);
            output.add(line);
        }
        input.close();

        ArrayList<String> replies = new ArrayList<>();

        for (int reply_line_index = first_reply_index; reply_line_index < 2 + no_of_packets; reply_line_index++) {
            replies.add(output.get(reply_line_index));
            System.out.println(output.get(reply_line_index));
        }

        ArrayList<Integer> times = new ArrayList<>();

        for(String reply:replies)
        {
            Pattern pattern = Pattern.compile("time=[0-9]*");
            Matcher m = pattern.matcher(reply);
            if(m.find())
            {
                String timestamp = m.group();
                String time_in_ms = timestamp.substring(5);
                times.add(Integer.parseInt(time_in_ms));
            }
        }

        for(int t:times)
            System.out.println(t);

        Collections.sort(times);
        double median = (times.get(1)+times.get(2))/(2.0);
        System.out.println("Median time for the response is "+median );

    }

    public static void main(String args[]) throws IOException
    {
        Ping p = new Ping();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ip address");
        String ip = sc.nextLine();
        String cmnd = "ping " + ip;
        p.ping(cmnd);

    }
}
