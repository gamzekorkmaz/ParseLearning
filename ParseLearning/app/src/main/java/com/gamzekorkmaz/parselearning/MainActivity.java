package com.gamzekorkmaz.parselearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.net.PasswordAuthentication;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //VERİTABANI İŞLEMLERİ GENEL ÖRNEKLER

        /*
        ParseObject object = new ParseObject("Fruits");

        object.put("name", "apple");
        object.put("calories", "100");

        object.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if(e!=null) {
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage().toString(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Object saved!", Toast.LENGTH_LONG).show();
                }
            }
        });

        ParseQuery<ParseObject> query=ParseQuery.getQuery("Fruits");
        query.getInBackground("VmthXEUaNg", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if(e != null){
                    e.printStackTrace();
                }else{
                    String objectName = object.getString("name");
                    int objectCalories = object.getInt("calories");
                    System.out.println("name: " + objectName + " " + "calories: " + objectCalories);
                }
            }
        });

        ParseQuery<ParseObject> query=ParseQuery.getQuery("Fruits");
        //sadece muzu çekmek istiyorsak ancak id sini bilmiyorsak;
        query.whereEqualTo("name", "banana");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(List<ParseObject> objects, ParseException e) {
                if(e != null){
                    e.printStackTrace();
                }else{
                    if(objects.size() > 0){
                        for(ParseObject object : objects){
                            String objectName=object.getString("name");
                            int objectCalories = object.getInt("calories");
                            System.out.println("name: " + objectName + " " + "calories: " + objectCalories);
                        }
                    }
                }
            }
        });
*/
        /*

        //KULLANICI İŞLEMLERİ

        ParseUser user = new ParseUser();
        user.setUsername("gamze");
        user.setPassword("123456");
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if(e != null){
                    e.printStackTrace();
                }else{
                    Toast.makeText(getApplicationContext(), "Signed Up!", Toast.LENGTH_LONG).show();

                }
            }
        });

        ParseUser.logInInBackground("gamze", "12356", new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if(e != null){
                    //yanlış giriş
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_LONG).show();

                }
                else { //doğru giriş
                    Toast.makeText(getApplicationContext(), "Welcome " + user.getUsername(), Toast.LENGTH_LONG).show();

                }

            }
        });
        */
    }
}
