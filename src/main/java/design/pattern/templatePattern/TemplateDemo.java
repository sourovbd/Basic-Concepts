package design.pattern.templatePattern;

public class TemplateDemo {
    public static void main(String[] args) {
        Game game = null;
        game = new Cricket();
        game.play();
        game = new Football();
        game.play();
    }
}
