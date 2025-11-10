/* Ad Soyad: [Selim Yağbasan]
 * Ogrenci No: [250541111]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 2 - Fizik Formül Asistanı
 *
 * Bu program temel fizik formüllerini kullanarak hesaplamalar yapar.
 */
import java.util.Scanner;

public class FizikFormul {

    // Sabit: Yerçekimi ivmesi
    final static double GRAVITY = 9.81; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // METOT 4: İş hesapla (W = F * d)
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // METOT 5: Güç hesapla (P = W / t)
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // METOT 6: Kinetik enerji (KE = 0.5 * m * v²)
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // METOT 7: Potansiyel enerji (PE = m * g * h)
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    // METOT 8: Momentum (p = m * v)
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== FIZIK FORMUL ASISTANI ===\n");
            
            // TEMEL ÖLÇÜMLER
            System.out.println("TEMEL ÖLÇÜMLER:");
            System.out.print("Kütle (kg): ");
            double mass = input.nextDouble();
            
            System.out.print("Mesafe (m): ");
            double distance = input.nextDouble();
            
            System.out.print("Zaman (s): ");
            double time = input.nextDouble();
            
            System.out.print("Hız değişimi (m/s): ");
            double deltaV = input.nextDouble();
            
            System.out.print("Yükseklik (m): ");
            double height = input.nextDouble();
            
            // Hesaplamalar
            double velocity = calculateVelocity(distance, time);
            double acceleration = calculateAcceleration(deltaV, time);
            double force = calculateForce(mass, acceleration);
            double work = calculateWork(force, distance);
            double power = calculatePower(work, time);
            double kineticEnergy = calculateKineticEnergy(mass, velocity);
            double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height);
            double momentum = calculateMomentum(mass, velocity);
            
            // SONUÇLARI YAZDIR
            System.out.println("\n========================================");
            System.out.println("        HESAPLAMA SONUÇLARI");
            System.out.println("========================================");
            
            System.out.println("\nHIZ ve HAREKET:");
            System.out.printf("  Hız (v = s/t)             : %.2f m/s\n", velocity);
            System.out.printf("  İvme (a = Δv/t)           : %.2f m/s²\n", acceleration);
            
            System.out.println("\nKUVVET ve İŞ:");
            System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
            System.out.printf("  İş (W = F*d)              : %.2f J\n", work);
            System.out.printf("  Güç (P = W/t)             : %.2f W\n", power);
            
            System.out.println("\nENERJİ:");
            System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
            System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
            System.out.printf("  Toplam Enerji             : %.2f J\n", (kineticEnergy + potentialEnergy));
            
            System.out.println("\nMOMENTUM:");
            System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);
            
            System.out.println("\n========================================");
        }
    }
}