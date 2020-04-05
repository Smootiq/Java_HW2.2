public class HW {
    public static void main(String[] args) {
        boolean action = true;
        int percent;
        if (action) {
            percent = 1;
        } else {
            percent = 0;
        }
        long amount = 1100;
        long balance = 100;
        long bonus = amount * percent / 100;
        long limit = 1000;
        long fix = 0;
        if (amount < limit) {
            bonus = fix;
        }
        long total = bonus + amount + balance;
        System.out.println(total);
    }
}