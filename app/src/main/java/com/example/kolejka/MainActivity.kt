package com.example.kolejka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Przyciski

        val dodaj = findViewById<Button>(R.id.button)
        val size = findViewById<Button>(R.id.button2)
        val isempty = findViewById<Button>(R.id.button3)
        val wo = findViewById<Button>(R.id.button4)
        val oo = findViewById<Button>(R.id.button5)
        val dodajk = findViewById<Button>(R.id.button6)
        val sizek = findViewById<Button>(R.id.button9)
        val isemptyk = findViewById<Button>(R.id.button10)
        val wok = findViewById<Button>(R.id.button8)
        val ook = findViewById<Button>(R.id.button7)

        //Text boxy

        val stosView = findViewById<TextView>(R.id.stosView)
        val queueView = findViewById<TextView>(R.id.queueView)

        //Klasy

        var stacklist  = Stack()
        var kolejka = Kolejka(mutableListOf())

        //Zmienne pomocnicze

        var x = 0
        var y = 0

        //Funkcje nasłuchujace

        dodaj.setOnClickListener {
            stacklist.push(x)
            stosView.text ="Dodales obiekt: "+ x +" do stosu"
            x++
        }
        size.setOnClickListener {
            stosView.text ="Rozmiar stosu : " +stacklist.size()
        }
        isempty.setOnClickListener {
            stosView.text = "Czy stos jest pusty: "+stacklist.isStackEmpty()
        }
        wo.setOnClickListener {
            stosView.text = "Wziales obiekt: "+stacklist.pop()+ " z stosu"
            if(x>0){
                x--
            }
        }
        oo.setOnClickListener {
            stosView.text = "Na wierzchu stosu jest obiekt: " +stacklist.peek()+"\n"+"Natomias na samym jego dnie jest obiekt: "+stacklist.first()
        }
        dodajk.setOnClickListener {
            kolejka.enqueue(y)
            queueView.text ="Dodales obiekt: "+ y +" do kolejki"
            y++
        }
        sizek.setOnClickListener {
            queueView.text ="Rozmiar kolejki : " +kolejka.count()
        }
        isemptyk.setOnClickListener {
            queueView.text = "Czy kolejka jest pusty: "+kolejka.isEmpty()
        }
        wok.setOnClickListener {
            queueView.text = "Wziales obiekt: "+kolejka.dequeue()+ " z kolejki"

        }
        ook.setOnClickListener {
            queueView.text = "Na ostatnim miejscu w kolejce jest: " +kolejka.peek()+"\n"+"Na pierwszym miejscu kolejki jest: "+kolejka.first()
        }
    }
}

