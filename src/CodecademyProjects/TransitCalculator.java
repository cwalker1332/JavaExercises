package CodecademyProjects;

// TODO: finish

class TransitCalculator{

    double numDays;
    double numRides;
    double numWeeks;
    double sevenDayPpr;
    double thirtyDayPpr;
    double singleRide = 2.75;
    double sevenDay = 33.00;
    double thirtyDay = 127.00;

    public TransitCalculator(double days, double rides){
        this.numDays = days;
        this.numRides = rides;
    }

    public double unlimited7Price(){
        double numWeeks = numDays / 7;
        if (numDays % 7 != 0){
            numWeeks += 1;
        }

        double ppr7Day = (numWeeks * sevenDay) / numRides;
        sevenDayPpr = ppr7Day;
        return ppr7Day;
    }

    public double unlimited30Price(){
        double numMonths = numDays / 30;
        if (numDays % 30 != 0){
            numMonths += 1;
        }

        double ppr30Day = (numMonths * thirtyDay) / numRides;
        thirtyDayPpr = ppr30Day;
        return ppr30Day;
    }

    public double[] getRidePrices(){
        double[] ppr = {singleRide, sevenDayPpr, thirtyDayPpr};
        return ppr;

    }

    public void getBestFare(){

    }

    public static void main(String[] args){


    }
}