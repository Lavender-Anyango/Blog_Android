package com.akirachix.myblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AuthorsAdapter(val authorsList: List<Authors>): RecyclerView.Adapter<AuthorsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_list_item, parent, false)
        return  AuthorsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return authorsList.size
    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
       var author = authorsList[position]
        holder.tvName.text =author.name
        holder.tvLink.text = author.link
        holder.tvArticleName.text = author.articleName
        holder.tvPublishDate.text = author .publishDate
        holder.tvArticlePreview.text = author.articlePreview
    }


}

class AuthorsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    //    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
//    var ivAvatar =itemView.findViewById<TextView>(R.id.ivAvatar)
    var tvName:TextView = itemView.findViewById(R.id.tvAuthor)
    var tvArticleName:TextView = itemView.findViewById(R.id.tvTitle)
    var tvPublishDate:TextView = itemView.findViewById(R.id.tvPublishDate)
    var tvArticlePreview:TextView = itemView.findViewById(R.id.tvArticlePreview)
    var tvLink:TextView = itemView.findViewById(R.id.tvLink)
    var tvPic:ImageView = itemView.findViewById(R.id.tvArticlePic)
}