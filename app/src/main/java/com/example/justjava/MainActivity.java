/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.justjava;



import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    // this is a global variable. this can be used by any of the methods within this class
    int quantity = 2;
    int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //this method is called when the plus button is tapped
    public void increment(View view){
        quantity = quantity + 1;
        display(quantity);
    }

    //this method is called when the minus button is tapped
    public void decrement(View view){
        quantity = quantity - 1;
        display(quantity);
    }

    //method is called when the order button is tapped
    //TODO-ask about View view
    public void submitOrder(View view) {
        String priceMessage = "Total: £" + price*quantity;
        priceMessage = priceMessage + "\nThanks!";
        displayMessage(priceMessage);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        //searching for the ID quantity text view
        quantityTextView.setText("" + number);
    }

    //TODO - ask about this method
    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        //TODO - ask about the below line of code
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}