package com.budi.test.sakuku.firebase;

import com.google.firebase.database.FirebaseDatabase;

public class FirebaseFactory {

    public static String T_USER = "USER";

    private static FirebaseFactory firebaseFactory;
    private FirebaseDatabase fDB;

    public static FirebaseFactory init() {
        if (firebaseFactory == null) {
            firebaseFactory = new FirebaseFactory();
            firebaseFactory.fDB = FirebaseDatabase.getInstance();
        }

        return firebaseFactory;
    }

}
