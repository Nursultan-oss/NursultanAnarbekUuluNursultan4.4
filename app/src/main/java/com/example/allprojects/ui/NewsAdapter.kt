package com.example.allprojects.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.example.allprojects.R
import com.example.allprojects.databinding.ItemPagerBinding

class NewsAdapter(val  context: Context,val  navController: NavController) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    private  val list= arrayListOf("hello", "salam", "Privet")
    private  val text= arrayListOf("hello", "salam", "Privet")
    private  val image= arrayListOf(R.raw.lottiione,R.raw.lottiione,R.raw.lottiione )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
    return NewsViewHolder(ItemPagerBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount() = 3
    inner class NewsViewHolder(private  var binding: ItemPagerBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.textTitle.text = list[position]
            binding.textDesk.text = text[position]
            binding.lottie.setAnimation(image[position])
if (position==text.lastIndex){
    binding.btnStart.visibility= View.VISIBLE
}else{
    binding.btnStart.visibility=View.INVISIBLE

}
            binding.btnStart.setOnClickListener{
                navController.navigateUp()

            }
        }

    }

}