package com.rg.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.Jsoup;

/**
 * Created by prathyush on 5/11/16.
 */
public class ParserUtils {

    public Student parseResult(String result){
        Student student = new Student();
        List<Subject> subjects = new ArrayList<>();

        //Clean the String
        result = Jsoup.parse(result).body().toString();
        result= result.trim().replaceAll("<[^>]*>","")
                .replaceAll("(?m)^\\s*$[\n\r]+", "")
                .replaceAll("(&nbsp;)|(-->)|(:)|(\\.)","")
                .replaceAll("\\d{4}-\\d{2}-\\d{2}","")
                .replaceAll("(\\w+).(\\d{2},.(\\d{4}))","")
                .replaceAll("(REVALUATION RESULTS) | (RESULTS \\(PROVISIONAL\\)) | (Sd/-    REGISTRAR\\(EVALUATION\\)) ","")
                .replaceAll("(Subject)|(External)|(Internal)|(Total)|(Result)|(Semester)","")
                .replace("&amp;","and");
        StringBuffer buf = new StringBuffer();
        Arrays.asList(result.split("\n")).stream().filter(line -> !line.matches("\\s+")).forEach(line -> buf.append(line.trim()).append("\n"));
        String [] strList = buf.toString().split("\n");

        //Set Student object
        student.setName(strList[0].replaceAll("\\(.*?\\)","").trim());
        student.setUSN(getText(strList[0].trim()));
        student.setSemester(Integer.parseInt(strList[1]));
        student.setResultClass(strList[2].trim());
        for(int i=3; i<strList.length-4;){
            Subject subject = new Subject();
            subject.setName(strList[i].replaceAll("\\(.*?\\)","").trim());
            subject.setSubjectCode(getText(strList[i++]).trim());
            subject.setExternalMarks(Integer.parseInt(strList[i++]));
            subject.setInternalMarks(Integer.parseInt(strList[i++]));
            subject.setTotalMarks(Integer.parseInt(strList[i++]));
            subject.setResult((strList[i++].trim().equals("P")));
            subjects.add(subject);
        }
        student.setSubject(subjects);
        return student;
    }

    public String getText(String text){
        if(text.contains("("))
            return text.substring(text.indexOf("(") + 1, text.indexOf(")"));
        else
            return text;
    }
}
