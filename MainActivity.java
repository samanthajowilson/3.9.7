penUp();
for (var i = 0; i < 3000; i++) {
  penRGB(randomNumber(0,255), randomNumber(0,255), randomNumber(0,255), 0.5);
  moveTo(randomNumber(0,320), randomNumber(0,450));
  dot(randomNumber(1,20));
}
for (var i = 0; i < 5000; i++) {
  penRGB(255, 255, 255, 0.5);
  moveTo(randomNumber(0,320), randomNumber(0,450));
  dot(randomNumber(1,20));
}
