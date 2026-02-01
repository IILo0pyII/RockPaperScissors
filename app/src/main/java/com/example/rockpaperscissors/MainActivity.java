package com.example.rockpaperscissors;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.rockpaperscissors.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int playerScore = 0;
    private int compScore = 0;


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

    private Weapon getRandomWeapon() {
        Weapon[] weapons = Weapon.values();

        int index = (int)(Math.random() * weapons.length);
        return weapons[index];
    }

    private String getResult(Weapon player, Weapon comp) {
        if (player == comp) {
            return "It's a tie!";
        }

        if (player == Weapon.ROCK && comp == Weapon.SCISSORS) {
            playerScore++;
            return "Player wins: Rock crushes scissors!";
        }

        if (player == Weapon.SCISSORS && comp == Weapon.PAPER) {
            playerScore++;
            return "Player wins: Scissors cuts paper!";
        }

        if (player == Weapon.PAPER && comp == Weapon.ROCK) {
            playerScore++;
            return "Player wins: Paper covers rock!";
        }

        if (comp == Weapon.ROCK && player == Weapon.SCISSORS) {
            compScore++;
            return "Computer wins: Rock crushes scissors!";
        }

        if (comp == Weapon.SCISSORS && player == Weapon.PAPER) {
            compScore++;
            return "Computer wins: Scissors cuts paper!";
        }

        if (comp == Weapon.PAPER && player == Weapon.ROCK) {
            compScore++;
            return "Computer wins: Paper covers rock!";
        }

        return null;
    }

    @SuppressLint("SetTextI18n")
    public void onClickRock (View v) {
        Weapon pWeapon = Weapon.ROCK;
        Weapon cWeapon = getRandomWeapon();

        binding.pWeaponText.setText("Player's Weapon: " + pWeapon);
        binding.cWeaponText.setText("Computer's Weapon: " + cWeapon);

        String result = getResult(pWeapon, cWeapon);
        binding.scoreText.setText("Player: " + playerScore + ", Computer: " + compScore);
        binding.resultText.setText(result);
    }

    @SuppressLint("SetTextI18n")
    public void onClickPaper (View v) {
        //had to add this line because i messed up the repository stuff.
        Weapon pWeapon = Weapon.PAPER;
        Weapon cWeapon = getRandomWeapon();

        binding.pWeaponText.setText("Player's Weapon: " + pWeapon);
        binding.cWeaponText.setText("Computer's Weapon: " + cWeapon);

        String result = getResult(pWeapon, cWeapon);
        binding.scoreText.setText("Player: " + playerScore + ", Computer: " + compScore);
        binding.resultText.setText(result);

    }

    @SuppressLint("SetTextI18n")
    public void onClickScissors (View v) {
        Weapon pWeapon = Weapon.SCISSORS;
        Weapon cWeapon = getRandomWeapon();

        binding.pWeaponText.setText("Player's Weapon: " + pWeapon);
        binding.cWeaponText.setText("Computer's Weapon: " + cWeapon);

        String result = getResult(pWeapon, cWeapon);
        binding.scoreText.setText("Player: " + playerScore + ", Computer: " + compScore);
        binding.resultText.setText(result);

    }
}