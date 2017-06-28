package me.lumpchen.xafp.sf.triplet;

import java.io.IOException;

import me.lumpchen.xafp.AFPInputStream;

public class X46Triplet extends Triplet {

	public static final int ID = 0x46;
	
	public X46Triplet() {
		super();
		this.identifier = ID;
	}
	
	@Override
	protected void readContents(AFPInputStream in) throws IOException {
		int remain = this.length - 2;
		while (remain > 0) {
			in.readBytes(remain);
			remain = 0;
		}
	}

}