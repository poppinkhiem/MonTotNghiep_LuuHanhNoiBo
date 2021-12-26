import java.text.DecimalFormat;
import java.util.Scanner;

public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ma= sc.nextLine();
        String ten= sc.nextLine();
        String trangThai="";
        String khuVuc=ma.substring(0,3);
        double toan,ly,hoa,cong;
        switch (khuVuc){
            case "KV1": cong=0.5;break;
            case "KV2": cong=1.0;break;
            default: cong=2.5;break;
        }
        toan=sc.nextDouble()*2.0;
        ly=sc.nextFloat();
        hoa=sc.nextFloat();
        double tongDiem=Math.round((toan+ly+hoa)*10.0)/10.0;
        if(tongDiem>=24.0-cong) trangThai="TRUNG TUYEN";
        else trangThai="TRUOT";
        DecimalFormat decimalFormat=new DecimalFormat("#.#");
        System.out.format("%s %s %s %s %s\n",ma,ten,decimalFormat.format(cong),decimalFormat.format(tongDiem),trangThai);
    }
}
