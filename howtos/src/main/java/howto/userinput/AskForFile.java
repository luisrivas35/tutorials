/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     https://creativecommons.org/publicdomain/zero/1.0/
 */

package howto.userinput;

import net.imagej.ImageJ;

import java.io.File;

/**
 * How to ask the user for a file
 *
 * @author Deborah Schmidt
 */
public class AskForFile {

	private static void run() {
		ImageJ ij = new ImageJ();
		File chosenFile = ij.ui().chooseFile(ij.getApp().getBaseDirectory(), "");
		System.out.println(chosenFile.getAbsolutePath());
	}

	public static void main(String...args) { run(); }

}
