package ir.duniject.neumorphism

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import ir.duniject.neumorphism.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding :ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.neumorphImageView4.setOnClickListener {
            binding.neumorphImageView4.setShapeType(ShapeType.PRESSED)

            binding.neumorphImageView4.setColorFilter( ContextCompat.getColor(this , R.color.blue_light) ,
            android.graphics.PorterDuff.Mode.SRC_IN
            )

        }
        binding.neumorphImageView3.setOnClickListener {
            binding.neumorphImageView3.setShapeType(ShapeType.BASIN)

            binding.neumorphImageView3.setColorFilter(ContextCompat.getColor(this ,R.color.blue_light)
            ,
                android.graphics.PorterDuff.Mode.SRC_IN
            )
        }

        binding.neumorphImageView5.setOnClickListener {
            binding.neumorphImageView5.setShapeType(ShapeType.PRESSED)
            binding.neumorphImageView5.setColorFilter(ContextCompat.getColor(this , R.color.blue_light),
            android.graphics.PorterDuff.Mode.SRC_IN)

        }

        binding.neumorphImageView6.setOnClickListener {
            binding.neumorphImageView6.setShapeType(ShapeType.FLAT)
            binding.neumorphImageView6.setColorFilter(ContextCompat.getColor(this , R.color.text_gray),
            android.graphics.PorterDuff.Mode.SRC_IN
                )
        }

    }
}