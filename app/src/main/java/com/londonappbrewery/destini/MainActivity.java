package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mButtonAnswer1;
    private Button mButtonAnswer2;
    private TextView mStoryTextView;
    private StoryBranch mCurrentBranch;
    private StoryBranch[] mStory = new StoryBranch[]{
            new StoryBranch(1, R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2,3,2),
            new StoryBranch(2, R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2,3,4),
            new StoryBranch(3, R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2,6,5),
            new StoryBranch(4, R.string.T4_End,0, 0,0,0),
            new StoryBranch(5, R.string.T5_End, 0,0,0,0),
            new StoryBranch(6, R.string.T6_End, 0, 0,0,0),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mButtonAnswer1 = findViewById(R.id.buttonTop);
        mButtonAnswer2 = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);
        mCurrentBranch = mStory[0];
        updateStoryDisplay();
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextBranch = mCurrentBranch.getAns1NextBranchId() - 1;
                if ( nextBranch > 0)
                    mCurrentBranch = mStory[nextBranch];
                updateStoryDisplay();
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nextBranch = mCurrentBranch.getAns2NextBranchId() - 1;
                if( nextBranch > 0)
                    mCurrentBranch = mStory[nextBranch];
                updateStoryDisplay();
            }
        });



    }
    private void updateStoryDisplay()
    {
        mStoryTextView.setText(mCurrentBranch.getStoryTextId());
        if ( mCurrentBranch.getAns1NextBranchId() > 0 && mCurrentBranch.getAns2NextBranchId() > 0 ) {
            mButtonAnswer1.setText(mCurrentBranch.getAns1TextId());
            mButtonAnswer2.setText(mCurrentBranch.getAns2TextId());
        }
    }
}
