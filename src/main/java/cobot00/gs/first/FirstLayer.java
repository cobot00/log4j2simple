package cobot00.gs.first;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

@Data
@Log4j2
@AllArgsConstructor
public class FirstLayer {

    //private static final Logger log = LogManager.getLogger(FirstLayer.class);

    private int number;
    private String tag;

    public void log() {
        log.debug("numgber: " + number);
        log.info(toString());
        log.warn("warning");
        log.error("error");
        log.error("error again");
    }
}
