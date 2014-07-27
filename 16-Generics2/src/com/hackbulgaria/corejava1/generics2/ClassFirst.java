package com.hackbulgaria.corejava1.generics2;


@ClassInfo(author = "Svetla", relatedClasses = {})
public class ClassFirst {

    public ClassFirst() {

    }

    public static void main(String[] args) {
        ClassFirst testClass = new ClassFirst();

        System.out.println(testClass.getClass().getAnnotations());

        System.out.println(testClass.getClass().getAnnotation(ClassInfo.class));

        ClassInfo info = testClass.getClass().getAnnotation(ClassInfo.class);
        System.out.println("Author: " + info.author());
        System.out.println("Revision: " + info.revision());
        System.out.println("Number of related classes: " + info.relatedClasses().length);
    }
}

