package vdhuy.myapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import vdhuy.myapp.databinding.ActivityChatBinding;
import vdhuy.myapp.models.User;
import vdhuy.myapp.utils.Constants;

public class ChatActivity extends AppCompatActivity {
    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetail();
    }

    private void loadReceiverDetail(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(v -> onBackPressed());
    }
}