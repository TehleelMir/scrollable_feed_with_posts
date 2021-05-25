package com.example.scrollable_feed_with_posts

class DummyData {

    val list : MutableList<DataModel>
        get(){
            var tempList = ArrayList<DataModel>()
            tempList.apply {

                add(DataModel("CocoChanelAdair","@Cocochaneladair","Y’all are such funny trolls lol pretending to be Elon in these spaces",
                        R.drawable.avatar1,null,2,"23-3-21"))

                add(DataModel("Bandh gobi","@gobikafool","Me reading everyone's finally a doctor tweets",
                        R.drawable.avatar2,R.drawable.post1,72,"23-3-21"))

                add(DataModel("Archillect","@archillect",null,
                        R.drawable.avatar3,R.drawable.post2,null,"23-3-21"))

                add(DataModel("Lämb","@lambwalks","*Twitter to Ban in India*\n" +
                        "\n" +
                        "SP Tahir who has nothing to do now :",
                        R.drawable.avatar4,R.drawable.post3,12,"23-3-21"))

                add(DataModel("\uD835\uDC0C\uD835\uDC28\uD835\uDC2B\uD835\uDC29\uD835\uDC21\uD835\uDC22\uD835\uDC27\uD835\uDC1E\uD83C\uDDF5\uD83C\uDDF8","@lickuid4","we live in a society where a working man never hesitates to marry a non working woman. but a working woman never even thinks about marrying an unemployed man. and they speak about equality. didi ko feminist b banna hai aur shadi govt job wale se he krne hai wah didi wah mouj krde",
                        R.drawable.avatar5,null,3,"23-3-21"))

                add(DataModel("cats.exe","@catsdotexe",null,
                        R.drawable.avatar6,R.drawable.post4,2,"23-3-21"))

                add(DataModel("Shibetoshi Nakamoto","@BillyM2k","Apparently the community is trying to break Twitter spaces … (again) for a record ",
                        R.drawable.avatar7,null,72,"23-3-21"))

                add(DataModel("Perry","@billebichud","True pain ❤",
                        R.drawable.avatar8,R.drawable.post5,null,"23-3-21"))
            }
            return tempList
        }
}