package com.vietis.sqlite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> userList = new ArrayList<>();
        userList.add(new User("An Vuong Van", "Mưa lớn sau bão Molave và nhiều thủy điện xả lũ khiến nước các sông trên báo động 3, Quãng Ngãi và Quảng Nam phải di dời dân vùng trũng.", "12:00 AM"));
        userList.add(new User("Hoang Van Thanh", "Theo bản tin lũ khẩn cấp của Đài khí tượng thủy văn tỉnh Quảng Ngãi, lúc 16h ngày 28/10, mực nước sông Trà Bồng tại trạm Châu Ổ trên báo động 2", "10:20 AM"));
        userList.add(new User("Luong Thanh Quang", "Dự báo nước sông tiếp tục dâng cao, dẫn đến ngập sâu trên diện rộng ở các huyện Bình Sơn, Sơn Tịnh, Tư Nghĩa, Mộ Đức, Nghĩa Hành và TP Quảng Ngãi", "15:30 PM"));
        userList.add(new User("Nguyen Hoang Duc", "Hiện hồ thủy điện Đăk Đrinh xả lũ với lưu lượng 1.680 m3/s; hồ chứa nước Nước Trong 1.100 m3/s. Vì vậy mực nước trên các sông tiếp tục lên cao trong 6-12 giờ tới.", "18:20 PM"));

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        UserAdapter adapter = new UserAdapter(this, userList);
        recyclerView.setAdapter(adapter);
    }

}
