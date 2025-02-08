package kyu6;

import java.util.*;
import java.util.stream.Collectors;

public class Meeting {

    public static String meeting(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        List<String> meetingNames = new ArrayList<>();

        for (String names : s.split(";")) {
            String[] splittedName = names.split(":");
            stringBuilder.append("(").append(splittedName[1].toUpperCase()).append(", ").append(splittedName[0].toUpperCase()).append(")");
            meetingNames.add(stringBuilder.toString());
            stringBuilder.replace(0, stringBuilder.length(), "");
        }

        meetingNames = meetingNames.stream().sorted().collect(Collectors.toList());

        return String.join("", meetingNames);
    }

}
