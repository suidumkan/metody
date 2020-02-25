zpackage com.company;

public class Main {

    public static void main(String[] args) {
             permission(16, 25);
             permission(27, 18);
             permission(18,24);
             permission(33, 19);
             permission(22, 15);
    }
    public static String permission (int age,int temp){
        if (age >20 &&age <45 && temp>-20 &&temp<30){
            System.out.println("можно идти гулять  ");
        }else {
            return "нельзя гулять";
        }
        if (age <20 &&temp>0&&temp<28){
            System.out.println("можно идти гулять ");
        }else {
            return "нельзя гулять";
        }
        if (age>45 && temp >-10&&temp <25){
            System.out.println("можно идти гулять ");

        }else {
            return "нельзя гулять";
        }
        return "Оставайтесь дома";
    }

}
