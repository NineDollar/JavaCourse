package com.company.task2;

/**
 * @ClassName Task2_4
 * @Author NineDollar
 * @Date 2022/4/4 15:08
 * @Version 1.0
 * @Description TODO
 */
public class Task2_4 {

  public static void main(String[] args) {
    ComplexNumber complex1 = new ComplexNumber(177, 2);
    ComplexNumber complex2 = new ComplexNumber(16, 4);
    System.out.println(complex1 + "+" + complex2 + "=" + complex1.complexAdd(complex2));
    System.out.println(complex1 + "-" + complex2 + "=" + complex1.complexSub(complex2));
    System.out.println(complex1 + "*" + complex2 + "=" + complex1.complexMult(complex2));
    System.out.println(complex1 + "/" + complex2 + "=" + complex1.complexDiv(complex2));
  }

  public static class ComplexNumber {

    private int realPart;
    private int imagePart;

    public ComplexNumber() {
      realPart = 0;
      imagePart = 0;
    }

    public ComplexNumber(int realPart, int imagePart) {
      this.realPart = realPart;
      this.imagePart = imagePart;
    }

    public ComplexNumber complexAdd(ComplexNumber value) {
      return new ComplexNumber(this.realPart + value.realPart,
          this.imagePart + value.imagePart);
    }

    public ComplexNumber complexSub(ComplexNumber value) {
      return new ComplexNumber(this.realPart - value.realPart,
          this.imagePart - value.imagePart);
    }

    public ComplexNumber complexMult(ComplexNumber value) {
      return new ComplexNumber(this.realPart * value.realPart - this.imagePart * value.imagePart,
          this.imagePart * value.realPart + this.realPart * value.imagePart);
    }

    public ComplexNumber complexDiv(ComplexNumber value) {
      return new ComplexNumber(
          (int) ((this.realPart * value.realPart + this.imagePart * value.imagePart)
              / (Math.pow(value.realPart, 2) + Math.pow(value.imagePart, 2))),
          (int) ((this.imagePart * value.imagePart - this.realPart * value.imagePart)
              / (Math.pow(value.realPart, 2) + Math.pow(value.imagePart, 2))));

    }

    public int getRealPart() {
      return realPart;
    }

    public void setRealPart(int realPart) {
      this.realPart = realPart;
    }

    public int getImagePart() {
      return imagePart;
    }

    public void setImagePart(int imagePart) {
      this.imagePart = imagePart;
    }

    @Override
    public String toString() {
      return String.format("(%d%+di)", this.realPart, this.imagePart);
    }
  }
}
