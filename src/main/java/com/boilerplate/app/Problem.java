package com.boilerplate.app;

public class Problem {
    private Codebase codebase;

    public Problem(final Codebase codebase) {

        this.codebase = codebase;
    }

    public void solve() {
        this.codebase.addATest();
        this.codebase.addSomeProductionCode();
    }
}
