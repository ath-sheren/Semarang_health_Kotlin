package com.example.semarangkoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_rsactivity.*

class RSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rsactivity)


        var listViewRS = findViewById<ListView>(R.id.listviewRS)
        var listRS = mutableListOf<RS>()


        listRS.add(
            RS(
                "1.\tRSUP Dr. Kariadi", "Tipe : A\n" +
                        "Alamat : Jl. DR. Sutomo No.16, Randusari, Kec. Semarang Selatan, Kota Semarang, Jawa Tengah 50244\n" +
                        "No. Telp : ( 024 ) 8413476\n" +
                        "Jarak : 1,4 km dari Tugu Muda Semarang\n", R.drawable.kariadi

            )

        )
        listRS.add(
            RS(
                "2.\tRSUD Tugurejo", "Tipe : B\n" +
                        "Alamat : Jl. Walisongo No.137, Tambakaji, Kec. Ngaliyan, Kota Semarang, Jawa Tengah 50185\n" +
                        "No. Telp : ( 024 ) 7605297\n" +
                        "Jarak : 6,3 km dari Tugu Muda Semarang\n", R.drawable.tugurejo
            )
        )
        listRS.add(
            RS(
                "3.\tRSUD Wongsonegoro", "Tipe : B\n" +
                        "Alamat : Jl. Fatmawati No.1, Mangunharjo, Kec. Tembalang, Kota Semarang, Jawa Tengah 50272\n" +
                        "No. Telepon : (024) 6711500\n" +
                        "Jarak : 13,3 km dari Tugu Muda Semarang\n", R.drawable.wongsonegoro
            )
        )
        listRS.add(
            RS(
                "4.\tRS Banyumanik", "Tipe : D\n" +
                        "Alamat : Jl. Bina Remaja No.61, Srondol Wetan, Kec. Banyumanik, Kota Semarang, Jawa Tengah 50263\n" +
                        "No. Telp : ( 024 ) 7462181\n" +
                        "Jarak : 11,2 km dari Tugu Muda Semarang\n", R.drawable.banyumanik
            )
        )
        listRS.add(
            RS(
                "5.\tRS Bhakti Wira Tamtama", "Tipe : C\n" +
                        "Alamat : Jl. DR. Sutomo No.17, Barusari, Kec. Semarang Selatan, Kota Semarang, Jawa Tengah 50245\n" +
                        "No. Telp : ( 024 ) 3555944\n" +
                        "Jarak : 0,7 km dari Tugu Muda Semarang\n", R.drawable.bhakti_wira
            )
        )
        listRS.add(
            RS(
                "6.\tRS Bhayangkara Akpol", "Tipe : C \n" +
                        "Alamat : Jl. Sultan Agung No.131, Gajahmungkur, Kec. Gajahmungkur, Kota Semarang, Jawa Tengah 50232\n" +
                        "No. Telp : ( 024 ) 8411680\n" +
                        "Jarak : 7,7 km dari Tugu Muda Semarang\n", R.drawable.bayangkara_akpol
            )
        )
        listRS.add(
            RS(
                "7.\tRS Bhayangkara Semarang", "Tipe : C\n" +
                        "Alamat : Jl. Majapahit No.140, Gayamsari, Kec. Gayamsari, Kota Semarang, Jawa Tengah 50248\n" +
                        "No. Telp : ( 024 ) 6720675\n" +
                        "Jarak : 5,0 km dari Tugu Muda Semarang\n", R.drawable.bhayangkara_smg
            )
        )
        listRS.add(
            RS(
                "8.\tRS Columbia Asia Semarang", "Tipe : B\n" +
                        "Alamat : Jl. Siliwangi No.143, Kalibanteng Kulon, Kec. Semarang Barat, Kota Semarang, Jawa Tengah 50145\n" +
                        "No. Telp : (024) 7629999\n" +
                        "Jarak : 3,1 km dari Tugu Muda Semarang\n", R.drawable.columbia_asia
            )
        )
        listRS.add(
            RS(
                "9.\tRS Jiwa Dr. Amino Gondohutomo", "Tipe : A\n" +
                        "Alamat : Jl. Brigjen Sudiarto No.347, Gemah, Kec. Pedurungan, Kota Semarang, Jawa Tengah 50611\n" +
                        "No. Telp : 024 5722564\n" +
                        "Jarak : 7,8 km dari Tugu Muda Semarang\n", R.drawable.amino_gondohutomo
            )
        )
        listRS.add(
            RS(
                "10.\tRS Hermina Banyumanik", "Tipe : C\n" +
                        "Alamat : Jl. Jend. Pol. Anton Sujarwo No.195A, Srondol Wetan, Kec. Banyumanik, Kota Semarang, Jawa Tengah 50263\n" +
                        "No. Telp : (024) 76488989\n" +
                        "Jarak : 11,8 km dari Tugu Muda Semarang\n", R.drawable.hermina_banyumanik
            )
        )
        listRS.add(
            RS(
                "11.\tRS Hermina Pandanaran", "Tipe : C\n" +
                        "Alamat : Jl. Pandanaran Kel No.24, Pekunden, Kec. Semarang Tengah, Kota Semarang, Jawa Tengah 50134\n" +
                        "No. Telp : 024 8442525\n" +
                        "Jarak : 0,65 km dari Tugu Muda Semarang\n", R.drawable.hermina_pandanaran
            )
        )
        listRS.add(
            RS(
                "12.\tRS Nasional Diponegoro", "Tipe : C\n" +
                        "Alamat : Jl. Prof. H. Soedarto S.H No.1, Tembalang, Kec. Tembalang, Kota Semarang, Jawa Tengah 50275\n" +
                        "No. Telp : (024) 76928020\n" +
                        "Jarak : 20,2 km dari Tugu Muda Semarang\n", R.drawable.diponegoro
            )
        )
        listRS.add(
            RS(
                "13.\tRS Panti Wilasa", "Tipe : C\n" +
                        "Alamat : Jl. Citarum No.98, Mlatiharjo, Kec. Semarang Timur, Kota Semarang, Jawa Tengah 50121\n" +
                        "No. Telp : ( 024 ) 3542224\n" +
                        "Jarak : 4,5 km dari Tugu Muda Semarang\n", R.drawable.pantiwilasa_citarum
            )
        )
        listRS.add(
            RS(
                "14.\tRS Panti Wilasa II", "Tipe : C\n" +
                        "Alamat : Jl. Dr. Cipto No.50, Bugangan, Kec. Semarang Timur, Kota Semarang, Jawa Tengah 50123\n" +
                        "No. Telp : ( 024 ) 3567128\n" +
                        "Jarak : 4,4 km dari Tugu Muda Semarang\n", R.drawable.pantiwilasa_cipto
            )
        )
        listRS.add(
            RS(
                "15.\tRS Permata Medika", "Tipe : C\n" +
                        "Alamat : Jl. Mr. Moch Ichsan No.93, Ngaliyan, Kec. Ngaliyan, Kota Semarang, Jawa Tengah 50181\n" +
                        "No. Telp : ( 024 ) 7621733\n" +
                        "Jarak : 8,2 km dari Tugu Muda Semarang\n", R.drawable.permata_medika
            )
        )
        listRS.add(
            RS(
                "16.\tRS Roemani Muhammadiyah", "Tipe : C\n" +
                        "Alamat : Jl. Wonodri Baru No.22, Wonodri, Kec. Semarang Selatan, Kota Semarang, Jawa Tengah 50242\n" +
                        "No. Telp : ( 024 ) 8444623\n" +
                        "Jarak : 3,7 km dari Tugu Muda Semarang\n", R.drawable.roemani
            )
        )
        listRS.add(
            RS(
                "17.\tRS Siloam Semarang", "Tipe : D\n" +
                        "Alamat : Jl. Kompol Maksum No.296, Peterongan, Kec. Semarang Selatan, Kota Semarang, Jawa Tengah 50242\n" +
                        "No. Telp : (024) 86001900\n" +
                        "Jarak : 4,7 km dari Tugu Muda Semarang\n", R.drawable.siloam
            )
        )
        listRS.add(
            RS(
                "18.\tRS St. Elisabeth Semarang", "Tipe : B\n" +
                        "Alamat : Jl. Kawi Raya No.1, Tegalsari, Kec. Candisari, Kota Semarang, Jawa Tengah 50614\n" +
                        "No. Telp : ( 024 ) 8310076\n" +
                        "Jarak : 4,3 km dari Tugu Muda Semarang\n", R.drawable.elisabeth_smg
            )
        )
        listRS.add(
            RS(
                "19.\tRS Sultan Agung", "Tipe : B\n" +
                        "Alamat : Jl. Kaligawe Raya No.4, Terboyo Kulon, Kec. Genuk, Kota Semarang, Jawa Tengah 50112\n" +
                        "No. Telp : ( 024 ) 6580019\n" +
                        "Jarak : 8,9 km dari Tugu Muda Semarang\n", R.drawable.sultan_agung
            )
        )
        listRS.add(
            RS(
                "20.\tRS Telogorejo", "Tipe : B\n" +
                        "Alamat : Jl. KH. Ahmad Dahlan No.11, Pekunden, Kec. Semarang Tengah, Kota Semarang, Jawa Tengah 50134\n" +
                        "No. Telp : ( 024 ) 8446000\n" +
                        "Jarak : 2,6 km dari Tugu Muda Semarang\n", R.drawable.telogorejo
            )
        )
        listRS.add(
            RS(
                "21.\tRS William Booth", "Tipe : C\n" +
                        "Alamat : Jl. Letnan Jend. S. Parman No.5, Petompon, Kec. Gajahmungkur, Kota Semarang, Jawa Tengah 50237\n" +
                        "No. Telp : ( 024 ) 8411800\n" +
                        "Jarak : 2,1 km dari Tugu Muda Semarang\n", R.drawable.william_booth
            )
        )
        listRS.add(
            RS(
                "22.\tRSIA Ananda Pasar Ace", "Tipe : C\n" +
                        "Alamat : Jl. Bandungsari No.77, Tambangan, Kec. Mijen, Kota Semarang, Jawa Tengah 50215\n" +
                        "No Telp : (024) 76672123\n" +
                        "Jarak : 17,6 km dari Tugu Muda Semarang\n", R.drawable.ananda_pasar_ace
            )
        )
        listRS.add(
            RS(
                "23.\tRSIA Anugerah", "Tipe : C\n" +
                        "Alamat : Jl. Kalisari Baru No.7, Barusari, Kec. Semarang Selatan, Kota Semarang, Jawa Tengah 50245\n" +
                        "No. Telp : (024) 8313543\n" +
                        "Jarak : 1,4 km dari Tugu Muda Semarang\n", R.drawable.anugerah
            )
        )
        listRS.add(
            RS(
                "24.\tRSIA Bunda Semarang", "Tipe : C\n" +
                        "Alamat : Jl. Brigjen Katamso No.8, Karangturi, Kec. Semarang Timur, Kota Semarang, Jawa Tengah 50125\n" +
                        "No. Telp : (024) 8413060 \n" +
                        "Jarak : 3,2 km dari Tugu Muda Semarang\n", R.drawable.bunda_smg
            )
        )
        listRS.add(
            RS(
                "25.\tRSIA Gunung Sawo", "Tipe : C\n" +
                        "Alamat : Jl. Gunung Sawo No.21, Petompon, Kec. Gajahmungkur, Kota Semarang, Jawa Tengah 50237\n" +
                        "No. Telp : 024 8315171\n" +
                        "Jarak : 2,1 km dari Tugu Muda Semarang\n", R.drawable.gunung_sawo
            )
        )
        listRS.add(
            RS(
                "26.\tRSIA Kusuma Pradja", "Tipe : C\n" +
                        "Alamat : Jl. Bugangan No.3, Rejosari, Kec. Semarang Timur, Kota Semarang, Jawa Tengah 50126\n" +
                        "No. Telp : (024) 3546355\n" +
                        "Jarak : 4,4 km dari Tugu Muda Semarang\n", R.drawable.kusuma_pradja
            )
        )


        listViewRS.adapter = RSAdapter(this, R.layout.listrs, listRS)

        listViewRS.setOnItemClickListener { adapterView, view, i, l ->
                val intent = Intent(this, TampilMap::class.java)
                startActivity(intent)
            }
        }
    }
