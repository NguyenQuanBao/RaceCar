import java.util.Random;

class Car implements Runnable {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public void run() {
        //khởi tạo điểm start
        int runDistance = 0;
//khởi tạo thời gian bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
//kiểm tra xem xe còn chạy hay ko
        while (runDistance < Main.DISTANCE) {
            try {
                //Random tốc độ
                int speed = (new Random()).nextInt(20);
                //Tính khoảng cách xe đã đi được
                runDistance += speed;
                //Vẽ đường đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println(this.carName + ": " + log +" " + Math.min(Main.DISTANCE , runDistance) + "KM");
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("car" + this.carName + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(this.carName + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
