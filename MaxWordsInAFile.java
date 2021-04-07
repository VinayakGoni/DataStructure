package com.infosys.lex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MaxWordsInAFile {

	public static void main(String[] args) {

		// String expected_value = "Hello, world!";
		String file = "src/fileTest.txt";

		BufferedReader reader;
		Map<String, Integer> hashMap = new HashMap<>();
		try {
			reader = new BufferedReader(new FileReader(file));
			reader.lines().forEach(s -> {

				String[] arr = s.split(" ");
				for (String str : arr) {
					str = str.replace(",", " ");
					str = str.replace(".", " ");
					System.out.println(str);
					if (hashMap.get(str) == null) {
						hashMap.put(str, 1);
					} else {
						hashMap.put(str, hashMap.get(str) + 1);
					}
					// System.out.println(str);
				}
			});

			/*
			 * while (!reader.readLine().isBlank()) { currentLine = reader.readLine();
			 * System.out.println(currentLine); }
			 */
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int max = 0;
		String k = "";
		for (Map.Entry<String, Integer> hm : hashMap.entrySet()) {
			if (hm.getValue() > max) {
				max = hm.getValue();
				k = hm.getKey();
			}
		}
		System.out.println(k +" "+ max);

	}

}
