package com.londonappbrewery.destini;

public class StoryBranch {
    private int mBranchId;
    private int mStoryTextId;
    private int mAns1NextBranchId;
    private int mAns2NextBranchId;
    private int mAns1TextId;
    private int mAns2TextId;

    public StoryBranch(int branchId, int storyTextId, int ans1TextId, int ans2TextId, int ans1NextBranchId, int ans2NextBranchId){
        mBranchId = branchId;
        mStoryTextId = storyTextId;
        mAns1TextId = ans1TextId;
        mAns2TextId = ans2TextId;
        mAns1NextBranchId = ans1NextBranchId;
        mAns2NextBranchId = ans2NextBranchId;
    }

    public int getBranchId() {
        return mBranchId;
    }

    public int getStoryTextId() {
        return mStoryTextId;
    }

    public int getAns1TextId() {
        return mAns1TextId;
    }

    public int getAns2TextId() {
        return mAns2TextId;
    }

    public int getAns1NextBranchId() {
        return mAns1NextBranchId;
    }

    public int getAns2NextBranchId() {
        return mAns2NextBranchId;
    }

}

