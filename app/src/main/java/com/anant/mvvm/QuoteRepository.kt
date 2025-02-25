package com.anant.mvvm

import androidx.lifecycle.LiveData

class QuoteRepository(val quoteDao: QuoteDao) {
    fun getQuotes():LiveData<List<Quote>>{
        return quoteDao.getQuotes()
    }

    suspend fun insertQuote(quote: Quote){

        quoteDao.insertQuote(quote)

    }
}