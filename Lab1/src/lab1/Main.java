package lab1;

import ingredient.Chocolate;
import ingredient.Ginger;
import ingredient.Jasmine;
import ingredient.Milk;
import ingredient.WhipCream;

import java.text.DecimalFormat;
import java.util.ArrayList;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.Decaf;
import beverage.Espresso;
import beverage.GreenTea;
import beverage.HouseBlend;
import beverage.RedTea;
import beverage.WhiteTea;



public class Main {

    public static void main(String[] args) {

        if (args.length == 0){
            System.err.println("No order provided.");
            return;
        }


        String[] disArr = new String[args.length];
        for (int j = 0; j < args.length; j++) {
            disArr[j] = args[j].toLowerCase();
//            System.out.println(args[j]);
        }


        if(isNum(disArr[0])) {
            try{
            double cost = dealOrders(disArr);
            displayCost(cost);
            }catch (Exception e){
                e.printStackTrace();
                return;
            }


        }else{
            try{
                double cost = dealAnOrder(disArr);
                displayCost(cost);
            } catch (Exception e){
                e.printStackTrace();
                return;
            }

        }
    }

    private static boolean isNum(String str) {
        return str.matches("[0-9]+");
    }
   //��Ԫ����ʱ�ĳ�Public
    public static double dealOrders(String[] disArr) throws Exception{
        String str = "";


        //�õ�������
        int count = Integer.parseInt(disArr[0]);

        for (int i = 1; i < disArr.length; i++){
            if(i != disArr.length-1 && !disArr[i].equals(";")){
            str += (disArr[i]+" ");
            }else{
                str += disArr[i];
            }
        }

        String[] splittedArr = str.split(";");


        if (splittedArr.length != count){
            String errMsg = "wrong input for ';'";
            showIllegalInput(errMsg);
            throw new Exception(errMsg);
        }


        ArrayList<String[]> disArrsList = new ArrayList<>();

        for (int i = 0; i < splittedArr.length; i++){
            String[] tempDisArr = splittedArr[i].split(" ");
            disArrsList.add(tempDisArr);
        }

        String[][] disArrs =  (String[][])disArrsList.toArray(new String[disArrsList.size()][]);

        double totalCost = 0;

        for(int i = 0; i < disArrs.length; i++){
            double cost =  dealAnOrder(disArrs[i]);
            totalCost += cost;
        }

            return totalCost;

    }


    private static double dealAnOrder(String[] disArr) throws Exception{

        int i;  // beverage name's length(may be 1 or 2)
        BeveSize size = BeveSize.EMPTY;  // beverage's size
        for (i = 0; i < disArr.length; i++) {
            if (disArr[i].matches("^small$|^medium$|^large$|^grant$")) {
                size = BeveSize.valueOf(disArr[i].toUpperCase());
                break;
            }
        }

        if (i >= disArr.length) {
            showIllegalInput("Must set a size!");
            throw new Exception();
        }

        // get beverage's name
        String beveStr = disArr[0] + ((i == 2) ? " " + disArr[1] : "");

        // create base beverage
        Beverage order;
        switch (beveStr) {
        	case "decaf":
        		order = new Decaf();
        		order.setSize(size);
        		break;
        	case "decaf mocha":
        		order = new Decaf();
        		order.setSize(size);
        		order = new Chocolate(order);
        		break;
        	case "decaf latte":
        		order = new Decaf();
        		order.setSize(size);
        		order = new Milk(order);
        		break;
        	case "decaf cappuccino":
        		order = new Decaf();
        		order.setSize(size);
        		order = new WhipCream(order);
        		break;
            case "espresso":
                order = new Espresso();
                order.setSize(size);
                break;
            case "houseblend":
                order = new HouseBlend();
                order.setSize(size);
                break;
            case "mocha":
                order = new Espresso();
                order.setSize(size);
                order = new Chocolate(order);
                break;
            case "latte":
                order = new Espresso();
                order.setSize(size);
                order = new Milk(order);
                break;
            case "cappuccino":
                order = new Espresso();
                order.setSize(size);
                order = new WhipCream(order);
                break;
            case "green tea":
                order = new GreenTea();
                order.setSize(size);
                break;
            case "red tea":
                order = new RedTea();
                order.setSize(size);
                break;
            case "white tea":
                order = new WhiteTea();
                order.setSize(size);
                break;
            case "flower tea":
                order = new GreenTea();
                order.setSize(size);
                order = new Jasmine(order);
                break;
            case "ginger tea":
                order = new GreenTea();
                order.setSize(size);
                order = new Ginger(order);
                break;
            case "tea latte":
                order = new RedTea();
                order.setSize(size);
                order = new Milk(order);
                break;
            default:
                showIllegalInput(beveStr);
                throw new Exception();
        }



        // add ingredient
        for (i++; i < disArr.length; i++) {
            switch (disArr[i]) {
                case "chocolate":
                    order = new Chocolate(order);
                    break;
                case "ginger":
                    order = new Ginger(order);
                    break;
                case "milk":
                    order = new Milk(order);
                    break;
                case "jasmine":
                    order = new Jasmine(order);
                    break;
                case "whip":
                    i++;
                    order = new WhipCream(order);
                    break;
                default:
                    showIllegalInput(disArr[i]);
                    throw new Exception();
            }
        }

        return order.cost();
    }

    private static void displayCost(double cost){
        DecimalFormat df = new DecimalFormat(".0");
        System.out.println("The total cost of your order is: "
                + df.format(cost));
    }

    private static void showIllegalInput(String errMsg) {
        System.err.println("Illegal input:" + errMsg);
    }

}