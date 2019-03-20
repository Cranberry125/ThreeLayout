# ThreeLayout<br/>
lab2:linearlayout  constraintlayout tablelayout<br/>
java files:<br/>
mainActivity.java<br/>  
core code:<br/>
```
package com.example.threelayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Intent it=new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn1:
                it.setClass(MainActivity.this,layoutActivity.class);
                startActivity(it);
                break;
            case R.id.btn2:
                it.setClass(MainActivity.this,layout2Activity.class);
                startActivity(it);
                break;
            case R.id.btn3:
                it.setClass(MainActivity.this,layout3Activity.class);
                startActivity(it);
                break;
        }
    }
}

```
<br/>

layoutActivity.java  core code:<br/>
```
package com.example.threelayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class layoutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
    }
}

```

<br/>

layout2Activity.java  core code:<br/>
```
package com.example.threelayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class layout2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }
}
```

<br/>

layout3Activity.java  core code:<br/>
```
package com.example.threelayout;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
public class layout3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);
    }
}

```

<br/>
xml files<br/>
activity_main.xml core code:<br/>
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <Button
        android:id="@+id/btn1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="布局1"
        android:onClick="onClick"/>
    <Button
        android:id="@+id/btn2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="布局2"
        android:onClick="onClick"
        />
    <Button
        android:id="@+id/btn3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="布局3"
        android:onClick="onClick"/>
</LinearLayout>
```

<br/>


the screenshot of main interface:<br/>
![mainlayout](https://i.loli.net/2019/03/20/5c91e65d453c4.jpg)<br/>
layout.xml core code:<br/>
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical">
    <!--  第1行   -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:id="@+id/btn_one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="One,One" />

        <Button
            android:id="@+id/btn_two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="One,Two" />


        <Button
            android:id="@+id/btn_three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="One,Three" />

        <Button
            android:id="@+id/btn_four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="One,Four" />
    </LinearLayout>
    <!--  第2行   -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:orientation="horizontal">

        <Button
            android:id="@+id/btn1_one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Two,One"/>
        <Button
            android:id="@+id/btn1_two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Two,Two"/>
        <Button
            android:id="@+id/btn1_three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Two,Three"/>
        <Button
            android:id="@+id/btn1_four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Two,Four"/>

    </LinearLayout>
    <!--  第3行   -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:orientation="horizontal">

        <Button
            android:id="@+id/btn2_one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Three,One"/>
        <Button
            android:id="@+id/btn2_two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Three,Two"/>
        <Button
            android:id="@+id/btn2_three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="2"
            android:text="Three,Three"/>
        <Button
            android:id="@+id/btn2_four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Three,Four"/>

    </LinearLayout>
    <!--  第4行   -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"

        android:orientation="horizontal">

        <Button
            android:id="@+id/btn3_one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Four,One" />

        <Button
            android:id="@+id/btn3_two"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="3"
            android:text="Four,Two" />


        <Button
            android:id="@+id/btn3_three"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Four,Three" />

        <Button
            android:id="@+id/btn3_four"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Four,Four" />
    </LinearLayout>
</LinearLayout>

```

<br/>
the screenshot of layout interface:<br/>
![layout:linearlayout](https://i.loli.net/2019/03/20/5c91e666da7d8.jpg)<br/>

layout2.xml core code:<br/>
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#292929"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/button"
        android:layout_width="79dp"
        android:layout_height="79dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="292dp"
        android:layout_marginRight="292dp"
        android:layout_marginBottom="8dp"
        android:background="#FF3030"
        android:text="RED"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.972"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.026" />

    <Button
        android:id="@+id/button3"
        android:layout_width="102dp"
        android:layout_height="79dp"
        android:layout_marginStart="28dp"
        android:layout_marginLeft="28dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="#D2691E"
        android:text="ORANGE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.101"
        app:layout_constraintStart_toEndOf="@+id/button"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.026" />

    <Button
        android:id="@+id/button4"
        android:layout_width="86dp"
        android:layout_height="80dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="#CDCD00"
        android:text="YELLOW"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.932"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.026" />

    <Button
        android:id="@+id/button5"
        android:layout_width="61dp"
        android:layout_height="75dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="#66CD00"
        android:text="GREEN"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.293"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.315" />

    <Button
        android:id="@+id/button6"
        android:layout_width="54dp"
        android:layout_height="78dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="#6CA6CD"
        android:text="BLUE"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.53"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.312" />

    <Button
        android:id="@+id/button8"
        android:layout_width="60dp"
        android:layout_height="72dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:background="#5D478B"
        android:text="INDIGO"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.141"
        app:layout_constraintStart_toEndOf="@+id/button6"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.314" />

    <Button
        android:id="@+id/button9"
        android:layout_width="398dp"
        android:layout_height="52dp"
        android:layout_marginTop="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="8dp"
        android:text="VIOLET"
        android:background="#CD6090"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.987" />
    </android.support.constraint.ConstraintLayout>

```

<br/>
the screenshot of layout2 interface:<br/>
![layout2:constraintlayut](https://i.loli.net/2019/03/20/5c91e67160f9f.jpg)<br/>
layout3.xml core code:<br/>

```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:background="@color/colorPrimary"
    android:stretchColumns="0"
    >
    <TableRow>
        <TextView
            android:id="@+id/row1"
            android:layout_height="wrap_content"
            android:layout_column="0"
            android:padding="10dp"
            android:text="@string/row1_name"
            android:textSize="25sp" />

        <TextView
            android:gravity="right"
            android:layout_width="wrap_content"
            android:padding="10dp"
            android:text="@string/row1_name2"
            android:textSize="25sp" />
    </TableRow>
    <TableRow>
        <TextView
            android:id="@+id/row2"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:textSize="25sp"
            android:text="@string/row2_name"
            />
        <TextView
            android:gravity="right"
            android:padding="10dp"
            android:text="@string/row2_name2"
            android:textSize="25sp" />
    </TableRow>
    <TableRow>
        <TextView
            android:id="@+id/row3"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:textSize="25sp"
            android:text="@string/row3_name"
            />
        <TextView
            android:gravity="right"
            android:padding="10dp"
            android:text="@string/row3_name2"
            android:textSize="25sp" />
    </TableRow>
    <TableRow>
        <View
            android:background="@color/colorPrimaryDark"
            android:layout_height="4dp"/>
        <View
            android:background="@color/colorPrimaryDark"
            android:layout_height="4dp"/>
    </TableRow>

    <TableRow>
        <TextView
            android:id="@+id/row4"
            android:layout_height="wrap_content"
            android:textSize="25sp"
            android:text="@string/row4_name"
         />
    </TableRow>
    <TableRow>
        <TextView
            android:id="@+id/row5"
            android:layout_height="wrap_content"
            android:layout_span="1"
            android:textSize="25sp"
            android:text="@string/row5_name"
            />
        <TextView
            android:gravity="right"
            android:padding="10dp"
            android:text="@string/row5_name2"
            android:textSize="25sp" />
    </TableRow>
    <TableRow>
        <View
            android:background="@color/colorPrimaryDark"
            android:layout_height="4dp"/>
        <View
            android:background="@color/colorPrimaryDark"
            android:layout_height="4dp"/>
    </TableRow>
    <TableRow>
        <TextView
            android:id="@+id/row6"
            android:layout_height="wrap_content"
            android:padding="10dp"
            android:textSize="25sp"
            android:text="@string/row6_name"
            />
    </TableRow>
</TableLayout>
```

<br/>
the screenshot of layout3 interface:<br/>
![layout3:tablelayout](https://i.loli.net/2019/03/20/5c91e6797bffc.jpg)

