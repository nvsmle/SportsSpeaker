package nvsmle.packag.com.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing, imgKickboxing, imgJudo, imgKarate, imgAikido, imgTaekwondo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing = findViewById(R.id.imgBoxing);
        imgKickboxing = findViewById(R.id.imgKickboxing);
        imgJudo = findViewById(R.id.imgJudo);
        imgKarate = findViewById(R.id.imgKarate);
        imgAikido = findViewById(R.id.imgAikido);
        imgTaekwondo = findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgKickboxing.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View imageButtonView) {

        playSportName(imageButtonView.getTag().toString());

        switch (imageButtonView.getId()) {

            case R.id.imgBoxing:

//                playSportName(imageButtonView.getTag().toString());
                break;
            case R.id.imgKickboxing:

//                playSportName(imageButtonView.getTag().toString());
                break;

            case R.id.imgJudo:

                break;

            case R.id.imgKarate:

                break;

            case R.id.imgAikido:

                break;

            case R.id.imgTaekwondo:

                break;
        }

    }

    private void playSportName(String sportName) {

        MediaPlayer sportPlayer = MediaPlayer.create(MainActivity.this, getResources().getIdentifier(sportName, "raw", getPackageName()));
        sportPlayer.start();

    }
}
