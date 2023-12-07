package GangOfFour.Facade.Shapes;

class Circle implements Shape {
    @Override
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder("Circle::draw(");
        sb.append(String.join(", ", arguments));
        sb.append(")");
        System.out.println(sb.toString());
    }
}