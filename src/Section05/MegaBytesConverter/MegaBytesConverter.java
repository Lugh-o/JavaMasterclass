package Section05.MegaBytesConverter;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //1 megaBytes = 1024 kiloBytes
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int megaBytes = kiloBytes/1024;
        int remainderKiloBytes = kiloBytes%1024;
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");

    }
}
