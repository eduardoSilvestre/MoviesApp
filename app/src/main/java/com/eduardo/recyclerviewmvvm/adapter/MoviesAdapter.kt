package com.eduardo.recyclerviewmvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.eduardo.recyclerviewmvvm.model.Movie
import com.eduardo.recyclerviewmvvm.R
import com.eduardo.recyclerviewmvvm.databinding.RecyclerviewMovieBinding

class MoviesAdapter (private val movies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MoviesViewHolder(
      DataBindingUtil.inflate(
          LayoutInflater.from(parent.context),
          R.layout.recyclerview_movie,
          parent,
          false
      )
    )

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.recyclerViewMovieBinding.movie = movies[position]
    }

    inner class MoviesViewHolder(
        val recyclerViewMovieBinding: RecyclerviewMovieBinding
    ) : RecyclerView.ViewHolder(recyclerViewMovieBinding.root){

    }
}