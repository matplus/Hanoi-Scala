.SUFFIXES: .class .scala
.PHONY: clean

SCALAC=scalac
TARGET=Hanoi.class

all: ${TARGET}

.scala.class:
	$(SCALAC) $<

clean:
	-rm -f *.class
