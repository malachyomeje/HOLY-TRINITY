package project;

public class Cash extends Staff {
    private int Basicsalary;
    private int Extrahourworked;
    private int Bonus;




    public int Calaculatewage(int Extrahourworked) {
        return Basicsalary + (Extrahourworked * Bonus);



        }


    public void setbasicsalary(int Basicsalary) {
        this.Basicsalary = Basicsalary;

        if (Basicsalary == 2000) {
            System.out.println("Omeje Malachy Ogugo Sallary ");
            System.out.println("THANKS FOR YOUR HARD WORD WE APPRICIATE");
        } else if (Basicsalary == 1500) {
            System.out.println("Eze Faith Uchenna  ");
            System.out.println("THANKS FOR YOUR HARD WORD WE APPRICIATE");
        } else if (Basicsalary == 5000) {
            System.out.println(" Odo  Lilian Uchenna  ");
            System.out.println("THANKS FOR YOUR HARD WORD WE APPRICIATE");
        } else if (Basicsalary == 10000) {
            System.out.println(" Ugwu Emmanuel Jideofor  ");
            System.out.println("THANKS FOR YOUR HARD WORD WE APPRICIATE");
        }
        else
        System.out.println("invalid entry try again ");

    }

    public int getBasicsalary() {
        return Basicsalary;
    }

    public void setextrahourworked(int extrahourworked) {
        this.Extrahourworked = Extrahourworked;
    }


    public int getextrahourworked() {
        return Extrahourworked;

    }


    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    private int getbonus() {
        return Bonus;
    }


    }















