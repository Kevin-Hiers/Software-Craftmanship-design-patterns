package be.ucll.crafsmanship.command.gamecontroller;

public class PS5Controller {
    Command crossCommand;
    Command triangleCommand;
    Command squareCommand;
    Command circleCommand;

    public void setCrossButton(Command crossButton) {
        this.crossCommand = crossButton;
    }

    public void pressCross() {
        crossCommand.execute();
    }

    public void setTriangleButton(Command triangleButton) {
        this.triangleCommand = triangleButton;
    }

    public void pressTriangle() {
        triangleCommand.execute();
    }

    public void setSquareButton(Command squareButton) {
        this.squareCommand = squareButton;
    }

    public void pressSquare() {
        squareCommand.execute();
    }

    public void setCircleButton(Command circleButton) {
        this.circleCommand = circleButton;
    }

    public void pressCircle() {
        circleCommand.execute();
    }
}
