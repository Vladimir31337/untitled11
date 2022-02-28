package Lesson5HW;

import java.io.*;

public class AppData {

    private String[] headers;
    private int[][] data;

    public void read(File file) {

        int size = 0;

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                size++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        headers = new String[3];
        data = new int[size-1][];

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            headers = bufferedReader.readLine().split(";");

            String line;
            int tmp = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataString = line.split(";");
                int x1 = Integer.parseInt(dataString[0]);
                int x2 = Integer.parseInt(dataString[1]);
                int x3 = Integer.parseInt(dataString[2]);
                data[tmp] = new int[] {x1, x2, x3};
                tmp++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(File file) {

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(headers[0] + ";" + headers[1] + headers[2] + "\n");

            for (int[] arr: data) {
                bufferedWriter.write(arr[0] + ";" + arr[1] + ";" + arr[2] + "\n");
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

    }



    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}
