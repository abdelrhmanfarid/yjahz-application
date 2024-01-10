package com.farid.yjahzapplication.ui.navigation.home.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX
import com.farid.yjahzapplication.databinding.TrendingNowRecyclerItemBinding
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener

class TrendingNowRecyclerAdapter(private var myList: List<DataX> = listOf()) :
    RecyclerView.Adapter<TrendingNowRecyclerAdapter.ViewHolder>() {

    var trendingNowArrayList: List<DataX> = ArrayList()

    private val trendingNowArrayListFull: List<DataX> = ArrayList(myList)

    var isArabicLanguage: Boolean = false
    private var parent: ViewGroup? = null
    var trendingNowRecyclerItemClickListener: TrendingNowRecyclerItemClickListener? = null


    init {
        this.trendingNowArrayList = myList
    }

    fun submitMyList(
        myList: List<DataX>,
        trendingNowRecyclerItemClickListener: TrendingNowRecyclerItemClickListener
    ) {
        this.trendingNowArrayList = myList
        this.trendingNowRecyclerItemClickListener = trendingNowRecyclerItemClickListener

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TrendingNowRecyclerAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: TrendingNowRecyclerItemBinding =
            TrendingNowRecyclerItemBinding.inflate(layoutInflater, parent, false)
        this.parent = parent
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: TrendingNowRecyclerAdapter.ViewHolder, position: Int) {


        Glide.with(parent!!.context).load(trendingNowArrayListFull[position].image)
            .centerCrop().into(holder.binding.logoImageview)

        holder.binding.name.text = trendingNowArrayListFull[position].name
        holder.binding.container.setOnClickListener {
            trendingNowRecyclerItemClickListener?.onTrendingNowRecyclerItemClickListener(position)
        }

    }

    override fun getItemCount(): Int {
        return trendingNowArrayListFull.size
    }

    override fun getItemId(position: Int): Long {
        val itemID: Int = trendingNowArrayListFull.indexOf(trendingNowArrayList[position]) ?: position
        return itemID.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return trendingNowArrayListFull.indexOf(trendingNowArrayList[position]) ?: position
    }

    inner class ViewHolder(var binding: TrendingNowRecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }




}