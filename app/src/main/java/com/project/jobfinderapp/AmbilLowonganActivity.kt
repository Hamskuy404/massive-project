package com.project.jobfinderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.project.jobfinderapp.*
import com.project.jobfinderapp.data.MainRepository
import com.project.jobfinderapp.MainHomeActivity
import com.project.jobfinderapp.R
import com.project.jobfinderapp.databinding.ActivityAmbilLowonganBinding

class AmbilLowonganActivity : AppCompatActivity() {

        private lateinit var viewModel: MainViewModel
        private lateinit var binding: ActivityAmbilLowonganBinding
        val btnKirimLamaran = findViewById<Button>(R.id.btn_kirimlamaran)

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambil_lowongan)

        btnKirimLamaran.setOnClickListener {
            val intent = Intent(this, LowonganSentActivity::class.java)
            startActivity(intent)
        }


        /*initComponents()

        getUploadResult()*/
    }

    /*private fun getUploadResult() {
        viewModel.state.observe(this, Observer { state ->
            when (state) {
                UPLOADED -> {
                    Toast.makeText(this, getString(R.string.success_message), Toast.LENGTH_SHORT)
                        .show()
                    viewModel.onStateSet()
                }
                FAILED -> {
                    Toast.makeText(
                        this, getString(R.string.error_message), Toast.LENGTH_SHORT
                    ).show()
                    viewModel.onStateSet()
                }
            }
        })
    }

    private fun initComponents() {

        // ViewModel
        val repository = MainRepository()
        val factory =
            MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)

        // ClickListeners
        binding.btnUploadPdf.setOnClickListener { uploadPdf() }


        // This is used so that databinding can observe the LiveData
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK) {
            when (requestCode) {
                PDF -> uploadData(data)
                DOCX -> uploadData(data)
                AUDIO -> uploadData(data)
                VIDEO -> uploadData(data)
                IMAGE -> uploadData(data)
            }
        }
    }

    private fun uploadData(data: Intent?) {
        data?.let {
            viewModel.upload(data.data!!)
        }
    }

    private fun uploadPdf() {
        viewModel.clearText()
        Intent(Intent.ACTION_GET_CONTENT).apply {
            type = "application/pdf"
            startActivityForResult(Intent.createChooser(this, "Select a PDF to upload"),
                PDF
            )
        }
    }*/

}