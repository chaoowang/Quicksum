# Quicksum
A App enables user to quickly add up numbers range from 1 to 9. The Quicksum App is a cross between a Utility App and a Productivity App.
## Construct the UI
### vertical LinearLayoutCompat
```
<androidx.appcompat.widget.LinerLayoutCompat
  ...
  android:orientation:"vertical">
  ...
</androidx.appcompat.widget.LinerLayoutCompat>
```
LinearLayoutCompat is similiar to LinearLayout. The Compat layout has all methods of the LinearLayout without any API level limitation.
### TextView
```
<TextVIew
  ...
  android:layout_marginTop="16dp"
  android:textSize="100sp"/>
```
- XML tags ending with "/>" empty tags - since they can't be used to contain other tags.
- dp stands for "density-independent pixels"
- sp stands for "scalable pixels" (never use sp for layout_margin/width/height)
### TableLayout
```
<TableLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <TableRow
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1">

            <Button
            ...
            />
        </TableRow>
        ...
</TableLayout>
```
## Java Code
### Button Handler
```
public void buttonClicked(View view) {
        Button button = (Button) view;

        int number = Integer.parseInt(button.getText().toString());
        sum += number;

        TextView textView = findViewById(R.id.sum);
        String result = "" + sum;
        textView.setText(result);
    }
```
The parameter **view** will actually be the Button that caused the event, also know as event source.

Noted that the **sum** in *sum += number* is a int, a sum member field is added to MainActivity.  
For the **sum** in *R.id.sum* is a text id declare in the xml file.
### OnClickListener
```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ...
        Button btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(v -> buttonClicked(btn1));
        ...
    }
```
An older way to handle the button click is through the onClick attributes of Button in xml file.  
However, using onClick is deprecated since Android API31.  
The preferred way is set the OnClickListener, or use databinding.
### string resources
Hardcoded string in layout is discourage. Instead, you should use string resources, which means strings are store in another separate file where they are easily changble for different languages and so on.

In strings.xml
```
<resources>
    ...
    <string name="clear">CLEAR</string>
</resources>
```
In acvicity_main.xml

```
<Button   
    ...       
    android:text="@string/clear"/>
```
