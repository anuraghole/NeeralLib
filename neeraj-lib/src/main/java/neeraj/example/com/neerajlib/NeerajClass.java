package neeraj.example.com.neerajlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Neeraj on 12-Feb-18.
 */

public class NeerajClass {
    Context context;

   public NeerajClass(Context context){
        this.context=context;
    }

    void showMessage(String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
