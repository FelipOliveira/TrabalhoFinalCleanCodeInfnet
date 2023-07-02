package utils;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Config {
    public static final String BOOT_TEXT = "\n\nROBCO INDUSTRIES UNIFIED OPERATING SYSTEM\n" +
        "COPYRIGHT 2075-2077 ROBCO INDUSTRIES\n" +
        LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\n" +
        "- ROBCO INDUSTRIES (TM) TERMLINK PROTOCOL -\n" +
        "[==================================]\n\n\n";

    public static final BigDecimal REAJUSTE_ESTAGIARIO = new BigDecimal(2);
    public static final BigDecimal REAJUSTE_JUNIOR = new BigDecimal(4);
    public static final BigDecimal REAJUSTE_PLENO = new BigDecimal(8);
    public static final BigDecimal REAJUSTE_SENIOR = new BigDecimal(16);
}
