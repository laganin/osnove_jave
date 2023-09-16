package p12_09_2023.Zadatak3;

public class ViberReaction {

    private String emoji;
    private ViberUser whoReacted;

//    public ViberReaction(ViberUser user){
//        this.whoReacted = user;
//    }

    public void print() {
        System.out.println(this.emoji + " from " + this.whoReacted.getFullName());
    }

    public String getEmoji() {
        return this.emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public ViberUser getWhoReacted() {
        return this.whoReacted;
    }

    public void setWhoReacted(ViberUser whoReacted) {
        this.whoReacted = whoReacted;
    }
}
