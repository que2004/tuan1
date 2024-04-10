package com.tranlamque.myfirstapp.Tuan11;


        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import androidx.appcompat.app.AppCompatActivity;
        import com.tranlamque.myfirstapp.R;

public class Tuan11MainActivity extends AppCompatActivity {
    //khai bao cac control
    EditText txt1, txt2;
    Button Btn1;
    TextView Tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        //anh xa cac control
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        Btn1=findViewById(R.id.demo11Btn1);
        Tv1=findViewById(R.id.demo11Tv1);
        //su ly su kien
        Btn1.setOnClickListener(v -> {
            //goi ham tinh tong
            tinhTong();

        });
    }
    //dinh nghia ham tinh tong
    private void tinhTong() {
        //lay du lieu nhap vao tu edit text 1
        String str1=txt1.getText().toString();
        Float so1=Float.parseFloat(str1);//chuyen du lieu sang so
        //lay du lieu nhap vao tu edit text 12
        String str2=txt2.getText().toString();
        Float so2=Float.parseFloat(str2);//chuyen du lieu sang so
        //tinh tong
        float tong=so1+so2;
        //in ket qua ra man hinh
        Tv1.setText(String.valueOf(tong));
    }
}