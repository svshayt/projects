package com.svshayt.problems.string;

public class Id1678GoalParserInterpretation {
    public String interpret(String command) {
        var result = new StringBuilder("");
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                result.append("G");
            } else if (command.charAt(i + 1) == 'a') {
                result.append("al");
                i += 3;
            } else {
                result.append("o");
                i += 1;
            }
        }
        return result.toString();
    }
    public String interpret2(String command) {
        command = command.replace("(al)", "al");
        command = command.replace("()", "o");
        return command;
    }
}
