package io.rensatopc.github.util;

import java.util.logging.Logger;

public class ModLogger {
    static Logger logger;

    static {
        logger = Logger.getLogger("KBSBMod");
    }

    public static Logger getLogger() {
        return logger;
    }
}
