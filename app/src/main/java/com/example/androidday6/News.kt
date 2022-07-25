package com.example.androidday6

//data class NewsResponse(
//    val resultCode: String,
//    val reason: String,
//    val result: NewsResult,
//    val errorCode: Int
//)


data class News(val title: String, val comment: String, val imageUrl: String)

val newsList = listOf(
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ),
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ), News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ),
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ),
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ),
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ), News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    ),
    News(
        "全球连线｜中国印象：越洋求学 见证中国电商加速发展",
        "2022-07-25",
        "https://p1.img.cctvpic.com/photoworkspace/2022/07/25/2022072517150670955.gif"
    ),
    News(
        "上海：入住旅游住宿行业场所 均需提供48小时核酸阴性证明",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2021/10/27/2021102710002599051.jpg"
    ),
    News(
        "阿媒文章：美国自命“全球领袖”已不合时宜",
        "2022-07-25",
        "https://p5.img.cctvpic.com/photoworkspace/2022/07/25/2022072517083297047.jpg"
    ),
    News(
        "上海：7月26日零时起 6个高、中风险区解除管控",
        "2022-07-25",
        "https://p3.img.cctvpic.com/photoworkspace/2022/07/25/2022072517054766837.jpg"
    ),
    News(
        "北约——危害世界和平的“疯狂战车”",
        "2022-07-25",
        "https://p4.img.cctvpic.com/photoworkspace/2022/07/25/2022072517040018677.jpg"
    )
)