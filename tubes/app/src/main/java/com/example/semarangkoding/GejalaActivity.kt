package com.example.semarangkoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class GejalaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gejala)

        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<gejala>()

        list.add(gejala("Pusing Berhari-hari", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya sakit kepala :\n" +
                "- Migrain\n" +
                "- Hemicrania Continua\n" +
                "- Vertigo\n" +
                "- Anemia Defisiensi Besi\n" +
                "- Masalah Sirkulasi Peredaran Darah\n" +
                "- Hipoglikemia\n" +
                "- Gangguan Saraf (Seperti enyakit Parkinson dan sklerosis ganda)\n", R.drawable.pusing))
        list.add(gejala("Demam Tinggi", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya demam tinggi :\n" +
                "- Infeksi seperti flu, sakit tenggorokan, cacar air atau pneumonia\n" +
                "- Infeksi pada tulang (osteomielitis), radang usus buntu, infeksi kulit atau selulitis, dan meningitis\n" +
                "- Penyakit rheumatoid, penyakit kronis yang menyebabkan pembengkakan dan nyeri pada sendi, jaringan di sekitar sendi dan organ lain dalam tubuh manusia\n" +
                "- Penyakit akibat gigitan nyamuk, seperti demam berdarah, malaria, dan chikungunya.\n" +
                "- Penyakit, seperti arthritis dan hipertiroidisme (kelenjar tiroid yang terlalu aktif).\n" +
                "- Kanker, misalnya leukimia , kanker hati, atau kanker paru-paru.\n", R.drawable.demam))
        list.add(gejala("Susah Bernafas", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya susah bernafas :\n" +
                "- Penyakit jantung ( seperti : angina, serangan jantung, cacat jantung sejak lahir, gagal jantung, aritmia)\n" +
                "- Penyakit pada paru-paru (pulmonary embolism, bronchitis, pneumonia, hipertensi paru)\n" +
                "- Penyakit pada saluran udara (Penyumbatan saluran udara di hidung, mulut, atau tenggorokan Tersedak sesuatu yang tersangkut di saluran udara Pembengkakan pita suara (croup) Peradangan jaringan (epiglottis) yang menutupi batang tenggorokan (epiglottitis))\n" +
                "- Alergi (alergi pada bulu, serbuk bunga, makanan, ataupun yang lainnya)\n" +
                "- Tidak responsive pada ketinggian (sedikit oksigen di udara)\n" +
                "- Kompresi dinding dada\n" +
                "- Hiatal hernia \n" +
                "- Kesulitan emosional (kecemasan)\n" +
                "- Anemia (hemoglobin rendah)\n" +
                "- Methemoglobinemia\n" +
                "- Asma \n", R.drawable.napas))
        list.add(gejala("Penurunan Berat Badan yang Signifikan", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya penurunan berat badan secara signifikan :\n" +
                "- Anoreksia\n" +
                "- Bulimia\n" +
                "- Diabetes\n" +
                "- Hipertiroidisme\n" +
                "- Penyakit kronis (Gagal ginjal, Gagal hati)\n" +
                "- Penyakit saluran cerna (tukak lambung, penyakit radang usus , penyakit celiac dan pankreatitis)\n" +
                "- Infeksi (tuberkulosis, HIV/AIDS, dan cacingan)\n" +
                "- Kanker (limfoma, leukemia, kanker usus besar, kanker ovarium, kanker pankreas, kanker payudara, dan kanker paru-paru)\n" +
                "- Penyakit gigi dan mulut\n", R.drawable.turun_berat))
        list.add(gejala("Kulit Kering", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya kulit kering :\n" +
                "- penyakit ginjal,\n" +
                "- iktiosis\n" +
                "- kelainan tiroid\n" +
                "- kurang gizi\n" +
                "- eksim\n" +
                "- psoriasis \n" +
                "- xerosis \n" +
                "- diabetes\n", R.drawable.kulit_kering))
        list.add(gejala("Pembengkakan di Beberapa Bagian Tubuh", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya pembengkakan pada beberapa bagian tubuh :\n" +
                "- Lipoma \n" +
                "- Masalah jantung\n" +
                "- Sirosis \n" +
                "- Edema anasrka\n" +
                "- Limfadenopati (pembengkakan kelenjar getah bening)\n" +
                "- Tumor ganas maupun jinak\n" +
                "- Fibroadenoma atau tumor jinak di daerah payudara\n" +
                "- Kista \n" +
                "- Nodul Tiroid atau pembesaran kelenjar tiroid (tumor jinak)\n", R.drawable.bengkak))
        list.add(gejala("Vertigo", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya vertigo :\n" +
                "- Migrain atau sakit kepala tidak tertahankan.\n" +
                "- Benign paroxysmal positional vertigo (BPPV)\n" +
                "- Stroke. \n" +
                "- Penyakit Meniere, gangguan yang menyerang telinga bagian dalam.\n" +
                "- Vestibular neuronitis, inflamasi saraf vestibular pada telinga bagian dalam.\n" +
                "- Gangguan pada otak, misalnya tumor.\n" +
                "- Multiple sclerosis atau gangguan sinyal saraf yang terjadi pada sistem saraf pusat di otak dan tulang belakang\n" +
                "- Labirintitis atau peradangan area telinga dalam\n" +
                "- Vestibular neuritis atau peradangan saraf telinga dengan otak\n", R.drawable.vertigo))
        list.add(gejala("Batuk Berdahak", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya batuk berdahak  :\n" +
                "- Pneumonia\n" +
                "- Bronkitis\n" +
                "- Penyakit paru obstruktif kronik\n" +
                "- Asma \n" +
                "- Post nasal drip\n" +
                "- Asam lambung (GERD)\n" +
                "- Infeksi virus\n", R.drawable.batuk))
        list.add(gejala("Nyeri Dada", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya nyeri dada :\n" +
                "- Serangan jantung, akibat tersumbatnya seluruh aliran darah ke jantung.\n" +
                "- Penyakit jantung koroner, yaitu terdapat penyumbatan pembuluh darah yang menuju ke jantung.\n" +
                "- Kardiomiopati, yaitu penyakit akibat otot jantung yang lemah.\n" +
                "- Miokarditis atau radang pada otot jantung.\n" +
                "- Perikarditis atau radang pada membran yang melapisi jantung.\n" +
                "- Endokarditis.\n" +
                "- Diseksi aorta, yaitu robeknya lapisan dalam pembuluh nadi terbesar.\n" +
                "- Penyakit paru-paru, seperti penyumbatan pembuluh darah di paru-paru (emboli paru), radang pada selaput yang membungkus paru-paru (pleuritis), tekanan yang tinggi pada pembuluh darah di paru-paru (hipertensi pulmonal), abses paru, dan atelektasis atau paru-paru yang kempis (kolaps).\n" +
                "- Gangguan sistem pencernaan, seperti penyakit refluks asam lambung (GERD), batu empedu atau radang kantung empedu (kolesistisis), serta peradangan pankreas (pankreatitis),\n" +
                "- Gangguan pada otot dan tulang dada, seperti radang tulang rawan yang menghubungkan tulang rusuk dan tulang dada (kostokondritis) atau patah tulang rusuk.\n" +
                "- Kondisi medis lain, seperti herpes zoster (cacar ular) atau serangan panik.\n", R.drawable.nyeri_dada))
        list.add(gejala("Perubahan Bentuk Payudara", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya perubahan bentuk payudara :\n" +
                "- Kanker payudara\n" +
                "- sindrom pramenstruasi atau PMS\n" +
                "- Ginekomastia adalah pembengkakan payudara pada pria\n", R.drawable.payudara))
        list.add(gejala("Mata Merah", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya mata merah :\n" +
                "- Konjungtivitis\n" +
                "- Mata kering \n" +
                "- Alergi\n" +
                "- Mata lelah\n" +
                "- Uveitis atau peradangan jaringan tengah dinding mata (uvea)\n" +
                "- Glaukoma adalah peningkatan tekanan bola mata\n" +
                "- Subkonjungtiva\n" +
                "- Masalah pada kornea\n" +
                "- Keratitis karena pemakaian softlens yang salah\n", R.drawable.mata_merah))
        list.add(gejala("Tidur yang Berlebihan", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya tidur yang berlebihan :\n" +
                "- Hipersomnia\n" +
                "- sleep apnea dengan gangguan pernapasan\n" +
                "- Narkolepsi\n" +
                "- Sindrom kaki gelisah\n" +
                "- Diabetes\n" +
                "- Penyakit neurologis, seperti sklerosis ganda\n" +
                "- Obesistas\n" +
                "- Cedera atau kelainan di kepala\n", R.drawable.tidur_berlebihan))
        list.add(gejala("Nyeri Perut", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya nyeri perut :\n" +
                "- Sakit perut kanan atas (Hepatitis, Batu empedu, Radang kandung empedu, Infeksi ginjal, Batu ginjal, Kanker hati, gangguan paru-paru, misalnya radang selaput paru atau paru-paru basah)\n" +
                "- Sakit perut kanan bawah (Usus buntu, Infeksi saluran kemih, Batu saluran kemih, Radang usus, Sumbatan (obstruksi) usus, Hernia)\n" +
                "- Sakit perut kiri atas (Pembesaran limpa, Infeksi ginjal, Batu ginjal, Sembelit, gangguan paru-paru, misalnya radang selaput paru atau paru-paru basah, angina, serangan jantung)\n" +
                "- Sakit perut kiri bawah (Infeksi saluran kemih, Batu saluran kemih, Sumbatan (obstruksi) usus, Radang usus)\n" +
                "- Sakit perut bagian tengah (Kista indung telur, Penyakit radang panggul, Endometriosis, Kehamilan ektopik, Keguguran)\n", R.drawable.nyeri_perut))
        list.add(gejala("Diare", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya mencret atau diare :\n" +
                "- Covid-19\n" +
                "- alergi makanan\n" +
                "- Gangguan saluran pencernaan seperti irritable bowel syndrome, penyakit celiac, kolitis ulseratif, atau penyakit Crohn.\n" +
                "- Tumor\n" +
                "- Daya tahan tubuh rendah seperti HIV\n" +
                "- Penyakit usus.\n" +
                "- Penyakit celiac atau penyakit yang menyebabkan tubuh menolak protein gluten.\n" +
                "- Penyakit usus.\n" +
                "- Intoleransi terhadap makanan, seperti laktosa dan fruktosa.\n", R.drawable.mencret))
        list.add(gejala("Pilek Berhari-hari", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya pilek behari-hari :\n" +
                "- Alergi\n" +
                "- Sinusitis\n" +
                "- Polip hidung\n" +
                "- Batuk pilek flu\n" +
                "- Rinitis non-alergi\n" +
                "- Pneumonia\n", R.drawable.pilek))
        list.add(gejala("Batuk dengan Darah", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya batuk dengan darah :\n" +
                "- Aspergillosis\n" +
                "- Bronkitis\n" +
                "- Infeksi paru atau pneumonia\n" +
                "- TBC\n" +
                "- Bronkiektasis\n" +
                "- Masuknya benda asing ke saluran pernapasan\n" +
                "- Pecah pembuluh darah di saluran pernapasan (varises bronkial)\n" +
                "- Hipertensi pulmonal\n" +
                "- Edema paru\n" +
                "- Emboli paru\n" +
                "- Cedera pada daerah dada\n" +
                "- Kanker paru\n", R.drawable.batuk_darah))
        list.add(gejala("Susah BAB", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya susah BAB :\n" +
                "- Konstipasi karena gaya hidup sehat\n" +
                "- Kehamilan ataupun menstruasi\n" +
                "- kondisi medis tertentu, seperti diabetes, sindrom iritasi usus besar, hiperkalsemia atau kelebihan kalsium dalam darah, dan kelenjar tiroid yang kurang aktif.\n" +
                "- penyakit radang usus, kanker usus besar, hingga kelainan saraf, seperti multiple sclerosis, stroke, penyakit Parkinson, atau cedera saraf tulang belakang.\n" +
                "- Gangguan psikis meliputi stres, kecemasan, depresi, trauma kekerasan, atau pelecehan seksual.\n", R.drawable.susah_bab))
        list.add(gejala("Sering Buang Air Kecil", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya sering buang air kecil :\n" +
                "- Infeksi saluran kemih (ISK)\n" +
                "- Kandung kemih overaktif\n" +
                "- Infeksi ginjal\n" +
                "- Batu ginjal\n" +
                "- Kehamilan\n" +
                "- Diabetes\n" +
                "- Gangguan prostat\n" +
                "- Divertikulitis\n" +
                "- Adanya tumor atau batu pada kandung kemih.\n" +
                "- Penurunan fungsi kandung kemih akibat bertambahnya usia.\n", R.drawable.bak))
        list.add(gejala("Mimisan", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya mimisan :\n" +
                "- Mimisan terjadi karena pembuluh darah rapuh yang mudah berdarah, mungkin di udara kering yang hangat atau setelah berolahraga\n" +
                "- Infeksi pada lapisan hidung, sinus atau kelenjar gondok\n" +
                "- Alergi yang menyebabkan demam atau batuk\n" +
                "- Mimisan terjadi karena gundukan atau jatuh\n" +
                "- Sebuah benda yang telah didorong ke lubang hidung\n" +
                "- Mimisan terjadi karena mengorek hidung\n" +
                "- Terkadang mimisan juga disebabkan oleh masalah pendarahan atau pembekuan darah\n" +
                "- Iritasi karena alergi, pilek, bersin atau masalah sinus\n" +
                "- Udara sangat dingin atau kering\n" +
                "- Luka pada hidung, termasuk hidung yang patah, atau benda yang tersangkut di hidung\n" +
                "- Sinus atau operasi hipofisis (transsfenoidal)\n" +
                "- Septum menyimpang\n" +
                "- Iritasi kimia termasuk obat-obatan atau obat-obatan yang disemprot atau didengus\n" +
                "- Terlalu sering menggunakan semprotan hidung dekongestan\n" +
                "- Perawatan oksigen melalui kanula hidung\n", R.drawable.mimisan))
        list.add(gejala("Sakit Tenggorokan", "Berikut ini merupakan beberapa penyakit yang dapat memicu terjadinya sakit tengggorokan :\n" +
                "- Tonsilitis, yaitu peradangan pada amandel atau tonsil\n" +
                "- Faringitis, yaitu peradangan pada saluran yang menghubungkan hidung atau mulut dengan kerongkongan (esofagus) atau saluran tempat pita suara (laring)\n" +
                "- Laringitis, yaitu peradangan pada laring\n" +
                "- Infeksi mononukleosis, yaitu infeksi virus Epstein Barr yang ditandai dengan pembesaran kelenjar getah bening, demam, dan sakit tenggorokan\n" +
                "- Abses peritonsil, yaitu pembengkakan bernanah yang timbul pada langit-langit tenggorokan dan bagian belakang amandel\n" +
                "- Epiglotitis, yaitu peradangan pada epiglottis atau katup yang memisahkan saluran pernapasan dengan saluran pencernaan\n" +
                "- COVID-19, yaitu infeksi virus Corona yang menyerang saluran pernapasan dan menimbulkan gejala yang beragam, termasuk flu, sakit tenggorokan, demam, batuk, dan sesak napas\n", R.drawable.tenggorokan))

        listView.adapter=GejalaAdapter(this, R.layout.listgejala, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Anda mengklik gejala pusing berhari-hari", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Anda mengklik gejala demam tinggi", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Anda mengklik gejala susah bernapas", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Anda mengklik gejala penurunan berat badan yang signifikan", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Anda mengklik gejala kulit kering", Toast.LENGTH_SHORT).show()
                5 -> Toast.makeText(this, "Anda mengklik gejala pembengkakan di beberapa bagian tubuh", Toast.LENGTH_SHORT).show()
                6 -> Toast.makeText(this, "Anda mengklik gejala vertigo", Toast.LENGTH_SHORT).show()
                7 -> Toast.makeText(this, "Anda mengklik gejala batuk berdahak", Toast.LENGTH_SHORT).show()
                8 -> Toast.makeText(this, "Anda mengklik gejala nyeri dada", Toast.LENGTH_SHORT).show()
                9 -> Toast.makeText(this, "Anda mengklik gejala perubahan bentuk payudara", Toast.LENGTH_SHORT).show()
                10 -> Toast.makeText(this, "Anda mengklik gejala mata merah", Toast.LENGTH_SHORT).show()
                11 -> Toast.makeText(this, "Anda mengklik gejala tidur yang berlebihan", Toast.LENGTH_SHORT).show()
                12 -> Toast.makeText(this, "Anda mengklik gejala nyeri perut", Toast.LENGTH_SHORT).show()
                13 -> Toast.makeText(this, "Anda mengklik gejala diare atau mencret", Toast.LENGTH_SHORT).show()
                14 -> Toast.makeText(this, "Anda mengklik gejala pilek berhari-hari", Toast.LENGTH_SHORT).show()
                15 -> Toast.makeText(this, "Anda mengklik gejala batuk dengan darah", Toast.LENGTH_SHORT).show()
                16 -> Toast.makeText(this, "Anda mengklik gejala susah BAB", Toast.LENGTH_SHORT).show()
                17 -> Toast.makeText(this, "Anda mengklik gejala sering buang air kecil", Toast.LENGTH_SHORT).show()
                18 -> Toast.makeText(this, "Anda mengklik gejala mimisan", Toast.LENGTH_SHORT).show()
                19 -> Toast.makeText(this, "Anda mengklik gejala sakit tenggorokan", Toast.LENGTH_SHORT).show()

            }
        }
    }
}