package com.example.kevin.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements Runnable {
  //  Bitmap bitmap = BitmapFactory.decodeFile("drawable/icon");
   // BitmapDrawable background = new BitmapDrawable(this.bitmap);
    boolean mode = false;
    Button playsound1;
    Button playsound10;
    Button playsound11;
    Button playsound12;
    Button playsound13;
    Button playsound14;
    Button playsound15;
    Button playsound16;
    Button playsound17;
    Button playsound18;

    Button playsound2;
    Button playsound3;
    Button playsound4;
    Button playsound5;
    Button playsound6;
    Button playsound7;
    Button playsound8;
    Button playsound9;
    Double random;
    Switch switch1;
    private View root = null;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        // this.root = findViewById(16908290);

        final MediaPlayer gachi = MediaPlayer.create(this, R.raw.stick);
        final MediaPlayer gachi2 = MediaPlayer.create(this, R.raw.fisting);
        final MediaPlayer gachi3 = MediaPlayer.create(this, R.raw.isaw);
        final MediaPlayer gachi4 = MediaPlayer.create(this, R.raw.blblblb);

       final MediaPlayer create = MediaPlayer.create(this, R.raw.allez);
        final MediaPlayer create2 = MediaPlayer.create(this, R.raw.hop);
        final MediaPlayer create3 = MediaPlayer.create(this, R.raw.brrrrrr);
        final MediaPlayer create4 = MediaPlayer.create(this, R.raw.mhhhhh);
        final MediaPlayer create5 = MediaPlayer.create(this, R.raw.belastend);
        final MediaPlayer create6 = MediaPlayer.create(this, R.raw.tout_le_monde);
        final MediaPlayer create7 = MediaPlayer.create(this, R.raw.play);
        final MediaPlayer create8 = MediaPlayer.create(this, R.raw.faircatch);
        final MediaPlayer create9 = MediaPlayer.create(this, R.raw.gruesli);
        final MediaPlayer create10 = MediaPlayer.create(this, R.raw.hui);
        final MediaPlayer create11 = MediaPlayer.create(this, R.raw.kling);
        final MediaPlayer create12 = MediaPlayer.create(this, R.raw.wurf);
        final MediaPlayer create13 = MediaPlayer.create(this, R.raw.izz);
        final MediaPlayer create14 = MediaPlayer.create(this, R.raw.wuhu);
        final MediaPlayer create15 = MediaPlayer.create(this, R.raw.isaw);
        final MediaPlayer create18 = MediaPlayer.create(this, R.raw.flea);
        final MediaPlayer create17 = MediaPlayer.create(this, R.raw.babybaby);
        final MediaPlayer create16 = MediaPlayer.create(this, R.raw.misterworldwide);
       // this.switch1 = (Switch) findViewById(R.id.switcher);
        this.playsound1 = (Button) findViewById(R.id.button1);
        this.playsound2 = (Button) findViewById(R.id.button2);
        this.playsound3 = (Button) findViewById(R.id.button3);
        this.playsound4 = (Button) findViewById(R.id.button4);
        this.playsound5 = (Button) findViewById(R.id.button5);
        this.playsound6 = (Button) findViewById(R.id.button6);
        this.playsound7 = (Button) findViewById(R.id.button7);
        this.playsound8 = (Button) findViewById(R.id.button8);
        this.playsound9 = (Button) findViewById(R.id.button9);
        this.playsound10 = (Button) findViewById(R.id.button10);
        this.playsound11 = (Button) findViewById(R.id.button11);
        this.playsound12 = (Button) findViewById(R.id.button12);
        this.playsound13 = (Button) findViewById(R.id.button13);
        this.playsound14 = (Button) findViewById(R.id.button14);
        this.playsound15 = (Button) findViewById(R.id.button15);
        this.playsound16 = (Button) findViewById(R.id.button16);
        this.playsound17 = (Button) findViewById(R.id.button17);
        this.playsound18 = (Button) findViewById(R.id.button18);
        this.playsound1.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                    create.start();

                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
       this.playsound2.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                    create2.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound3.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create3.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound4.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create4.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound5.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create5.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound6.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create6.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
      this.playsound7.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create7.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound8.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create8.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound9.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create9.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound10.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create10.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound11.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create11.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound12.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create12.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound13.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create13.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound14.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create14.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound15.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create15.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound16.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create16.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound17.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create17.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }
            }
        });
        this.playsound18.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                random = Math.random();
                if (random>0.04)
                create18.start();
                else{
                    if (random >= 0.0 && random < 0.01) {
                        gachi.start();
                    }
                    if (random >= 0.01 && random < 0.02) {
                        gachi2.start();
                    }
                    if (random >= 0.02 && random < 0.03) {
                        gachi3.start();
                    }
                    if (random >= 0.03 && random < 0.04) {
                        gachi4.start();
                    }
                }

            }
        });
       onPause();
       /*this.switch1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton compoundButton, boolean mode) {
                if (!MainActivity.this.mode) {
                    MainActivity.this.mode = true;
                    MainActivity.this.onResume();
                    return;
                }
                MainActivity.this.mode = false;
                MainActivity.this.onPause();
            }
        });*/
    }

    public void onResume() {
        super.onResume();
        run();
    }

    public void onPause() {
        super.onPause();
    }

    public void run() {



        }

    }


