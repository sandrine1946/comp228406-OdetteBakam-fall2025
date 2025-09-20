package Exercise1;

public class Exercise1Driver {

        public static void main(String[] args) {
            Singers singer1 = new Singers();

            System.out.println("First singer Default PII details:");

            singer1.displaySingerDetails();

            // One setter for all values of instance variables
            singer1.setSingerDetails(1, "odette", "36 Abbey Road", "2003/06/10", 5);
            System.out.println("Values after all details are set:");
            singer1.displaySingerDetails();

            //  setters Values
            singer1.setSId(2);
            singer1.setSName("Wilfried Tremblay");
            singer1.setSAddress("35 old Plaza ");
            singer1.setDOB("1980/02/23");
            singer1.setNap(9);

            // Getters values to display
            System.out.println("Individual update current values:");
            System.out.println("Singer ID: " + singer1.getSId());
            System.out.println("Singer Name: " + singer1.getsName());
            System.out.println("Singer Address: " + singer1.getSAddress());
            System.out.println("Date of Birth: " + singer1.getDOB());
            System.out.println("Number of Albums Published: " + singer1.getNap());

            Singers singer2 = new Singers(4, "Kiroukou", "108 Dentith Road", "2000/12/30", 20);
            System.out.println("Details of the second singer:");
            singer2.displaySingerDetails();
        }
    }

