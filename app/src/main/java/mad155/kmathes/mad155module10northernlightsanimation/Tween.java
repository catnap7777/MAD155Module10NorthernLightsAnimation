package mad155.kmathes.mad155module10northernlightsanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        ImageView imgRotate = (ImageView) findViewById(R.id.imgTween);

        imgRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));

    }
}
