package FactoryMethod;

import Classes.Pupil;

public interface PupilFactory {
    Pupil createInstance(String secondName, int subjectsCount);
}