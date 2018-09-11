JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	NameDatabase.java \
	SkipListNode.java \
	SkipList.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class