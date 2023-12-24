function solution(keyinput, board) {
    const [width, height] = board;
    const centerX = Math.floor(width / 2);
    const centerY = Math.floor(height / 2);
    let curX = 0, curY = 0;

    for (const key of keyinput) {
        if (key === 'left' && curX > -centerX) {
            curX--;
        } else if (key === 'right' && curX < centerX) {
            curX++;
        } else if (key === 'up' && curY < centerY) {
            curY++;
        } else if (key === 'down' && curY > -centerY) {
            curY--;
        }
    }

    return [curX, curY];
}
