package com.farid.yjahzapplication.ui.navigation.home.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.DataXX
import com.farid.yjahzapplication.databinding.PopularNowRecyclerItemBinding
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.PopularNowRecyclerItemClickListener

class PopularNowRecyclerAdapter(private var myList: List<DataXX> = listOf()) :
    RecyclerView.Adapter<PopularNowRecyclerAdapter.ViewHolder>() {

    var popularNowArrayList: List<DataXX> = ArrayList()

    private val popularNowArrayListFull: List<DataXX> = ArrayList(myList)

    var isArabicLanguage: Boolean = false
    private var parent: ViewGroup? = null
    var popularNowRecyclerItemClickListener: PopularNowRecyclerItemClickListener? = null


    init {
        this.popularNowArrayList = myList
    }

    fun submitMyList(
        myList: List<DataXX>,
        popularNowRecyclerItemClickListener: PopularNowRecyclerItemClickListener
    ) {
        this.popularNowArrayList = myList
        this.popularNowRecyclerItemClickListener = popularNowRecyclerItemClickListener

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularNowRecyclerAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: PopularNowRecyclerItemBinding =
            PopularNowRecyclerItemBinding.inflate(layoutInflater, parent, false)
        this.parent = parent
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PopularNowRecyclerAdapter.ViewHolder, position: Int) {

        holder.binding.itemName.text = popularNowArrayList[position].name
        Glide.with(parent!!.context).load(popularNowArrayList[position].image)
            .centerCrop().into(holder.binding.itemImageView)


        holder.binding.categoryContainer.setOnClickListener {
            popularNowRecyclerItemClickListener?.onPopularNowItemClickListener(position)
        }

    }

    override fun getItemCount(): Int {
        return popularNowArrayList.size
    }

    override fun getItemId(position: Int): Long {
        val itemID: Int = popularNowArrayListFull.indexOf(popularNowArrayList[position]) ?: position
        return itemID.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return popularNowArrayListFull.indexOf(popularNowArrayList[position]) ?: position
    }

    inner class ViewHolder(var binding: PopularNowRecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }




}