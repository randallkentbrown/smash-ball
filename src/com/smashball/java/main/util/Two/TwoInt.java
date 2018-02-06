/* created by Kent Brown on 2/5/2018 */

/* package */
package com.smashball.java.main.util.Two;

/* imports */

/* implementation */
public class TwoInt {

    // STATE //
    private int _t1;
    private int _t2;

    // CONSTRUCTOR //
    public TwoInt(int int1, int int2) {
        _t1 = int1;
        _t2 = int2;
    }

    // GETTERS & SETTERS //
    public void replaceFirst(int int1) {
        _t1 = int1;
    }
    public void replaceSecond(int int2) {
        _t2 = int2;
    }
    public void replace(int int1, int int2) {
        replaceFirst(int1);
        replaceSecond(int2);
    }

    public int first() { return _t1; }
    public int second () { return _t2; }

    // BEHAVIOUR //

}
