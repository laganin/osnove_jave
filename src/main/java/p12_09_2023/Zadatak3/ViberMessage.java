package p12_09_2023.Zadatak3;

public class ViberMessage {

    private String text;
    private String time;
    private ViberUser sender;
    private ViberUser receiver;
    private ViberReaction emoji;

    public void print() {
        System.out.print("From: " + this.sender.getFullName() + " * ");
        boolean active = this.sender.getActive();
        if ((active == false)) {
            System.out.print("not active now");
        } else if (active == true) {
            System.out.print("active now");
        }
        System.out.println(" - at " + this.time);
        System.out.println("To: " + this.receiver.getFullName());
        System.out.print(this.text + " : ");
        emoji.print();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ViberUser getSender() {
        return this.sender;
    }

    public void setSender(ViberUser sender) {
        this.sender = sender;
    }

    public ViberUser getReceiver() {
        return this.receiver;
    }

    public void setReceiver(ViberUser receiver) {
        this.receiver = receiver;
    }

    public ViberReaction getEmoji() {
        return this.emoji;
    }

    public void setEmoji(ViberReaction emoji) {
        this.emoji = emoji;
    }
}
