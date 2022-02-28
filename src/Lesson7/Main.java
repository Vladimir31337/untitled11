import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

Employee employee = new Employee("Name", 1500, 13);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("test.json"), employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Employee employee1 = objectMapper.readValue(new File("test.json"), Employee.class);
            System.out.println(employee1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String myJson = "{\"name\":\"Name\",\"salary\":1500.0,\"age\":13}";
        try {
            System.out.println(objectMapper.readValue(myJson, Employee.class).toString());
            System.out.println(objectMapper.readTree(myJson).at("salary").asText());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // objectMapper.writeValue(new File("test.json"), employee); запись в json
        // Employee employee1 = objectMapper.readValue(new File("test.json"), Employee.class); чтение
        // objectmapper.read tree ->  get при массивах  ; at()

// Выполним запрос и полчим ответ в виде Json
        //json Обрабатываем с jackson
        //вытягиваем необходимые значения

    }

}
