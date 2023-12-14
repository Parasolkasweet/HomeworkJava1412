public class Main {
//    1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//    Реализует логический метод canBuy,  возвращающий boolean
//    Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//    Отобразите строку «Я могу купить еду, это ……» и значение.

    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = openOrNot(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);
    }
    public static boolean openOrNot(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}
