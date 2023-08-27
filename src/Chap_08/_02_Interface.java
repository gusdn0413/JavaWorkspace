package Chap_08;

import Chap_08.camera.FactoryCam;
import Chap_08.detecter.AdvancedFireDetector;
import Chap_08.detecter.Detectable;
import Chap_08.detecter.FireDetector;
import Chap_08.reporter.NormalReporter;
import Chap_08.reporter.Reportable;
import Chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}