public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            AppSettings settings = AppSettings.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Тема"));
            //System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Язык"));
            //System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Путь"));


            settings.setSetting("Тема", Thread.currentThread().getName() + " темная");
            //settings.setSetting("Язык", Thread.currentThread().getName() + " en");
            //settings.setSetting("Путь", Thread.currentThread().getName() + " /desktop/path");

            System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Тема"));
            //System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Язык"));
            //System.out.println(Thread.currentThread().getName() + ": " + settings.getSetting("Путь"));
        };

        Thread thread1 = new Thread(task, "Поток 1");
        Thread thread2 = new Thread(task, "Поток 2");
        Thread thread3 = new Thread(task, "Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}