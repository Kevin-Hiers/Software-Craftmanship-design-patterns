package be.ucll.crafsmanship.command.gamecontroller;

public class PS5Controller {
    Command command;

    public void setCrossButton(Command crossButton) {
        this.command = crossButton;
    }

    public void pressCross() {
        command.execute();
    }

    public void setTriangleButton(Command triangleButton) {
        this.command = triangleButton;
    }

    public void pressTriangle() {
        command.execute();
    }

    public void setSquareButton(Command squareButton) {
        this.command = squareButton;
    }

    public void pressSquare() {
        command.execute();
    }

    public void setCircleButton(Command circleButton) {
        this.command = circleButton;
    }

    public void pressCircle() {
        command.execute();
    }
}
