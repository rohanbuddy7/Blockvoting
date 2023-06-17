package com.example.blockvoting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.blockvoting.databinding.ActivityVotingBinding


class VotingActivity : AppCompatActivity() {
    private var _binding: ActivityVotingBinding? = null;
    val binding: ActivityVotingBinding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityVotingBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.voteButton.setOnClickListener {

        }
    }

}
