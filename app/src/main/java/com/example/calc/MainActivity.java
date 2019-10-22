package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calc.R;

public class MainActivity extends AppCompatActivity {
    String outOfArgs = "Too many arguments!!";
    String notEnoughArgs = "Enter more arguments!!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on0(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");

        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }
                else
                {
                    message+=args[i];
                }
            }
            message+="0";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("0");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"0";
            display.setText(message);
        }

        else
        {
            display.setText("0");
        }
    }
    public void on1(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="1";
            display.setText(message);
        }

        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("1");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"1";
            display.setText(message);
        }

        else
        {
            display.setText("1");
        }
    }
    public void on2(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="2";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("2");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"2";
            display.setText(message);
        }

        else
        {
            display.setText("2");
        }
    }
    public void on3(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="3";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("3");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"3";
            display.setText(message);
        }

        else
        {
            display.setText("3");
        }
    }
    public void on4(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="4";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("4");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"4";
            display.setText(message);
        }

        else
        {
            display.setText("4");
        }
    }
    public void on5(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="5";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("5");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"5";
            display.setText(message);
        }

        else
        {
            display.setText("5");
        }
    }
    public void on6(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="6";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("6");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"6";
            display.setText(message);
        }

        else
        {
            display.setText("6");
        }
    }
    public void on7(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="7";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("7");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"7";
            display.setText(message);
        }

        else
        {
            display.setText("7");
        }
    }
    public void on8(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }

                else
                {
                    message+=args[i];
                }
            }
            message+="8";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("8");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"8";
            display.setText(message);
        }

        else
        {
            display.setText("8");
        }
    }
    public void on9(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>=2)
        {
            String message ="";
            for(int i = 0; i<args.length; i++)
            {
                if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
                {
                    message+=" ";
                    message+=args[i];
                    message+=" ";
                }
                else
                {
                    message+=args[i];
                }
            }
            message+="9";
            display.setText(message);
        }
        else if(args[0].equals("0.0")||args[0].equals("0"))
        {
            display.setText("9");
        }
        else if(args.length == 1)
        {
            String message = args[0]+""+"9";
            display.setText(message);
        }

        else
        {
            display.setText("9");
        }
    }
    public void onAC(View view)
    {
        TextView display = findViewById(R.id.display);
        display.setText("");
    }

    public void onPlus(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        int count = 0;

       for(int i = 0 ; i < args.length; i++)
    {
        if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
        {
            count++;
        }
    }
       if(count == 0)
       {
           String message = args[0] + " + ";
           display.setText(message);
       }
       else
       {
           Toast outofargs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
           outofargs.show();
       }
    }
    public void onMinus(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        int count = 0;

        for(int i = 0 ; i < args.length; i++)
        {
            if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
            {
                count++;
            }
        }
        if(count == 0)
        {
            String message = args[0] + " - ";
            display.setText(message);
        }
        else
        {
            Toast outofargs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
            outofargs.show();
        }
    }
    public void onMulti(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        int count = 0;

        for(int i = 0 ; i < args.length; i++)
        {
            if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
            {
                count++;
            }
        }
        if(count == 0)
        {
            String message = args[0] + " * ";
            display.setText(message);
        }
        else
        {
            Toast outofargs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
            outofargs.show();
        }
    }
    public void onDivide(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        int count = 0;

        for(int i = 0 ; i < args.length; i++)
        {
            if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
            {
                count++;
            }
        }
        if(count == 0)
        {
            String message = args[0] + " / ";
            display.setText(message);
        }
        else
        {
            Toast outofargs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
            outofargs.show();
        }
    }
    public void onSquare(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length>1)
        {
            Toast outofargs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
            outofargs.show();
        }
        else
        {
            double x = Double.parseDouble(text);
            x = x*x;
            display.setText(String.valueOf(x));
        }
    }
    public void onEquals(View view)
    {
        TextView display = findViewById(R.id.display);
        String text = display.getText().toString();
        String [] args = text.split(" ");
        if(args.length<3)
        {
            Toast notenoughArgs = Toast.makeText(this, notEnoughArgs, Toast.LENGTH_SHORT);
            notenoughArgs.show();
        }
        else
        {
            if(args[1].equals("+"))
            {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);
                display.setText(String.valueOf(a+b));
            }
            else if(args[1].equals("-"))
            {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);
                display.setText(String.valueOf(a-b));
            }
            else if(args[1].equals("*"))
            {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);
                display.setText(String.valueOf(a*b));
            }
            else if(args[1].equals("/"))
            {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[2]);
                display.setText(String.valueOf(a/b));
            }
        }

    }


}
//    int count = 0;
//
//       for(int i = 0 ; i < args.length; i++)
//    {
//        if(args[i].equals("+") || args[i].equals("-") || args[i].equals("/") || args[i].equals("*"))
//        {
//            count++;
//        }
//    }
//        if(count>1)
//    {
//        Toast outofArgs = Toast.makeText(this, outOfArgs, Toast.LENGTH_SHORT);
//        outofArgs.show();
//        display.setText("");
//    }
