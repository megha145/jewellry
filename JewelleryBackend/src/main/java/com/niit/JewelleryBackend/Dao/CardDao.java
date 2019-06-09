package com.niit.JewelleryBackend.Dao;

import java.util.List;

import com.niit.JewelleryBackend.Model.Card;

public interface CardDao 
{
	public boolean saveorupdate(Card card);
	public boolean delete(Card card);
	public Card getCard(String cardId);
	public List<Card> cardlist();

}
