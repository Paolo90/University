from pychart import *
theme.get_options()

# We have 10 sample points total.  The first value in each tuple is
# the X value, and subsequent values are Y values for different lines.
data = [(10, 20, 30), (20, 65, 33),
        (30, 55, 30), (40, 45, 51),
        (50, 25, 27), (60, 75, 30),
        (70, 80, 42), (80, 62, 32),
        (90, 42, 39), (100, 32, 39)]
size=(300,200)
# The format attribute specifies the text to be drawn at each tick mark.
# Here, texts are rotated -60 degrees ("/a-60"), left-aligned ("/hL"),
# and numbers are printed as integers ("%d").
xaxis = axis.X(format="%d", tic_interval = 20, label="Porchetta")
yaxis = axis.Y(format="%d",tic_interval = 20,label="Vomito")

# Define the drawing area. "y_range=(0,None)" tells that the Y minimum
# is 0, but the Y maximum is to be computed automatically. Without
# y_ranges, Pychart will pick the minimum Y value among the samples,
# i.e., 20, as the base value of Y axis.
ar = area.T(size=size,x_axis=xaxis, y_axis=yaxis, y_range=(0,None),x_range=(0,None))

# The first plot extracts Y values from the 2nd column
# ("ycol=1") of DATA ("data=data"). X values are takes from the first
# column, which is the default.

plot = line_plot.T(label="foo", data=data, ycol=1, tick_mark=tick_mark.star)
ar.add_plot(plot)

# The call to ar.draw() usually comes at the end of a program.  It
# draws the axes, the plots, and the legend (if any).

ar.draw()
yyaxis = axis.Y(offset=300, tic_len=-6,label_offset=(50, 0),label="Vino")
ar = area.T(size=size, y_axis=yyaxis, y_range=(0,None))
plot2 = line_plot.T(label="bar", data=data, ycol=2, tick_mark=tick_mark.square)
ar.add_plot(plot2)
ar.draw()
