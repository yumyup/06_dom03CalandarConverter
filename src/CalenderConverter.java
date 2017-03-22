
public class CalenderConverter {
    final int PONIEDZIALEK = 1;
    final int WTOREK = 2;
    final int SRODA = 3;
    final int CZWARTEK = 4;
    final int PIATEK = 5;
    final int SOBOTA = 6;
    final int NIEDZIELA = 7;
    final String dayNumber = null;
    final int day = 0;

    static void convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("1 dzień tygodnia to poniedziałek ");
                break;
            case 2:
                System.out.println(" wtorek ");
                break;
            case 3:
                System.out.println(" środa ");
                break;
            case 4:
                System.out.println(" czwartek ");
                break;
            case 5:
                System.out.println(" piątek ");
                break;
            case 6:
                System.out.println(" sobota ");
                break;
            case 7:
                System.out.println(" niedziela ");
            default:
                System.out.println("koniec");

        }
    }

    public int getPONIEDZIALEK() {
        return PONIEDZIALEK;
    }

    public int getWTOREK() {
        return WTOREK;
    }

    public int getSRODA() {
        return SRODA;
    }

    public int getCZWARTEK() {
        return CZWARTEK;
    }

    public int getPIATEK() {
        return PIATEK;
    }

    public int getSOBOTA() {
        return SOBOTA;
    }

    public int getNIEDZIELA() {
        return NIEDZIELA;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public int getDay() {
        return day;
    }
}
