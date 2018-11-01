// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        boolean páros;
        boolean nyolccalOsztható;
        boolean parosSor;
        int sor = 1;
        for (int i = 1; i <= 64; i++) {
            páros = (i % 2 == 0);
            nyolccalOsztható = (i % 8 == 0);
            parosSor = (sor % 2 == 0);
            if (parosSor) {
                if (!páros) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            } else {
                if (páros) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            if (nyolccalOsztható) {
                System.out.println();
                sor++;
                }

            }

        }
    }

