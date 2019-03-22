package mad155.kmathes.mad155module10northernlightsanimation;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //.. app to demonstrate use of frame and tween animation

    AnimationDrawable lightsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //.. instantiate ImageView
        ImageView imgFrame = (ImageView) findViewById(R.id.imgLights);
        //.. set background resource image to animation.xml
        imgFrame.setBackgroundResource(R.drawable.animation);
        //.. access the AnimationDrawable object by getting the view object
        lightsAnimation = (AnimationDrawable)imgFrame.getBackground();

        Button button1 = (Button) findViewById(R.id.btnStart);
        Button button2 = (Button) findViewById(R.id.btnStop);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lightsAnimation.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lightsAnimation.stop();
                startActivity(new Intent(MainActivity.this, Tween.class));

            }
        });


    }
}
