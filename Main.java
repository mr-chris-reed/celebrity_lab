class Main {
  public static void main(String[] args) {
    Celebrity celeb1 = new Celebrity("Adam Sandler", "famous actor");
    Celebrity celeb2 = new Celebrity();

    System.out.println(celeb1.toString());
    System.out.println(celeb2.toString());
  }
}