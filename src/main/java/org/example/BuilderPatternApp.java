package org.example;

import org.example.patterns.builder.Plane;

public class BuilderPatternApp {
    public static void main(String[] args) {
        Plane plane = new Plane.builder()
                .model("X-56")
                .type("Reactive")
                .length(13.5)
                .build();
        System.out.println(plane.getType());
        System.out.println(plane.getMaxSpeed());
    }
}
