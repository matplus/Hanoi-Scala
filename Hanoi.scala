object Hanoi {
	def move(discno: Int, from: String, to: String) {
		println(s"Move disc $discno from $from to $to.")
	}

	def dohanoi(discno: Int, from: String, to: String, work: String) {
		if (discno == 1) {
			move(discno, from, to)
		} else {
			dohanoi(discno - 1, from, work, to)
			move(discno, from, to)
			dohanoi(discno - 1, work, to, from)
		}
	}

	def hanoi(discno: Int) {
		dohanoi(discno, "from-pole", "to-pole", "work-pole")
	}

	def main(args: Array[String]) {
		if (args.length != 1) {
			System.err.println("Usage: Hanoi discs")
			sys.exit(1)
		}

		var discno = args(0).toInt
		if (discno < 1) {
			System.err.println(s"Invalid value ($discno).")
			sys.exit(1)
		}

		hanoi(discno)
	}
}
