//package com.stepan.mytestwork
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.mymemeapp.data.repository.HotelRepository
//import com.stepan.mytestwork.model.hotel.hotelscreen
//import kotlinx.coroutines.launch
//class HotelViewModel(private val repository: HotelRepository) : ViewModel() {
//
//    private val _hotels = MutableLiveData<List<hotelscreen>>()
//    val hotels: LiveData<List<hotelscreen>> = _hotels
//
//    init {
//        viewModelScope.launch {
//            _hotels.value = repository.getHotel()
//        }
//    }
//
//}