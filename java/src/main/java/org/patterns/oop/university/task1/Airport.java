package org.patterns.oop.university.task1;

public class Airport {
    private String name;
    private Float ticketPrice;
    private Integer totalNumberOfSeats;
    private Integer numberOfTicketsSold;

    public Airport() {}

    public Airport(String name, Float ticketPrice, Integer totalNumberOfSeats, Integer numberOfTicketsSold) {
        this.name = name;
        this.ticketPrice = ticketPrice;
        this.totalNumberOfSeats = totalNumberOfSeats;
        this.numberOfTicketsSold = numberOfTicketsSold;
    }

    public Float getTotalCostOfAllTicketsSold(){
        float sum = 0;
        for (int i = 0; i < numberOfTicketsSold; i++) {
            sum += ticketPrice;
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Integer getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(Integer totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public Integer getNumberOfTicketsSold() {
        return numberOfTicketsSold;
    }

    public void setNumberOfTicketsSold(Integer numberOfTicketsSold) {
        this.numberOfTicketsSold = numberOfTicketsSold;
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
               ", ticketPrice: " + ticketPrice +
               ", totalNumberOfSeats: " + totalNumberOfSeats +
               ", numberOfTicketsSold: " + numberOfTicketsSold;
    }
}
