package GangOfFour.Facade.Shapes;

class Square implements Shape {
    @Override
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder("Square::draw(");
        sb.append(String.join(", ", arguments));
        sb.append(")");
        System.out.println(sb.toString());
    }
}
