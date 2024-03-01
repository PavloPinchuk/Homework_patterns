package Homework5.Task1;

import Homework5.Task1.Equations.BiQuadraticEquation;
import Homework5.Task1.Equations.EquationInterface;
import Homework5.Task1.Equations.LinearEquation;
import Homework5.Task1.Equations.QuadraticEquation;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<EquationInterface> equations = new ArrayList<>();
        equations.add(new LinearEquation(new double[]{4, -8}));
        equations.add(new QuadraticEquation(new double[]{1,2,1}));
        equations.add(new BiQuadraticEquation(new double[]{1,0,0,0,-1}));
        int arraySize = equations.size();

        for(int i=0;i<arraySize;i++){
            equations.add(equations.get(i).clone());
        }

        for(EquationInterface eq : equations){
           eq.printEquation();
        }
    }
}
