package com.mino.cleancoroutineshiltsample.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.mino.cleancoroutineshiltsample.R
import com.mino.cleancoroutineshiltsample.base.BaseActivity
import com.mino.cleancoroutineshiltsample.databinding.ActivityMainBinding
import com.mino.cleancoroutineshiltsample.view.adapter.MainAdapter
import com.mino.cleancoroutineshiltsample.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()
    private val mainAdapter: MainAdapter by lazy {
        MainAdapter { startLink(it) }
            .apply {
                setHasStableIds(true)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initViewModel()
    }

    private fun initViewModel() {
        viewModel.imageVoList.observe(this, {
            mainAdapter.setImageList(it)
        })
    }

    private fun initView() {
        binding.run {
            vm = viewModel
            rvContent.adapter = mainAdapter
            btSearch.setOnClickListener {
                viewModel.getImage(etSearch.text.toString())
            }
        }
    }

    private fun startLink(link: String) {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(link)))
    }
}