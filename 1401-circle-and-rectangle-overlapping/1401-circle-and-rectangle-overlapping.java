class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // boolean a = xCenter>=x1 && xCenter<=x2;
        // boolean b = (xCenter+radius)>=x1 && (xCenter+radius)<=x2;
        // boolean c = (xCenter-radius)>=x1 && (xCenter-radius)<=x2;

        // boolean a1 = yCenter>=y1 && yCenter<=y2;
        // boolean b1 = (yCenter+radius)>=y1 && (yCenter+radius)<=y2;
        // boolean c1 = (yCenter-radius)>=y1 && (yCenter-radius)<=y2;

        // return (a||b||c) && (a1||b1||c1);
        int closeX = Math.max(x1, Math.min(xCenter, x2));
        int closeY = Math.max(y1, Math.min(yCenter, y2));

        int dx = xCenter-closeX;
        int dy = yCenter-closeY;

        return ((dx*dx) + (dy*dy)) <= radius*radius;
    }
}