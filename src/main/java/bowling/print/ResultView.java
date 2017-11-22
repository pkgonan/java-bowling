package bowling.print;

import java.util.List;

import bowling.model.Frame;

public class ResultView {

	private void blank(int count) {
		for (int i = 0; i < count; i++) {
			System.out.printf("%5s|", "");
		}
	}

	private void name(String name) {
		System.out.printf("\n| %4s |", name);
	}
	
	public void status(List<Frame> frames, String name) {
		frame();
		name(name);
		for (Frame frame : frames) {
			System.out.printf("%-5s|", frame.getStatus());
		}
		blank(10 - frames.size());
	}

	private void frame() {
		System.out.printf("| %4s |", "NAME");
		for (int i = 1; i < 11; i++) {
			System.out.printf(" %02d  ", i);
			System.out.print("|");
		}
	}
}
