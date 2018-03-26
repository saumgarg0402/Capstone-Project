package com.android.GetFit.models;

/**
 * Created by saumgarg on 25/03/18.
 */

import com.google.firebase.database.IgnoreExtraProperties;
import java.util.Map;
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public Map<String,Integer> weights;
    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email,Map<String,Integer> weights ) {
        this.username = username;
        this.email = email;
        this.weights=weights;
    }

}
