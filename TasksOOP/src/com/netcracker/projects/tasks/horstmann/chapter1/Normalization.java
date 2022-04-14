package com.netcracker.projects.tasks.horstmann.chapter1;

import static java.lang.Math.floorMod;

public interface Normalization {
    static int normalizeDegree(int theAngle) {
        return theAngle >= 0 ? theAngle % 360 : (theAngle != -360) ? 360 + theAngle % 360 : 0;
    }

    static int normalizeDegreeWithFloorMod(int theAngle) {
        return floorMod(theAngle, 360);
    }
}
