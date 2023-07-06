package com.example.superheroapp.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.superheroapp.databinding.ItemSuperheroBinding
import com.example.superheroapp.data.model.SuperHeroItemResponse
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(val binding: ItemSuperheroBinding) :
    RecyclerView.ViewHolder(binding.root) {

        fun bind(superheroItemResponse: SuperHeroItemResponse, onItemSelected:(String) -> Unit){
            binding.tvSuperHeroName.text = superheroItemResponse.name
            Picasso.get().load(superheroItemResponse.superHeroImage.url).into(binding.ivSuperHero)
            binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }
        }
}