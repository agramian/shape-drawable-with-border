# ShapeDrawableWithBorder

Create a custom `ShapeDrawable` with a border.

See the included sample app for an example of a circle and a triangle with a border.

![Screenshot](/screenshots/shape-drawable-with-border.png?raw=true "Shape Drawable with Border")

### Including the dependency

`compile 'com.abtingramian:shapedrawablewithborder:0.1'`

### Usage

Below is a simple example of setting the background of the current view to a black oval (or circle depending on the view's dimensions) with a red border.

```
ShapeDrawableWithBorder circleShapeDrawable = new ShapeDrawableWithBorder(new OvalShape());
circleShapeDrawable.getPaint().setDither(true);
circleShapeDrawable.getPaint().setAntiAlias(true);
circleShapeDrawable.setStrokeColor(Color.parseColor("red"));
circleShapeDrawable.setStrokeWidth(20);
// set background
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
    setBackground(circleShapeDrawable);
} else {
    setBackgroundDrawable(circleShapeDrawable);
}
```
