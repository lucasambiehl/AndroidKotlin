package com.example.androidkotlin.injection

import com.example.androidkotlin.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }
}