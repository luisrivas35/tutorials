/*
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 *
 * See the CC0 1.0 Universal license for details:
 *     http://creativecommons.org/publicdomain/zero/1.0/
 *
 * This work was supported by the German Research Foundation (DFG) under the code JU3110/1-1 (Fiji Software Sustainability).
 */

package howto.displays;

import net.imagej.ImageJ;
import org.scijava.ui.DialogPrompt;

/**
 * How to display a warning
 *
 * @author Deborah Schmidt
 */
public class DisplayWarning {

	private static void run() {
		ImageJ ij = new ImageJ();
		// TODO this looks the same as a plain message with legacy dependency
		ij.ui().showDialog("This is a warning", DialogPrompt.MessageType.WARNING_MESSAGE);
		ij.context().dispose();
	}

	public static void main(String...args) {
		run();
	}

}
