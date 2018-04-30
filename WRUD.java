package mini_project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class WRUD {
    private static DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
    private static Date date = new Date();
    private ArrayList<StockManagement> list = new ArrayList<>();
    void write(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int qty = scanner.nextInt();
        double uniprice = scanner.nextDouble();


    }
    void read(){

    }
    void update(){

    }
    void delete(){

    }
}
