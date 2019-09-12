package com.jai;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

	private static final long serialVersionUID = -8904307806124877375L;

	private static volatile Singleton INSTANCE = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null)
					INSTANCE = new Singleton();
			}
		}
		return INSTANCE;
	}

	protected Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
}
