package edu.temple.imageactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter(_images: Array<ImageObject>, _myRecyclerViewFunc: (ImageObject) -> Unit) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>(){

    val cityPics = _images
    val recyclerViewFunc = _myRecyclerViewFunc

    inner class ImageViewHolder(_view: View) : RecyclerView.ViewHolder(_view){
        val thumbnailImageView : ImageView = _view.findViewById<ImageView>(R.id.thumbnail_layout)

        lateinit var imageObject: ImageObject
        init {
            _view.setOnClickListener{recyclerViewFunc(imageObject)}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.thumbnail_image_view_layout, parent, false)
        return ImageViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ImageAdapter.ImageViewHolder, position: Int) {
        holder.thumbnailImageView.setImageResource(cityPics[position].resourceId)
        holder.imageObject = cityPics[position]
    }

    override fun getItemCount(): Int {
        return cityPics.size
    }
}