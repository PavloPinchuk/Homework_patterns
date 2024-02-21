package Homework3.Task2;

import Homework3.Task2.Factories.HyundaiFactory;
import Homework3.Task2.Factories.SkodaFactory;
import Homework3.Task2.Factories.TransportFactory;
import Homework3.Task2.Factories.VolvoFactory;
import Homework3.Task2.Transport.Bus;
import Homework3.Task2.Transport.Tram;
import Homework3.Task2.Transport.Transport;
import Homework3.Task2.Transport.Trolleybus;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HyundaiFactory hyundaiFactory = new HyundaiFactory();
        VolvoFactory volvoFactory = new VolvoFactory();
        SkodaFactory skodaFactory = new SkodaFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N = ");
        int n = sc.nextInt();
        n *=1000;
        System.out.println("Input number of buses: ");
        int a = sc.nextInt();
        System.out.println("Input number of trolleybuses: ");
        int tr = sc.nextInt();
        System.out.println("Input number of trams: ");
        int t = sc.nextInt();
        int skodaTotal = getTotalCost(createTransport(skodaFactory,a,t,tr),n);
        int hyundaiTotal = getTotalCost(createTransport(hyundaiFactory,a,t,tr),n);
        int volvoTotal = getTotalCost(createTransport(volvoFactory,a,t,tr),n);
        
        if(skodaTotal<hyundaiTotal && skodaTotal<volvoTotal){
            System.out.println("Skoda is the best");
        } else if (hyundaiTotal<skodaTotal && hyundaiTotal<volvoTotal) {
            System.out.println("Hyundai is the best");
        } else if (volvoTotal<hyundaiTotal && volvoTotal<skodaTotal) {
            System.out.println("Volvo is the best");
        }else if(volvoTotal==hyundaiTotal && volvoTotal==skodaTotal){
            System.out.println("All companies are equal");
        } else if (volvoTotal==hyundaiTotal) {
            System.out.println("Volvo and Hyundai are equal");
        } else if (volvoTotal==skodaTotal) {
            System.out.println("Volvo and Skoda are equal");
        } else {
            System.out.println("Skoda and Hyundai are equal");
        }
    }


    public static ArrayList<Transport> createTransport(TransportFactory factory, int a, int t, int tr){
        ArrayList<Transport> transports = new ArrayList<>();
        for(int i  = 0;i<a;i++){
            Bus bus = factory.createBus();
            transports.add(bus);
        }
        for(int i  = 0;i<t;i++){
            Tram tram = factory.createTram();
            transports.add(tram);
        }
        for(int i  = 0;i<tr;i++){
            Trolleybus trolleybus = factory.createTrolleybus();
            transports.add(trolleybus);
        }

        return transports;
    }

    public static int getTotalCost(ArrayList<Transport> transports, int n){
        int totalCost = 0;
        for(Transport t:transports){
            totalCost+=t.distanceCalculator(n)+t.getCost();
        }
        return  totalCost;
    }
}
