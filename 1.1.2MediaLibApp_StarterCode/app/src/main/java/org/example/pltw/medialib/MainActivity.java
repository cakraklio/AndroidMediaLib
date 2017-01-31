package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
;       Greeter greeter = new Greeter();
        welcomeText.setText(greeter.message);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public class Greeter {
        public String message = "Welcome to Your Media Library";
    }
    //Also ask if this can go into on create because everything broke last time
    public void showMedia(View v) {
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        //Talk about where this can go
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song();
        song1.setTitle("Leroy Brown");
        song1.setPrice(1.99);
        outputText.append(song1.getTitle());
        outputText.append("\n");
        outputText.append("Price:"+song1.getPrice());
        outputText.append("\n");
        //System.out.println(song1.getTitle());
        song1.setRating(5);
        System.out.println(song1.getRating());

        Book book1 = new Book();
        book1.setTitle("Hardy Boys");
        System.out.println(book1.getTitle());
        book1.setRating(5);
        outputText.append(book1.getTitle());
        outputText.append("\n");
        //System.out.println(book1.getRating());

        Movie movie1 = new Movie();
        movie1.setTitle("Cool Hand Luke");
        System.out.println(movie1.getTitle());
        movie1.setRating(5);
        outputText.append(movie1.getTitle());
        //System.out.println(movie1.getRating());
    }
}
