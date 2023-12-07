package GangOfFour.Facade.Shapes;

class Rectangle implements Shape {
    @Override
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder("Rectangle::draw(");
        sb.append(String.join(", ", arguments));
        sb.append(")");
        System.out.println(sb.toString());
    }
}

