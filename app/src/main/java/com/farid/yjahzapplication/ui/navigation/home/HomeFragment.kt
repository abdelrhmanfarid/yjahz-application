package com.farid.yjahzapplication.ui.navigation.home


import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.farid.yjahzapplication.R
import com.farid.yjahzapplication.base.BaseFragment
import com.farid.yjahzapplication.data.model.responseModels.home.homeBaseResponse.DataX
import com.farid.yjahzapplication.data.model.responseModels.home.popularSellersResponse.DataXX
import com.farid.yjahzapplication.databinding.FragmentHomeBinding
import com.farid.yjahzapplication.ui.navigation.home.adapter.CategoriesRecyclerAdapter
import com.farid.yjahzapplication.ui.navigation.home.adapter.PopularNowRecyclerAdapter
import com.farid.yjahzapplication.ui.navigation.home.adapter.TrendingNowRecyclerAdapter
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.CategoriesRecyclerClickListener
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.PopularNowRecyclerItemClickListener
import com.farid.yjahzapplication.ui.navigation.home.clickEvents.TrendingNowRecyclerItemClickListener
import com.farid.yjahzapplication.utils.LiveDataResource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>(),
    CategoriesRecyclerClickListener, PopularNowRecyclerItemClickListener,TrendingNowRecyclerItemClickListener {


    private var categoriesRecyclerAdapter: CategoriesRecyclerAdapter? = null
    private var popularNowRecyclerAdapter: PopularNowRecyclerAdapter? = null
    private var trendingNowRecyclerAdapter: TrendingNowRecyclerAdapter? = null
    override fun getContentView(): Int {
        return R.layout.fragment_home
    }

    override fun initializeViewModel() {
        baseViewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
    }

    override fun onClick(v: View?) {
        when (v) {
            baseViewBinding.backImage -> {
                findNavController().popBackStack()
            }

        }
    }

    override fun initView() {
        baseViewBinding.backImage.setOnClickListener(this)

        baseViewModel!!.getHomeBaseCategories()
        baseViewModel!!.getPopularSellers()
        baseViewModel!!.getTrendingSellers()
    }

    override fun subscribeLiveData() {
        observeHomeBaseCategories()
        observeHomePopularSellers()
        observeHomeTrendingSellers()
    }


    private fun observeHomeBaseCategories() {
        lifecycleScope.launch {
            baseViewModel!!.homeBaseCategoriesLiveDate.collect {
                when (it) {
                    is LiveDataResource.Success -> {
                        Log.d("test", "home success")
                        it.data?.data?.let { it1 ->
                            initCategoriesRecycler(
                                it1.data,
                                baseViewBinding.categoriesRecyclerView
                            )
                        }
                    }

                    is LiveDataResource.ErrorResponse -> {
                        Log.d("test", "home ErrorResponse")
                    }

                    is LiveDataResource.Exception -> {
                        Log.d("test", "home Exception")
                    }

                    is LiveDataResource.Loading -> {
                        Log.d("test", "home Loading")
                    }

                    is LiveDataResource.NoNetwork -> {
                        Log.d("test", "home NoNetwork")
                    }

                    else -> {}
                }
            }
        }
    }

    private fun observeHomePopularSellers() {
        lifecycleScope.launch {
            baseViewModel!!.homePopularSellersLiveData.collect {
                when (it) {
                    is LiveDataResource.Success -> {
                        Log.d("test", "popular success")
                        it.data?.data?.let { it1 ->
                            initPopularNowRecycler(
                                it1.data,
                                baseViewBinding.popularNowRecyclerView
                            )
                        }
                    }

                    is LiveDataResource.ErrorResponse -> {
                        Log.d("test", "popular ErrorResponse")
                    }

                    is LiveDataResource.Exception -> {
                        Log.d("test", "popular Exception")
                    }

                    is LiveDataResource.Loading -> {
                        Log.d("test", "popular Loading")
                    }

                    is LiveDataResource.NoNetwork -> {
                        Log.d("test", "popular NoNetwork")
                    }

                    else -> {}
                }
            }
        }
    }

    private fun observeHomeTrendingSellers() {
        lifecycleScope.launch {
            baseViewModel!!.homeTrendingSellersLiveData.collect {
                when (it) {
                    is LiveDataResource.Success -> {
                        Log.d("ggggggggggggg", "TrendingSellers success")
                        it.data?.data?.let { it1 ->

                            Log.d("ggggggggggggg",it1.toString())
                            initTrendingNowRecycler(
                                it1.data,
                                baseViewBinding.trendingNowRecyclerView
                            )
                        }
                    }

                    is LiveDataResource.ErrorResponse -> {
                        Log.d("test", "TrendingSellers ErrorResponse")

                    }

                    is LiveDataResource.Exception -> {
                        Log.d("test", "TrendingSellers Exception")
                    }

                    is LiveDataResource.Loading -> {
                        Log.d("test", "TrendingSellers Loading")
                    }

                    is LiveDataResource.NoNetwork -> {
                        Log.d("test", "TrendingSellers NoNetwork")
                    }

                    else -> {}
                }
            }
        }
    }


    private fun initCategoriesRecycler(
        categoriesList: List<DataX>,
        recyclerView: RecyclerView
    ) {
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        categoriesRecyclerAdapter = CategoriesRecyclerAdapter().apply {
            submitMyList(categoriesList, this@HomeFragment)
        }
        recyclerView.visibility = View.VISIBLE
        recyclerView.adapter = categoriesRecyclerAdapter
        recyclerView.startLayoutAnimation()

    }

    private fun initPopularNowRecycler(
        popularList: List<DataXX>,
        recyclerView: RecyclerView
    ) {
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        popularNowRecyclerAdapter = PopularNowRecyclerAdapter().apply {
            submitMyList(popularList, this@HomeFragment)
        }
        recyclerView.visibility = View.VISIBLE
        recyclerView.adapter = popularNowRecyclerAdapter
        recyclerView.startLayoutAnimation()

    }

    private fun initTrendingNowRecycler(
        trendingNowList: List<com.farid.yjahzapplication.data.model.responseModels.home.trendingSellersResponse.DataX>,
        recyclerView: RecyclerView
    ) {
        recyclerView.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL,
            false
        )

        trendingNowRecyclerAdapter = TrendingNowRecyclerAdapter().apply {
            submitMyList(trendingNowList, this@HomeFragment)
        }
        recyclerView.visibility = View.VISIBLE
        recyclerView.adapter = trendingNowRecyclerAdapter
        recyclerView.startLayoutAnimation()

    }

    override fun onCategoryClickListener(position: Int) {

    }

    override fun onPopularNowItemClickListener(position: Int) {

    }

    override fun onTrendingNowRecyclerItemClickListener(position: Int) {

    }


}