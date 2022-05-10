package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/9
 */
public class task3_3 {

  public static void main(String[] args) {

  }

  static class Building {

    private String name;
    private int totalFloors;
    private int totalArea;

    public Building(String name, int totalFloors, int totalArea) {
      this.name = name;
      this.totalFloors = totalFloors;
      this.totalArea = totalArea;
    }
  }

  static class TeachingBuilding extends Building {

    private String name;
    private int area;
    private int tableNumber;
    private int floors;
    private String studentUseType;
    private boolean isMultimedia;

    public TeachingBuilding(String name, int totalFloors, int totalArea, String name1, int area,
        int tableNumber, int floors, String studentUseType, boolean isMultimedia) {
      super(name, totalFloors, totalArea);
      this.name = name1;
      this.area = area;
      this.tableNumber = tableNumber;
      this.floors = floors;
      this.studentUseType = studentUseType;
      this.isMultimedia = isMultimedia;
    }
  }

  static class ExperimentBuilding extends Building {

    private String name;
    private String useType;
    private int area;
    private int floors;
    private String useStudentType;
    private int equipmentNumber;

    public ExperimentBuilding(String name, int totalFloors, int totalArea, String name1,
        String useType, int area, int floors, String useStudentType, int equipmentNumber) {
      super(name, totalFloors, totalArea);
      this.name = name1;
      this.useType = useType;
      this.area = area;
      this.floors = floors;
      this.useStudentType = useStudentType;
      this.equipmentNumber = equipmentNumber;
    }
  }

  static class OfficeBuilding extends Building {

    private String name;
    private int area;
    private String useUnit;
    private int floors;
    private int equipmentNumber;

    public OfficeBuilding(String name, int totalFloors, int totalArea, String name1, int area,
        String useUnit, int floors, int equipmentNumber) {
      super(name, totalFloors, totalArea);
      this.name = name1;
      this.area = area;
      this.useUnit = useUnit;
      this.floors = floors;
      this.equipmentNumber = equipmentNumber;
    }
  }
}
