package 에어컨만들기;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class AirconditionerEx {
    private boolean powerOn;
    private int temperature;
    private boolean coolingOn;
    private boolean heatingOn;
    private int fanSpeed;
    private Timer timer;

    public AirconditionerEx() {
        this.powerOn = false;
        this.temperature = 25; // 초기 온도 설정
        this.coolingOn = false;
        this.heatingOn = false;
        this.fanSpeed = 1; // 초기 바람세기 설정
        this.timer = new Timer();
    }

    public void powerOnOff() {
        powerOn = !powerOn;
        if (!powerOn) {
            coolingOn = false;
            heatingOn = false;
        }
        System.out.println("Air conditioner power " + (powerOn ? "on" : "off"));
    }

    public void setTemperature(int temperature) {
        if (powerOn) {
            this.temperature = temperature;
            System.out.println("Temperature set to " + temperature + "°C");
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    public void displayCurrentTemperature() {
        System.out.println("Current temperature: " + temperature + "°C");
    }

    public void coolingOnOff() {
        if (powerOn) {
            coolingOn = !coolingOn;
            heatingOn = false;
            System.out.println("Cooling " + (coolingOn ? "on" : "off"));
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    public void heatingOnOff() {
        if (powerOn) {
            heatingOn = !heatingOn;
            coolingOn = false;
            System.out.println("Heating " + (heatingOn ? "on" : "off"));
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    public void setFanSpeed(int fanSpeed) {
        if (powerOn) {
            this.fanSpeed = fanSpeed;
            System.out.println("Fan speed set to " + fanSpeed);
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    public void startTimer(int minutes) {
        if (powerOn) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    powerOnOff(); // 타이머가 끝나면 에어컨을 자동으로 끕니다.
                }
            }, minutes * 60 * 1000);
            System.out.println("Timer set for " + minutes + " minutes");
        } else {
            System.out.println("Please turn on the air conditioner first.");
        }
    }

    public static void main(String[] args) {
        AirconditionerEx ac = new AirconditionerEx();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (power/on/off/temperature/cooling/heating/fan/timer/exit):");
            String command = scanner.nextLine();

            switch (command) {
                case "power":
                    ac.powerOnOff();
                    break;
                case "on":
                    ac.powerOn = true;
                    System.out.println("Air conditioner turned on");
                    break;
                case "off":
                    ac.powerOn = false;
                    System.out.println("Air conditioner turned off");
                    break;
                case "temperature":
                    System.out.println("Enter temperature:");
                    int temperature = scanner.nextInt();
                    ac.setTemperature(temperature);
                    scanner.nextLine(); // Clear buffer
                    break;
                case "cooling":
                    ac.coolingOnOff();
                    break;
                case "heating":
                    ac.heatingOnOff();
                    break;
                case "fan":
                    System.out.println("Enter fan speed (1/2/3):");
                    int fanSpeed = scanner.nextInt();
                    ac.setFanSpeed(fanSpeed);
                    scanner.nextLine(); // Clear buffer
                    break;
                case "timer":
                    System.out.println("Enter timer duration (minutes):");
                    int minutes = scanner.nextInt();
                    ac.startTimer(minutes);
                    scanner.nextLine(); // Clear buffer
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
