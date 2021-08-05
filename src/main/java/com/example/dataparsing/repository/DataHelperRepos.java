package com.example.dataparsing.repository;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataHelperRepos {


    public static JSONArray getData(String path) {
        BufferedReader reader = null;
        String line = "";
        List<String> variables = new ArrayList<>();
        JSONArray arrayToBeReturned = new JSONArray();
        try {
            reader = new BufferedReader(new FileReader(path));
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                if (counter == 0) {
                    variables = Arrays.asList(line.split(","));
                }
                else {
                    List<String> values = Arrays.asList(line.split(","));
                    JSONObject jsonObject = new JSONObject();
                    for (int i = 0 ; i< variables.size(); i++)  {

                        if (isNumeric(values.get(i))) {
                            jsonObject.put(variables.get(i),Double.parseDouble(values.get(i)));
                        }
                        else jsonObject.put(variables.get(i),values.get(i));
                    }
                    arrayToBeReturned.put(jsonObject);
                }

                counter++;
            }
            return arrayToBeReturned;

        }

        catch (Exception e) {
            System.out.println("Failed to read " + path);
            return null;
        }

    }

    public static boolean isNumeric(String str) {
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
