package com.farid.yjahzapplication.ui.navigation.home.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX
import com.farid.yjahzapplication.databinding.HomeCategoriesRecyclerItemBinding
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener

class CategoriesRecyclerAdapter(private var myList: List<DataX> = listOf()) :
    RecyclerView.Adapter<CategoriesRecyclerAdapter.ViewHolder>() {

    var categoriesArrayList: List<DataX> = ArrayList()

    private val categoriesArrayListFull: List<DataX> = ArrayList(myList)

    var isArabicLanguage: Boolean = false
    private var parent: ViewGroup? = null
    var categoriesRecyclerClickListener: CategoriesRecyclerClickListener? = null


    init {
        this.categoriesArrayList = myList
    }

    fun submitMyList(
        myList: List<DataX>,
        categoriesRecyclerClickListener: CategoriesRecyclerClickListener
    ) {
        this.categoriesArrayList = myList
        this.categoriesRecyclerClickListener = categoriesRecyclerClickListener

        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesRecyclerAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding: HomeCategoriesRecyclerItemBinding =
            HomeCategoriesRecyclerItemBinding.inflate(layoutInflater, parent, false)
        this.parent = parent
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: CategoriesRecyclerAdapter.ViewHolder, position: Int) {

        holder.binding.categoryName.text = categoriesArrayList[position].name
        Glide.with(parent!!.context).load(categoriesArrayList[position].image)
            .centerCrop().into(holder.binding.categoryImageView)


        holder.binding.categoryContainer.setOnClickListener {
            categoriesRecyclerClickListener?.onCategoryClickListener(position)
        }

    }

    override fun getItemCount(): Int {
        return categoriesArrayList.size
    }

    override fun getItemId(position: Int): Long {
        val itemID: Int = categoriesArrayListFull.indexOf(categoriesArrayList[position]) ?: position
        return itemID.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return categoriesArrayListFull.indexOf(categoriesArrayList[position]) ?: position
    }

    inner class ViewHolder(var binding: HomeCategoriesRecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


    }




}