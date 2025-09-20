public class Singers {
        // Instance variables
        private int sId;
        private String sName;
        private String sAddress;
        private String DOB;
        private int Nap;

        // No-argument constructor
        public Singers() {
            this.sId = 0;
            this.sName = "Unknown";
            this.sAddress = "Not specified";
            this.DOB = "Not specified";
            this.Nap = 0;
        }
        // Constructor with 5 arguments
        public Singers(int sId, String sName, String sAddress, String DOB, int Nap) {
            this.sId = sId;
            this.sName = sName;
            this.sAddress = sAddress;
            this.DOB = DOB;
            this.Nap = Nap;
        }

        // Setters (individual)
        public void setSId(int sId) {
            this.sId = sId;
        }

        public void setSName(String sName) {
            this.sName = sName;
        }

        public void setSAddress(String sAddress) {
            this.sAddress = sAddress;
        }
        public void setDOB(String DOB) {
            this.DOB = DOB;
        }

        public void setNap(int Nap) {
            this.Nap = Nap;
        }

        // all variables at once Setter
        public void setSingerDetails(int sId, String sName, String sAddress, String DOB, int Nap) {
            this.sId = sId;
            this.sName = sName;
            this.sAddress = sAddress;
            this.DOB = DOB;
            this.Nap = Nap;
        }

        // Getters
        public int getSId() {
            return sId;
        }
        public String getsName() {
            return sName;
        }

        public String getSAddress() {
            return sAddress;
        }

        public String getDOB() {
            return DOB;
        }

        public int getNap() {
            return Nap;
        }
        // Method to display all details
        public void displaySingerDetails() {
            System.out.println("Singer ID: " + sId);
            System.out.println("Singer Name: " + sName);
            System.out.println("Singer Address: " + sAddress);
            System.out.println("Date of Birth: " + DOB);
            System.out.println("Number of Albums Published: " + Nap);
            System.out.println("-----------------------------------------");
        }
    }
