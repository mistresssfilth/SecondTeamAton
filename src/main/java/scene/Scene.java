package scene;

public class Scene {
    private String[] replicas = {
            "Hey, hey",
            "Hey.",
            "Hey.",
            "And this from the cry-for-help department. Are you wearing makeup?",
            "Yes, I am. As of today, I am officially Joey Tribbiani, actor slash model.",
            "That's so funny, 'cause I was thinking you look more like Joey Tribbiani, man slash woman.",
            "What were you modeling fro?",
            "you know those posters for the City Free Clinic?",
            "Oh, wow, so you're gonna be one of those \"healthy, healthy, healthy guys \" ?",
            "You know, the asthma guy was really cute.",
            "Do you know which one you're gonna be?",
            "No, but I hear disease is open, so... (crosses fingers)",
            "Good luck, man. I hope you get it.",
            "Thanks."
    };
    public String getReplica(int pos){
        return replicas[pos];
    }
}
