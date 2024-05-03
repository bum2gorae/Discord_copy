package com.example.discord;

public enum TreeEnum {
    Tree1(R.id.channel_tree1, R.id.channel_tree1_name, R.id.channel_tree1_dropdown),
    Tree2(R.id.channel_tree2, R.id.channel_tree2_name, R.id.channel_tree2_dropdown),
    Tree3(R.id.channel_tree3, R.id.channel_tree3_name, R.id.channel_tree3_dropdown),
    Tree4(R.id.channel_tree4, R.id.channel_tree4_name, R.id.channel_tree4_dropdown);

    private int linearId;
    private int titleId;
    private int btnId;

    TreeEnum(int linearId, int titleId, int btnId) {
        this.linearId = linearId;
        this.titleId = titleId;
        this.btnId = btnId;
    }

    public int getLinearId() {
        return linearId;
    }

    public int getTitleId() {
        return titleId;
    }

    public int getBtnId() { return btnId; }

}
