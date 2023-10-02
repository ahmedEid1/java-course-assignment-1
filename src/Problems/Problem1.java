package Problems;

public class Problem1 {
    public Problem1() {
        double earthRadius = 7600d / 2;
        double sunRadius = 865000d / 2;

        // 1. the volume of the Earth
        double earthVolume = this.getSphereVolume(earthRadius);
        // 2. the volume of the Sun
        double sunVolume = this.getSphereVolume(sunRadius);
        // 3. the ratio of the volume of the Sun to the volume of the Earth
        double sunEarthVolumeRatio = this.getSphereVolumeRatio(sunRadius, earthRadius);

        printProblem1Results(earthVolume, sunVolume, sunEarthVolumeRatio);
    }

    private double getSphereVolume(double radius) {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    private double getSphereVolumeRatio(double radius1, double radius2) {
        return getSphereVolume(radius1) / getSphereVolume(radius2);
    }

    private void printProblem1Results(double earthVolume, double sunVolume, double sunEarthVolumeRatio) {
        // 3. the ratio of the volume of the Sun to the volume of the Earth
        System.out.println("Problem 1");
        System.out.printf(" The volume of the Earth is %.2f cubic miles \n", earthVolume);
        System.out.printf(" The volume of the Sun is %.2f cubic miles \n", sunVolume);
        System.out.printf("The ratio of the volume of the Sun to the volume of the Earth is %.2f \n", sunEarthVolumeRatio);
        System.out.println("----------------------------------------");
    }
}
