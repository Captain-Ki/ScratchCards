package com.scratch.cards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import in.myinnos.androidscratchcard.ScratchCard;

public class MainActivity extends AppCompatActivity {

    private ScratchCard mScratchCard1, mScratchCard2, mScratchCard3, mScratchCard4, mScratchCard5, mScratchCard6,
            mScratchCard7, mScratchCard8, mScratchCard9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onResume() {
        super.onResume();

        mScratchCard1 = findViewById(R.id.scratchCard11);
        mScratchCard1.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard1.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard2 = findViewById(R.id.scratchCard12);
        mScratchCard2.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard2.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard3 = findViewById(R.id.scratchCard13);
        mScratchCard3.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard3.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard4 = findViewById(R.id.scratchCard21);
        mScratchCard4.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard4.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard5 = findViewById(R.id.scratchCard22);
        mScratchCard5.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard5.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard6 = findViewById(R.id.scratchCard23);
        mScratchCard6.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard6.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard7 = findViewById(R.id.scratchCard31);
        mScratchCard7.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard7.setVisibility(View.INVISIBLE);

                }
            }
        });

        mScratchCard8 = findViewById(R.id.scratchCard32);
        mScratchCard8.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard8.setVisibility(View.INVISIBLE);
                }
            }
        });

        mScratchCard9 = findViewById(R.id.scratchCard33);
        mScratchCard9.setOnScratchListener(new ScratchCard.OnScratchListener() {
            @Override
            public void onScratch(ScratchCard scratchCard, float visiblePercent) {
                if (visiblePercent > 0.8) {
                    mScratchCard9.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
