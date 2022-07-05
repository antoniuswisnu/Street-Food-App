package com.example.projekakhirpan

import java.util.*

object ItemData {
    private val namaMakanan = arrayOf("Batagor",
        "Cilok",
        "Cireng",
        "Telur Gulung",
        "Pempek",
        "Bakso Bakar",
        "Sosis Bakar",
        "Martabak",
        "Siomay",
        "Roti Bakar",
        "Kue Putu")

    private val namaMinuman = arrayOf("Es Teh",
        "Milk Tea",
        "Milkshake",
        "Red Velvet",
        "Taro",
        "Matcha",
        "Fruit Smoothie",
        "Chocolate",
        "Espresso",
        "Latte",
        "Thai Tea",
        "Lemon Tea",
    )

    private val makananDetails = arrayOf("Batagor terdiri dari adonan bakso ikan tenggiri yang diisi ke dalam tahu  dan kulit pangsit dengan kuah kacang",
        "Terbuat dari tapioka yang kenyal dengan tambahan bumbu pelengkap seperti sambal kacang dan sambal.",
        "Dibuat dengan cara menggoreng campuran adonan dari tepung kanji atau tapioka.",
        "Terbuat dari olahan telur yang digoreng lalu digulung menggunakan tusuk kayu serta diberi tambahan seperti saos dan mayones.",
        "Terbuat dari daging ikan yang digiling lembut yang dicampur tepung kanji atau tepung sagu. Disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas",
        "Terbuat dari bakso yang dibakar kemudian ditusuk menggunakan kayu, serta diberi tambahan seperti saus sambal serta mayones.",
        "Terbuat dari sosis yang dibakar kemudian ditusuk dengan kayu, serta diberi tambahan seperti saus sambal serta mayones",
        "Terbuat dari campuran telur dan daging serta terigu.",
        "Terbuat dari tepung terigu untuk kulitnya serta diberi isian seperti daging, dan diberi tambahan seperti telur ayam rebus, kentang, peria dan kubis.",
        "Terbuat dari roti yang dibakar dan diberi varian berbagai isian seperti coklat, keju, dan lain-lain.",
        "Kue dengan isian gula jawa, dibalut dengan parutan kelapa, dan tepung beras butiran kasar.")

    private val minumanDetails = arrayOf("teh manis yang diberi tambahan es batu akan terasa sangat menyegarkan saat cuaca sedang panas.",
        "campuran teh serta susu dalam komposisi tertentu akan memberikan rasa menyegarkan bagi tenggorokan",
        "Tebuat dari bahan dasar susu yang ditambahkan dengan perasa dan sirup.\n",
        "perpaduan berbagai bahan dalam red velvet akan memberikan rasa seperti coklat dengan sensasi lembut serta rasa manis yang pas",
        "rasa manis dan sedikit rasa kacang memberi sensasi unik ketika sampai ditenggorokan\n",
        "minuman teh hijau yang digiling lalu diseduh dengan air panas/es\n",
        "terbuat dari buah buahan segar yang ditambah susu, yogurt serta es krim atau keju cottage",
        "\tkakao bubuk yang ditambah gula lalu diseduh dengan air atau susu.\n",
        "ekstraksi biji kopi yang sudah digiling dengan semburan air panas di bawah tekanan tinggi",
        "Tebuat dari kopi yang dicampur dengan susu dan memiliki lapisan busa yang tipis di bagian atasnya\n",
        "Minuman yang terbuat dari campuran teh hitam, adas manis, kapulaga, gula, bunga jeruk, dan susu. Jenis minuman ini disebut juga dengan Chayen. Teh ini bisa disajikan dengan tambahan susu atau tidak dan dengan es atau hangat\n" +
                "\n",
        "jenis teh yang menambahkan irisan lemon di dalamnya. Minuman lemon tea ini sangat baik bagi fisik maupun mental tubuh. Pada minuman lemon tea, penambahan lemon pada teh tidak hanya membuat warnanya lebih menonjol, tetapi juga meningkatkan rasanya.\n"
    )

    private val makananImages = intArrayOf(
        R.drawable.batagor,
        R.drawable.cilok,
        R.drawable.cireng,
        R.drawable.telur_gulung,
        R.drawable.pempek,
        R.drawable.bakso_bakar,
        R.drawable.sosis_bakar,
        R.drawable.martabak,
        R.drawable.siomay,
        R.drawable.roti_bakar,
        R.drawable.kue_putu
    )

    private val minumanImages = intArrayOf(
        R.drawable.esteh,
        R.drawable.milktea,
        R.drawable.milkshake,
        R.drawable.redvelvet,
        R.drawable.taro,
        R.drawable.matcha,
        R.drawable.fruit,
        R.drawable.chocolate,
        R.drawable.espresso,
        R.drawable.latte,
        R.drawable.thaitea,
        R.drawable.lemontea
    )

    val listDataMakanan: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in namaMakanan.indices) {
                val item = Item()
                item.name = namaMakanan[position]
                item.detail = makananDetails[position]
                item.photo = makananImages[position]
                list.add(item)
            }
            return list
        }

    val listDataMinuman: ArrayList<Item>
        get() {
            val list = arrayListOf<Item>()
            for (position in namaMinuman.indices) {
                val item = Item()
                item.name = namaMinuman[position]
                item.detail = minumanDetails[position]
                item.photo = minumanImages[position]
                list.add(item)
            }
            return list
        }
}