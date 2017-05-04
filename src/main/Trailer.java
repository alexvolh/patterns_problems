package main;

/**
 *
 */
public class Trailer {
    public static Integer MAX_CARRYING_CAPACITY = 150;

    private Double width;
    private Double length;
    private Double boardHeight;
    //Некие технические характеристики
    private String axis;
    private String neap;
    private String color;

    public Trailer(Double width, Double length, Double boardHeight, String axis, String neap, String color) {
        this.width = width;
        this.length = length;
        this.boardHeight = boardHeight;

        this.axis = axis;
        this.neap = neap;
        this.color = color;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }

    public Double getBoardHeight() {
        return boardHeight;
    }

    public String getAxis() {
        return axis;
    }

    public String getNeap() {
        return neap;
    }

    public String getColor() {
        return color;
    }
}
