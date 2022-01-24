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

    public final int noFPackets = 4;
    public final int firstReplyIndex = 2;

    public void ping(String command) throws IOException {
        ArrayList<String> output = new ArrayList<>();
        String line;
        Process p = Runtime.getRuntime().exec(command);
        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((line = input.readLine()) != null) {
            output.add(line);
        }
        input.close();

        ArrayList<String> replies = new ArrayList<>();

        for (int ReplyIndex = this.firstReplyIndex; ReplyIndex < 2 + noFPackets; ReplyIndex++) {
            replies.add(output.get(ReplyIndex));
            System.out.println(output.get(ReplyIndex));
        }
        findMedian(replies);
    }

    void findMedian(ArrayList<String> replies){
        ArrayList<Integer> times = new ArrayList<>();

        for(String reply:replies)
        {
            Pattern pattern = Pattern.compile("time=[0-9]*");
            Matcher m = pattern.matcher(reply);
            if(m.find())
            {
                String timestamp = m.group();
                String timeInMs = timestamp.substring(5);
                times.add(Integer.parseInt(timeInMs));
            }
        }

        Collections.sort(times);
        double median = (times.get(1)+times.get(2))/(2.0);
        System.out.println("\nMedian time for the response is "+median );

    }

    public static void main(String args[]) throws IOException
    {
        Ping p = new Ping();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ip address");
        String ip = sc.nextLine();
        String command = "ping " + ip;
        p.ping(command);

    }
}
