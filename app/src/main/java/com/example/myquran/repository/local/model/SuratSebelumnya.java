package com.example.myquran.repository.local.model;

import com.google.gson.annotations.SerializedName;

public class SuratSebelumnya{

	@SerializedName("jumlahAyat")
	private int jumlahAyat;

	@SerializedName("nama")
	private String nama;

	@SerializedName("nomor")
	private int nomor;

	@SerializedName("namaLatin")
	private String namaLatin;

	public int getJumlahAyat(){
		return jumlahAyat;
	}

	public String getNama(){
		return nama;
	}

	public int getNomor(){
		return nomor;
	}

	public String getNamaLatin(){
		return namaLatin;
	}
}