public class Teman {
        
        int absen;
        String nama;        //kalo didalam () = parameter, kalo didalam {} = variable
        double ipk;

        //Constructor
        //nama harus sama dengan Class
        public Teman() {
            absen = 0;
            nama = "empty";
            ipk = 0.0;
        }

        //Constructor Parameter (input dari user)
        public Teman(int absen, String nama, double ipk) //ini parameter 
            {
                //variable = parameter
                this.absen = absen;
                this.nama = nama;       //kalo gamau pake this, pake nama parameter dan variable berbeda. Tetapi lebih umum pake this.
                this.ipk = ipk;
            } 

            //method print - to show the results of set data
            public void print() {
                System.out.println("Absen: " + absen);
                System.out.println("Nama: " + nama);
                System.out.println("IPK: " + ipk);
            }
            
    }
    
