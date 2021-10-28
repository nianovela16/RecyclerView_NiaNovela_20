package com.example.recyclerviewkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                "Ant-Man",
                "Nama asli Ant-Man adalah Scott Lang. Setelah dibebaskan dari penjara, pencuri ulung Scott Lang bergerak dengan teman satu sel lamanya, Luis. Lang setuju untuk bergabung dengan Luis kru dan melakukan perampokan uang. Rumah yang dirampok itu adalah milik ilmuwan Hank Pym, pemilik teknologi Ant-Man."
            ),
            Superhero(
                R.drawable.blackpanther,
                "Black Panther",
                "Nama asli Black Panther adalah T'Challa. Dia adalah pemburu terampil, pelacak, ahli strategi, politisi, penemu, dan ilmuwan. Dia memiliki gelar Ph.D. Di bidang Fisika dari Universitas Oxford. Black Panther sendiri adalah gelar seremonial yang diberikan kepada kepala Suku Panther dari negara maju di Afrika, Wakanda."
            ),
            Superhero(
                R.drawable.blackwidow,
                "Black Widow",
                "Nama asli Black Widow adalah Natalia Alianovna Romanova atau Natasha Romanoff. Black Widow memiliki kecerdasan yang berbakat. Dia menunjukkan afinitas yang luar biasa untuk manipulasi psikologis dan dapat menutupi emosinya yang sebenarnya dengan sempurna."
            ),
            Superhero(
                R.drawable.captainamerica,
                "Captain America",
                "Nama asli Captain America adalah Steven \"Steve\" Rogers. Captain America tidak memiliki kekuatan super, tetapi dalam tubuhnya terdapat Serum Super-Soldier serta \"Vita-Ray\", yang mampu membuatnya memiliki kekuatan, ketahanan, kelincahan, kecepatan, refleks, daya tahan, dan penyembuhan yang berbeda dengan manusia lainnya. Captain America sering menggunakan perisainya sebagai senjata lempar ofensif."
            ),
            Superhero(
                R.drawable.captainmarvel,
                "Captain Marvel",
                "Memiliki nama asli Carol Susan Jane Danvers. Dia dijuluki \"pahlawan wanita Marvel terbesar\", dan \"sangat mungkin adalah Avenger Marvel yang terkuat\". Danvers adalah seorang perwira Angkatan Udara Amerika Serikat dan rekan dari pahlawan super bangsa Kree, Mar-Vell. Danvers kemudian menjadi inkarnasi pertama Ms. Marvel setelah DNA-nya menyatu dengan Mar-Vell ketika terjadi sebuah ledakan dan pada akhirnya memberinya kekuatan sebagai manusia super.\n" +
                        "\n" +
                        " "
            ),
            Superhero(
                R.drawable.doctorstrange,
                "Doctor Strange",
                "Nama asli Doctor Strange adalah Stephen Vincent Strange. Dia adalah ahli bedah saraf yang terampil sebelum kerusakan saraf merusak tangannya. Doctor Strange digambarkan sebagai \"pesulap terkuat di kosmos\". Selain kemampuan magisnya, Strange dilatih dalam beberapa disiplin ilmu bela diri, dan telah menunjukkan kemahiran dengan banyak senjata ajaib yang disihir termasuk pedang."
            ),
            Superhero(
                R.drawable.gamora,
                "Gamora",
                "Memiliki nama asli Gamora Zen Whoberi Ben Titan. Gamora adalah anak angkat Thanos, dan yang terakhir dari spesiesnya. Kekuatannya termasuk kekuatan manusia super dan kelincahan dan faktor penyembuhan yang dipercepat. Dia juga adalah pejuang elit, mampu mengalahkan sebagian besar lawan di galaksi. Dia adalah anggota kelompok yang dikenal sebagai Infinity Watch"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Nama asli Hulk adalah Dr. Robert Bruce Banner. Hulk muncul setelah Banner secara tidak sengaja terkena test ledakan dari bom gamma yang ia temukan. Sesudah kejadian itu, Banner akan berubah menjadi Hulk, digambarkan sebagai seorang raksasa, monster humanoid, mengarahkan kehidupan Banner menjadi sangat rumit."
            ),
            Superhero(
                R.drawable.ironman,
                "Iron Man",
                "Nama asli Iron Man adalah Anthony Edward \"Tony\" Stark. Tony Stark adalah seorang jenius inventif yang memiliki keahlian di bidang matematika, fisika, kimia, dan saingan ilmu komputer dari Reed Richards, Hank Pym, dan Bruce Banner, dan keahliannya dalam teknik elektro dan teknik mesin bahkan melampaui kemampuan mereka. Dia dianggap sebagai salah satu karakter paling cerdas di Marvel Universe."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}