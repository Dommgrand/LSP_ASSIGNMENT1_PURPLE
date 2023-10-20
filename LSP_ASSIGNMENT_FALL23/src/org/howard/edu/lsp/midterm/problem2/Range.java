package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }
//represents a range with start and end values
    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }
//checks if current range overlaps with current range
    public boolean doRangesOverlap(Range otherRange) {
        return this.start <= otherRange.end && otherRange.start <= this.end;
    }
//returns the number of integers
    public int size() {
        return Math.abs(end - start) + 1;
    }
//get start of range
    public int getStart() {
        return start;
    }
//get end of range
    public int getEnd() {
        return end;
    }
}