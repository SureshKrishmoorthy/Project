package com.FullCreative.intern;

import java.io.IOException;
import java.sql.SQLException;

public class Exception5 {
	public static void main(String[] args) {
		System.out.println("Planned stop");
		try {
			throw new SQLException();

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				throw new IOException();
			} catch (IOException a) {
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.gc();
		}
		System.out.println("planned stop");
	}
}
