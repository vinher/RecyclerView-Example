package com.example.affirmations_list.data

import com.example.affirmations_list.R
import com.example.affirmations_list.model.Affirmation

class Datasource {
    fun loadAffirmations():List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.element1 , R.drawable.image1),
            Affirmation(R.string.element2 , R.drawable.image2),
            Affirmation(R.string.element3 , R.drawable.image3),
            Affirmation(R.string.element4 , R.drawable.image4),
            Affirmation(R.string.element5 , R.drawable.image5),
            Affirmation(R.string.element6 , R.drawable.image6),
            Affirmation(R.string.element7 , R.drawable.image7),
            Affirmation(R.string.element8 , R.drawable.image8),
            Affirmation(R.string.element9 , R.drawable.image9),
            Affirmation(R.string.element10 ,R.drawable.image10),
        )
    }

}