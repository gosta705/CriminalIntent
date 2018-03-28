package com.example.tanya.criminalintent;

/**
 * Created by tanya on 23.03.2018.
 */

public class CrimeDbSchema {
    //класс для описания строковых констант
    public static final class CrimeTable{
        public static final String NAME = "crimes";
        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
