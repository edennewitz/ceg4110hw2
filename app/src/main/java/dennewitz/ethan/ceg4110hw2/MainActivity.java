package dennewitz.ethan.ceg4110hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;




public class MainActivity extends AppCompatActivity {

    public Button secondButton;
    public Button minuteButton;
    public Button hourButton;
    public Button dayButton;
    public Button monthButton;
    public Button yearButton;
    public Button analogButton;
    public Button digitalButton;
    public Button undoButton;
    public Button redoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondButton = findViewById(R.id.secondButton);
        minuteButton = findViewById(R.id.minuteButton);
        hourButton = findViewById(R.id.hourButton);
        dayButton = findViewById(R.id.dayButton);
        monthButton = findViewById(R.id.monthButton);
        yearButton = findViewById(R.id.yearButton);
        analogButton = findViewById(R.id.analogButton);
        digitalButton = findViewById(R.id.digitalButton); 
        secondButton = findViewById(R.id.secondButton);
        undoButton = findViewById(R.id.undoButton);
        redoButton = findViewById(R.id.redoButton);





    }

    class Time{
        int second;
        int minute;
        int hour;
    }

    class Date{
        int day;
        String month;
        int year;
    }

    interface Command
    {
        public void execute();

    }

    class changeSec implements Command{
        Time time ;

        public void changeSec(Time time){

        }
        public void execute(){

        }
    }
    class changeMin implements Command{
        Time time;


        public void execute(){

        }
    }
    class changeHour implements Command{
        public void execute(){

        }
    }
    class changeDay implements Command{
        public void execute(){

        }
    }
    class changeMonth implements Command{
        public void execute(){

        }
    }
    class changeYear implements Command{
        public void execute(){

        }
    }
    class undo implements Command{
        public void execute(){

        }
    }
    class redo implements Command{
        public void execute(){

        }
    }
    class addAnalog implements Command{
        public void execute(){

        }
    }
    class addDigital implements Command{
        public void execute(){

        }
    }

}
