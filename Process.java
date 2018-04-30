package mini_project;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Process {
    /*get current date*/
    private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private static Date date = new Date();
    private void writeFile() throws Exception{
        /*Object in collection*/
        ArrayList<StockManagement> list = new ArrayList<>();
        int i;
        /*define number of object with array*/
        StockManagement s[] = new StockManagement[10];
        for (i = 0; i < s.length; i++) {
            /*the same object will followed by object array defined*/
            list.add(s[i] = new StockManagement(i + 1, "Pepsi", 5, 1.4,df.format(date)));
        }
        /*write object got from collection*/
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.bak"));
        out.writeObject(list);
        out.close();
    }
    private void readFile() throws Exception {
        /*All header title*/
        String header[] = {"ID", "Name", "Quantity", "Unit Price", "Date"};
        /*create table style*/
        Table t = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.ALL);
        /*put all title in first table row*/
        t.addCell(header[0]);
        t.addCell(header[1]);
        t.addCell(header[2]);
        t.addCell(header[3]);
        t.addCell(header[4]);
        /*Store object in collection*/
        ArrayList<Object> lin;
        /*location of file*/
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.bak"));
        /*put in collection again*/
        lin = (ArrayList<Object>) in.readObject();
        /*loop all object and output*/
        for (Object aLin : lin) {
            StockManagement sin = (StockManagement) aLin;
            t.addCell(String.valueOf(sin.getId()));
            t.addCell(sin.getName());
            t.addCell(String.valueOf(sin.getQty()));
            t.addCell(String.valueOf(sin.getUniPrice()));
            t.addCell(sin.getDf());
        }
        /*render with all object with border*/
        System.out.println(t.render());
        in.close();
    }
    private void option(){
        System.out.print("Command: >");
        String c;
        Scanner in = new Scanner(System.in);
        c = in.next();

        switch (c){
            case "*" :
                try {
                    readFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "w" :
                try {
                    writeFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "r":
                System.out.println("You pressed r");
                break;
            case "u":
                System.out.println("You pressed u");
                break;
            case "f":
                System.out.println("You pressed f");
                break;
            case "p":
                System.out.println("You pressed p");
                break;
            case "n":
                System.out.println("You pressed n");
                break;
            case "l":
                System.out.println("You pressed l");
                break;
            case "s":
                System.out.println("You pressed s");
                break;
            case "g":
                System.out.println("You pressed g");
                break;
            case "se":
                System.out.println("You pressed se");
                break;
            case "sa":
                System.out.println("You pressed sa");
                break;
            case "ba":
                System.out.println("You pressed ba");
                break;
            case "re":
                System.out.println("You pressed re");
                break;
            case "h":
                System.out.println("You pressed h");
                break;
            case "e":
                System.out.println("You pressed e");
                break;

        }
    }
    void run(){
        GUI gui = new GUI();
        gui.banner();
        gui.menu();
        option();
    }
}
