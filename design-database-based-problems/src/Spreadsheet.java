import java.util.*;

class Spreadsheet {

    private int[][] cells;

    public Spreadsheet(int rows) {
        cells = new int[rows][26]; // rows x 26 columns
    }

    public void setCell(String cell, int value) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1;
        cells[row][col] = value;
    }

    public void resetCell(String cell) {
        this.setCell(cell, 0);
    }

    public int getValue(String formula) {
        int idx = formula.indexOf('+');
        String left = formula.substring(1, idx);
        String right = formula.substring(idx + 1);

        int valLeft = Character.isLetter(left.charAt(0))
                ? cells[Integer.parseInt(left.substring(1)) - 1][left.charAt(0) - 'A']
                : Integer.parseInt(left);

        int valRight = Character.isLetter(right.charAt(0))
                ? cells[Integer.parseInt(right.substring(1)) - 1][right.charAt(0) - 'A']
                : Integer.parseInt(right);

        return valLeft + valRight;
    }

    // Driver to simulate input
    public static void main(String[] args) {
        String[] commands = {
                "Spreadsheet", "getValue", "setCell", "getValue",
                "setCell", "getValue", "resetCell", "getValue"
        };

        Object[][] arguments = {
                {3}, {"=5+7"}, {"A1", 10}, {"=A1+6"},
                {"B2", 15}, {"=A1+B2"}, {"A1"}, {"=A1+B2"}
        };

        Spreadsheet sheet = null;
        List<Object> output = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            String cmd = commands[i];

            switch (cmd) {
                case "Spreadsheet":
                    sheet = new Spreadsheet((int) arguments[i][0]);
                    output.add(null);
                    break;
                case "setCell":
                    sheet.setCell((String) arguments[i][0], (int) arguments[i][1]);
                    output.add(null);
                    break;
                case "resetCell":
                    sheet.resetCell((String) arguments[i][0]);
                    output.add(null);
                    break;
                case "getValue":
                    int val = sheet.getValue((String) arguments[i][0]);
                    output.add(val);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown command: " + cmd);
            }
        }

        System.out.println(output);
    }
}
