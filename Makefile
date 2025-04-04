# Variables
NAME = srcs.Main
SRC_DIR = srcs
BIN_DIR = bin
# SOURCES = $(SRC_DIR)/*.java
SOURCES = $(shell find $(SRC_DIR) -name "*.java")
SOURCES_AIRCRAFT = $(SRC_DIR)/aircraft/*.java
FILE = srcs/scenario.txt

all: compile run

compile:
	@mkdir -p $(BIN_DIR)
	javac -d $(BIN_DIR) $(SOURCES) 

run: 
	java -cp $(BIN_DIR) $(NAME) $(FILE)

clean:
	rm -rf $(BIN_DIR)

re: clean all