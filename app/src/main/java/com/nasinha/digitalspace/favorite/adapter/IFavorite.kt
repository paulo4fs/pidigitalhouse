package com.nasinha.digitalspace.favorite.adapter

import android.widget.ImageView
import com.google.android.material.card.MaterialCardView
import com.nasinha.digitalspace.favorite.entity.FavoriteEntity

interface IFavorite {
    fun iFavoriteDelete(position: Int, favorite: FavoriteEntity, cardView: MaterialCardView)
    fun iFavoriteShare(favorite: FavoriteEntity, imageView: ImageView)
}