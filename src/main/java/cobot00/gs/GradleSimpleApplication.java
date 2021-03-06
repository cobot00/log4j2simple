package cobot00.gs;

import cobot00.gs.first.FirstLayer;
import cobot00.gs.first.second.SecondLayer;
import cobot00.gs.first.second.third.ThirdLayer;

public class GradleSimpleApplication {

    public static void main(String[] args) {
        GradleSimpleApplication app = new GradleSimpleApplication();
        app.run();
    }

    public void run() {
        FirstLayer first = new FirstLayer(1, "Java");
        first.log();

        SecondLayer second = new SecondLayer(2, "Gradle");
        second.log();

        ThirdLayer third = new ThirdLayer(3, "YAML");
        third.log();
    }
}
