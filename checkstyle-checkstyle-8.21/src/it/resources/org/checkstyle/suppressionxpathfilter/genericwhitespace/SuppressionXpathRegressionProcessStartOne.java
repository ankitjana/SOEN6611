package org.checkstyle.suppressionxpathfilter.genericwhitespace;

import java.util.Collections;

public class SuppressionXpathRegressionProcessStartOne {
    public<E> void bad() {//warn
    }
    public <E> void good() {
    }
}
