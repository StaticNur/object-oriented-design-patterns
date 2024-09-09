package org.patterns.oop;

import org.patterns.oop.university.task1.Airport;

public class App 
{
    public static void main( String[] args ) {
        Airport airport = new Airport("Sheremetyevo", 11_000f, 156, 567);
        System.out.println(airport.toString());
        System.out.println("Общая стоимость всех проданных билетов: " + airport.getTotalCostOfAllTicketsSold());
    }
}
