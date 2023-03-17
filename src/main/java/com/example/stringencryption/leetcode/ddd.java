package com.example.stringencryption.leetcode;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ddd {

    public static void main(String[] args) {
       String[] d= new String[] {"09:00-11:00 Meeting with Mike"," 11:00-12:00 Event:Soft Skills to Drive Business",};
       List<String> values=new ArrayList<String>();
       for (String data:d){
           if (data!=null){
               values.add(data);
           }
       }
       String[] target=values.toArray(new String[values.size()]);
       prioritizedEvents(d);
    }

    public static String prioritizedEvents( String[] events ) {

        LocalTime [][] eventsTime = new LocalTime[events.length][2];
        for(int i = 0; i < events.length; i++) {
            String event = events[i];
            LocalTime[] startEndTime = findTimeInLine(event);
            eventsTime[i][0] = startEndTime[0];
            eventsTime[i][1] = startEndTime[1];
        }

        List<String> eventsToAccept = new ArrayList<String>();

        LocalTime time = LocalTime.parse("09:00");
        while(!time.equals(LocalTime.parse("18:00"))) {
            for(int i = 0; i < events.length; i++) {
                if(time.equals(eventsTime[i][0])) {
                    long duration =
                            ChronoUnit.MINUTES.between(eventsTime[i]	[0],
                                    eventsTime[i][1]);

                    time = time.plusMinutes(duration);
                    eventsToAccept.add(events[i]);
                } else {
                    time = time.plusHours(4);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Events to accept:");
        for(String event: eventsToAccept) {
            sb.append(event).append(";");
        }

        return sb.toString();
    }

    private static java.time.LocalTime[] findTimeInLine(String line) {
        String regex = "\\d{2}:\\d{2}";
        java.time.LocalTime[] startEndTime =
                new java.time.LocalTime[2];
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(line);

        int i = 0;
        if (m.find()) {
            try{
                startEndTime[i] = java.time.LocalTime.parse(m.group(),
                        java.time.format.DateTimeFormatter.ISO_TIME);
            }catch(java.time.format.DateTimeParseException ex) {
                startEndTime[i] = null;
            }
            i++;
        }
        return startEndTime;
    }
}
